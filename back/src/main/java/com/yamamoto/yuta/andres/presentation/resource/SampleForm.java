package com.yamamoto.yuta.andres.presentation.resource;

import com.yamamoto.yuta.andres.infrastructure.repository.entity.Sample;
import java.util.Date;

public class SampleForm {

  private final Integer id;

  private final String fieldText;

  private final String fieldTextarea;

  private final Integer fieldNumber;

  private final Date fieldDate;

  private final Integer fieldSelect;

  private final Integer fieldRadio;

  private final Boolean fieldSwitch;

  public SampleForm(
      Integer id,
      String fieldText,
      String fieldTextarea,
      Integer fieldNumber,
      Date fieldDate,
      Integer fieldSelect,
      Integer fieldRadio,
      Boolean fieldSwitch) {
    this.id = id;
    this.fieldText = fieldText;
    this.fieldTextarea = fieldTextarea;
    this.fieldNumber = fieldNumber;
    this.fieldDate = fieldDate;
    this.fieldSelect = fieldSelect;
    this.fieldRadio = fieldRadio;
    this.fieldSwitch = fieldSwitch;
  }

  public SampleForm(Sample sample) {
    this.id = sample.getId();
    this.fieldText = sample.getFieldText();
    this.fieldTextarea = sample.getFieldTextarea();
    this.fieldNumber = sample.getFieldNumber();
    this.fieldDate = sample.getFieldDate();
    this.fieldSelect = sample.getFieldSelect();
    this.fieldRadio = sample.getFieldRadio();
    this.fieldSwitch = sample.getFieldSwitch();
  }

  public Integer getId() {
    return id;
  }

  public String getFieldText() {
    return fieldText;
  }

  public String getFieldTextarea() {
    return fieldTextarea;
  }

  public Integer getFieldNumber() {
    return fieldNumber;
  }

  public Date getFieldDate() {
    return fieldDate;
  }

  public Integer getFieldSelect() {
    return fieldSelect;
  }

  public Integer getFieldRadio() {
    return fieldRadio;
  }

  public Boolean getFieldSwitch() {
    return fieldSwitch;
  }
}
