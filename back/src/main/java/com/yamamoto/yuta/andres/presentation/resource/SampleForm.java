package com.yamamoto.yuta.andres.presentation.resource;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.yamamoto.yuta.andres.infrastructure.repository.entity.Sample;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Date;

public class SampleForm {

  @Schema(required = true, nullable = true)
  private final Integer id;

  @Schema(required = true, nullable = true)
  private final String fieldText;

  @Schema(required = true, nullable = true)
  private final String fieldTextarea;

  @Schema(required = true, nullable = true)
  private final Integer fieldNumber;

  @Schema(required = true, nullable = true)
  private final Date fieldDate;

  @Schema(required = true, nullable = true)
  private final Integer fieldSelect;

  @Schema(required = true, nullable = true)
  private final Integer fieldRadio;

  @Schema(required = true, nullable = true)
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

  @JsonIgnore
  public Sample genSample(Integer id) {

    var sample = new Sample();

    sample.setId(id);
    sample.setFieldText(this.fieldText);
    sample.setFieldTextarea(this.fieldTextarea);
    sample.setFieldNumber(this.fieldNumber);
    sample.setFieldDate(this.fieldDate);
    sample.setFieldSelect(this.fieldSelect);
    sample.setFieldRadio(this.fieldRadio);
    sample.setFieldSwitch(this.fieldSwitch);

    return sample;
  }
}
