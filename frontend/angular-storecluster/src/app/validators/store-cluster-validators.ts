import { FormControl, ValidationErrors } from "@angular/forms";

export class StoreClusterValidators {

	// whitespace validation
	static notOnlyWhitespace(control: FormControl): ValidationErrors {

		// check if string is not only whitespace
		if ((control.value != null) && (control.value.trim().length === 0)) {

			// invalid, return error object
			return { 'notOnlyWhitespace': true };
		}
		else {
			// valid, return null
			return null!;
 		}
	}

}
