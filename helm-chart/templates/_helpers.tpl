{{- define "keptn-image-name" -}}
{{- $parts := split ":" .Values.image }}
{{- printf "%s" $parts._0}}
{{- end }}

{{- define "keptn-image-tag" -}}
{{- $parts := split ":" .Values.image }}
{{- printf "%s" $parts._1}}
{{- end }}