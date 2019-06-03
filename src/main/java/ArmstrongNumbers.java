class ArmstrongNumbers {

	boolean isArmstrongNumber(Integer numberToCheck) {
		String number = String.valueOf(numberToCheck);
		Integer[] array = new Integer[number.length()];

		for (int i = 0; i < number.length(); i++) {
			array[i] = getPower(Character.getNumericValue(number.charAt(i)), number.length());
		}

		return numberToCheck.equals(getArmstrongNumber(array));
	}

	private Integer getArmstrongNumber(Integer[] array) {
		Integer count = 0;

		for (Integer value : array) {
			count += value;
		}

		return count;
	}

	private Integer getPower(Integer number, Integer power) {
		Double count = Math.pow(number.doubleValue(), power.doubleValue());
		return count.intValue();
	}

}
