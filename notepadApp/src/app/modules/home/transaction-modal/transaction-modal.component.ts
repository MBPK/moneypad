import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-transaction-modal',
  templateUrl: './transaction-modal.component.html',
  styleUrls: ['./transaction-modal.component.css']
})
export class TransactionModalComponent implements OnInit {

  public transactionForm: FormGroup | undefined;

  constructor(public modal: NgbActiveModal) { }

  ngOnInit(): void {
    this.transactionForm = new FormGroup({
      month: new FormControl(new Date().getMonth(), Validators.required),
      amount: new FormControl(0, Validators.required),
      type: new FormControl('Credit', Validators.required)
    });
  }

}
