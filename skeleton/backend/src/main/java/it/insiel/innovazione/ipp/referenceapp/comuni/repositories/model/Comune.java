package it.insiel.innovazione.ipp.referenceapp.comuni.repositories.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ipp_comuni")
public class Comune {
  public Comune(String nome, String provincia, Integer abitanti) {
    this(null, nome, provincia, abitanti);    
  }
  public Comune(Long id, String nome, String provincia, Integer abitanti) {
    this.id = id;
    this.nome = nome;
    this.provincia = provincia;
    this.abitanti = abitanti;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Comune comune = (Comune) o;
    return id.equals(comune.id) && nome.equals(comune.nome) && provincia.equals(comune.provincia) && abitanti.equals(comune.abitanti);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, provincia, abitanti);
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getProvincia() {
    return provincia;
  }

  public void setProvincia(String provincia) {
    this.provincia = provincia;
  }

  public Integer getAbitanti() {
    return abitanti;
  }

  public void setAbitanti(Integer abitanti) {
    this.abitanti = abitanti;
  }

  @GeneratedValue(strategy = GenerationType.AUTO)
  @Id
  private Long id;
  private String nome;
  private String provincia;
  private Integer abitanti;

  public Comune() {
  }
}
