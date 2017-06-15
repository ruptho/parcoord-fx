package tugraz.ivis.parcoord.chart;

import org.controlsfx.control.RangeSlider;

import javafx.scene.chart.NumberAxis;
import javafx.scene.layout.HBox;

public class ParallelCoordinatesAxis {
	
	private NumberAxis axis;
	private boolean inverted = false;
	private int axisIndex;
	private String label;
	private HBox labelBox;
	private RangeSlider filterSlider;
	private double filterHigh;
	private double filterLow;

	public ParallelCoordinatesAxis(NumberAxis axis, int axisIndex, String label, HBox labelBox, RangeSlider filterSlider) {
		this.axis = axis;
		this.axisIndex = axisIndex;
		this.label = label;
		this.labelBox = labelBox;
		this.filterSlider = filterSlider;
		
		if(filterSlider != null) {
			filterHigh = filterSlider.getHighValue();
			filterLow = filterSlider.getLowValue();
		}
	}
	
	
	public NumberAxis getAxis() {
		return axis;
	}

	public boolean isInverted() {
		return inverted;
	}
	public int getAxisIndex() {
		return axisIndex;
	}
	public void setAxisIndex(int axisIndex) {
		this.axisIndex = axisIndex;
	}
	public String getLabel() {
		return label;
	}
	public HBox getLabelBox() {
		return labelBox;
	}
	public RangeSlider getFilterSlider() {
		return filterSlider;
	}
	public double getFilterHigh() {
		return filterHigh;
	}
	public void setFilterHigh(double filterHigh) {
		this.filterHigh = filterHigh;
	}
	public double getFilterLow() {
		return filterLow;
	}
	public void setFilterLow(double filterLow) {
		this.filterLow = filterLow;
	}
	
}
