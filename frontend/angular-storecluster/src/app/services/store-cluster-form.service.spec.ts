import { TestBed } from '@angular/core/testing';

import { StoreClusterFormService } from './store-cluster-form.service';

describe('StoreClusterFormService', () => {
  let service: StoreClusterFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(StoreClusterFormService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
