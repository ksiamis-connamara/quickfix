package org.quickfix.fix43;
import org.quickfix.FieldNotFound;
import org.quickfix.Group;
import org.quickfix.field.*;

public class ExecutionReport extends Message
{
  public ExecutionReport()
  {
    getHeader().setField(new MsgType("8"));
  }
  public ExecutionReport(
    org.quickfix.field.OrderID aOrderID,
    org.quickfix.field.ExecID aExecID,
    org.quickfix.field.ExecType aExecType,
    org.quickfix.field.OrdStatus aOrdStatus,
    org.quickfix.field.Side aSide,
    org.quickfix.field.LeavesQty aLeavesQty,
    org.quickfix.field.CumQty aCumQty,
    org.quickfix.field.AvgPx aAvgPx ) {

    getHeader().setField(new MsgType("8"));
    set(aOrderID);
    set(aExecID);
    set(aExecType);
    set(aOrdStatus);
    set(aSide);
    set(aLeavesQty);
    set(aCumQty);
    set(aAvgPx);
  }

  public void set(org.quickfix.field.OrderID value)
  { setField(value); }
  public org.quickfix.field.OrderID get(org.quickfix.field.OrderID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.OrderID getOrderID() throws FieldNotFound
  { org.quickfix.field.OrderID value = new org.quickfix.field.OrderID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.OrderID field)
  { return isSetField(field); }
  public boolean isSetOrderID()
  { return isSetField(37); }
  public void set(org.quickfix.field.SecondaryOrderID value)
  { setField(value); }
  public org.quickfix.field.SecondaryOrderID get(org.quickfix.field.SecondaryOrderID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SecondaryOrderID getSecondaryOrderID() throws FieldNotFound
  { org.quickfix.field.SecondaryOrderID value = new org.quickfix.field.SecondaryOrderID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SecondaryOrderID field)
  { return isSetField(field); }
  public boolean isSetSecondaryOrderID()
  { return isSetField(198); }
  public void set(org.quickfix.field.SecondaryClOrdID value)
  { setField(value); }
  public org.quickfix.field.SecondaryClOrdID get(org.quickfix.field.SecondaryClOrdID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SecondaryClOrdID getSecondaryClOrdID() throws FieldNotFound
  { org.quickfix.field.SecondaryClOrdID value = new org.quickfix.field.SecondaryClOrdID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SecondaryClOrdID field)
  { return isSetField(field); }
  public boolean isSetSecondaryClOrdID()
  { return isSetField(526); }
  public void set(org.quickfix.field.SecondaryExecID value)
  { setField(value); }
  public org.quickfix.field.SecondaryExecID get(org.quickfix.field.SecondaryExecID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SecondaryExecID getSecondaryExecID() throws FieldNotFound
  { org.quickfix.field.SecondaryExecID value = new org.quickfix.field.SecondaryExecID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SecondaryExecID field)
  { return isSetField(field); }
  public boolean isSetSecondaryExecID()
  { return isSetField(527); }
  public void set(org.quickfix.field.ClOrdID value)
  { setField(value); }
  public org.quickfix.field.ClOrdID get(org.quickfix.field.ClOrdID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ClOrdID getClOrdID() throws FieldNotFound
  { org.quickfix.field.ClOrdID value = new org.quickfix.field.ClOrdID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ClOrdID field)
  { return isSetField(field); }
  public boolean isSetClOrdID()
  { return isSetField(11); }
  public void set(org.quickfix.field.OrigClOrdID value)
  { setField(value); }
  public org.quickfix.field.OrigClOrdID get(org.quickfix.field.OrigClOrdID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.OrigClOrdID getOrigClOrdID() throws FieldNotFound
  { org.quickfix.field.OrigClOrdID value = new org.quickfix.field.OrigClOrdID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.OrigClOrdID field)
  { return isSetField(field); }
  public boolean isSetOrigClOrdID()
  { return isSetField(41); }
  public void set(org.quickfix.field.ClOrdLinkID value)
  { setField(value); }
  public org.quickfix.field.ClOrdLinkID get(org.quickfix.field.ClOrdLinkID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ClOrdLinkID getClOrdLinkID() throws FieldNotFound
  { org.quickfix.field.ClOrdLinkID value = new org.quickfix.field.ClOrdLinkID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ClOrdLinkID field)
  { return isSetField(field); }
  public boolean isSetClOrdLinkID()
  { return isSetField(583); }
  public void set(org.quickfix.field.NoPartyIDs value)
  { setField(value); }
  public org.quickfix.field.NoPartyIDs get(org.quickfix.field.NoPartyIDs  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.NoPartyIDs getNoPartyIDs() throws FieldNotFound
  { org.quickfix.field.NoPartyIDs value = new org.quickfix.field.NoPartyIDs();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.NoPartyIDs field)
  { return isSetField(field); }
  public boolean isSetNoPartyIDs()
  { return isSetField(453); }
  public static class NoPartyIDs extends Group {
    public NoPartyIDs() {
      super(453,448,
      new int[] {448,447,452,523,0 } ); }
  public void set(org.quickfix.field.PartyID value)
  { setField(value); }
  public org.quickfix.field.PartyID get(org.quickfix.field.PartyID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.PartyID getPartyID() throws FieldNotFound
  { org.quickfix.field.PartyID value = new org.quickfix.field.PartyID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.PartyID field)
  { return isSetField(field); }
  public boolean isSetPartyID()
  { return isSetField(448); }
  public void set(org.quickfix.field.PartyIDSource value)
  { setField(value); }
  public org.quickfix.field.PartyIDSource get(org.quickfix.field.PartyIDSource  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.PartyIDSource getPartyIDSource() throws FieldNotFound
  { org.quickfix.field.PartyIDSource value = new org.quickfix.field.PartyIDSource();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.PartyIDSource field)
  { return isSetField(field); }
  public boolean isSetPartyIDSource()
  { return isSetField(447); }
  public void set(org.quickfix.field.PartyRole value)
  { setField(value); }
  public org.quickfix.field.PartyRole get(org.quickfix.field.PartyRole  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.PartyRole getPartyRole() throws FieldNotFound
  { org.quickfix.field.PartyRole value = new org.quickfix.field.PartyRole();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.PartyRole field)
  { return isSetField(field); }
  public boolean isSetPartyRole()
  { return isSetField(452); }
  public void set(org.quickfix.field.PartySubID value)
  { setField(value); }
  public org.quickfix.field.PartySubID get(org.quickfix.field.PartySubID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.PartySubID getPartySubID() throws FieldNotFound
  { org.quickfix.field.PartySubID value = new org.quickfix.field.PartySubID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.PartySubID field)
  { return isSetField(field); }
  public boolean isSetPartySubID()
  { return isSetField(523); }
}
  public void set(org.quickfix.field.TradeOriginationDate value)
  { setField(value); }
  public org.quickfix.field.TradeOriginationDate get(org.quickfix.field.TradeOriginationDate  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.TradeOriginationDate getTradeOriginationDate() throws FieldNotFound
  { org.quickfix.field.TradeOriginationDate value = new org.quickfix.field.TradeOriginationDate();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.TradeOriginationDate field)
  { return isSetField(field); }
  public boolean isSetTradeOriginationDate()
  { return isSetField(229); }
  public void set(org.quickfix.field.ListID value)
  { setField(value); }
  public org.quickfix.field.ListID get(org.quickfix.field.ListID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ListID getListID() throws FieldNotFound
  { org.quickfix.field.ListID value = new org.quickfix.field.ListID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ListID field)
  { return isSetField(field); }
  public boolean isSetListID()
  { return isSetField(66); }
  public void set(org.quickfix.field.CrossID value)
  { setField(value); }
  public org.quickfix.field.CrossID get(org.quickfix.field.CrossID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.CrossID getCrossID() throws FieldNotFound
  { org.quickfix.field.CrossID value = new org.quickfix.field.CrossID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.CrossID field)
  { return isSetField(field); }
  public boolean isSetCrossID()
  { return isSetField(548); }
  public void set(org.quickfix.field.OrigCrossID value)
  { setField(value); }
  public org.quickfix.field.OrigCrossID get(org.quickfix.field.OrigCrossID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.OrigCrossID getOrigCrossID() throws FieldNotFound
  { org.quickfix.field.OrigCrossID value = new org.quickfix.field.OrigCrossID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.OrigCrossID field)
  { return isSetField(field); }
  public boolean isSetOrigCrossID()
  { return isSetField(551); }
  public void set(org.quickfix.field.CrossType value)
  { setField(value); }
  public org.quickfix.field.CrossType get(org.quickfix.field.CrossType  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.CrossType getCrossType() throws FieldNotFound
  { org.quickfix.field.CrossType value = new org.quickfix.field.CrossType();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.CrossType field)
  { return isSetField(field); }
  public boolean isSetCrossType()
  { return isSetField(549); }
  public void set(org.quickfix.field.ExecID value)
  { setField(value); }
  public org.quickfix.field.ExecID get(org.quickfix.field.ExecID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ExecID getExecID() throws FieldNotFound
  { org.quickfix.field.ExecID value = new org.quickfix.field.ExecID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ExecID field)
  { return isSetField(field); }
  public boolean isSetExecID()
  { return isSetField(17); }
  public void set(org.quickfix.field.ExecRefID value)
  { setField(value); }
  public org.quickfix.field.ExecRefID get(org.quickfix.field.ExecRefID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ExecRefID getExecRefID() throws FieldNotFound
  { org.quickfix.field.ExecRefID value = new org.quickfix.field.ExecRefID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ExecRefID field)
  { return isSetField(field); }
  public boolean isSetExecRefID()
  { return isSetField(19); }
  public void set(org.quickfix.field.ExecType value)
  { setField(value); }
  public org.quickfix.field.ExecType get(org.quickfix.field.ExecType  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ExecType getExecType() throws FieldNotFound
  { org.quickfix.field.ExecType value = new org.quickfix.field.ExecType();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ExecType field)
  { return isSetField(field); }
  public boolean isSetExecType()
  { return isSetField(150); }
  public void set(org.quickfix.field.OrdStatus value)
  { setField(value); }
  public org.quickfix.field.OrdStatus get(org.quickfix.field.OrdStatus  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.OrdStatus getOrdStatus() throws FieldNotFound
  { org.quickfix.field.OrdStatus value = new org.quickfix.field.OrdStatus();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.OrdStatus field)
  { return isSetField(field); }
  public boolean isSetOrdStatus()
  { return isSetField(39); }
  public void set(org.quickfix.field.WorkingIndicator value)
  { setField(value); }
  public org.quickfix.field.WorkingIndicator get(org.quickfix.field.WorkingIndicator  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.WorkingIndicator getWorkingIndicator() throws FieldNotFound
  { org.quickfix.field.WorkingIndicator value = new org.quickfix.field.WorkingIndicator();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.WorkingIndicator field)
  { return isSetField(field); }
  public boolean isSetWorkingIndicator()
  { return isSetField(636); }
  public void set(org.quickfix.field.OrdRejReason value)
  { setField(value); }
  public org.quickfix.field.OrdRejReason get(org.quickfix.field.OrdRejReason  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.OrdRejReason getOrdRejReason() throws FieldNotFound
  { org.quickfix.field.OrdRejReason value = new org.quickfix.field.OrdRejReason();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.OrdRejReason field)
  { return isSetField(field); }
  public boolean isSetOrdRejReason()
  { return isSetField(103); }
  public void set(org.quickfix.field.ExecRestatementReason value)
  { setField(value); }
  public org.quickfix.field.ExecRestatementReason get(org.quickfix.field.ExecRestatementReason  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ExecRestatementReason getExecRestatementReason() throws FieldNotFound
  { org.quickfix.field.ExecRestatementReason value = new org.quickfix.field.ExecRestatementReason();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ExecRestatementReason field)
  { return isSetField(field); }
  public boolean isSetExecRestatementReason()
  { return isSetField(378); }
  public void set(org.quickfix.field.Account value)
  { setField(value); }
  public org.quickfix.field.Account get(org.quickfix.field.Account  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.Account getAccount() throws FieldNotFound
  { org.quickfix.field.Account value = new org.quickfix.field.Account();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.Account field)
  { return isSetField(field); }
  public boolean isSetAccount()
  { return isSetField(1); }
  public void set(org.quickfix.field.AccountType value)
  { setField(value); }
  public org.quickfix.field.AccountType get(org.quickfix.field.AccountType  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.AccountType getAccountType() throws FieldNotFound
  { org.quickfix.field.AccountType value = new org.quickfix.field.AccountType();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.AccountType field)
  { return isSetField(field); }
  public boolean isSetAccountType()
  { return isSetField(581); }
  public void set(org.quickfix.field.DayBookingInst value)
  { setField(value); }
  public org.quickfix.field.DayBookingInst get(org.quickfix.field.DayBookingInst  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.DayBookingInst getDayBookingInst() throws FieldNotFound
  { org.quickfix.field.DayBookingInst value = new org.quickfix.field.DayBookingInst();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.DayBookingInst field)
  { return isSetField(field); }
  public boolean isSetDayBookingInst()
  { return isSetField(589); }
  public void set(org.quickfix.field.BookingUnit value)
  { setField(value); }
  public org.quickfix.field.BookingUnit get(org.quickfix.field.BookingUnit  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.BookingUnit getBookingUnit() throws FieldNotFound
  { org.quickfix.field.BookingUnit value = new org.quickfix.field.BookingUnit();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.BookingUnit field)
  { return isSetField(field); }
  public boolean isSetBookingUnit()
  { return isSetField(590); }
  public void set(org.quickfix.field.PreallocMethod value)
  { setField(value); }
  public org.quickfix.field.PreallocMethod get(org.quickfix.field.PreallocMethod  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.PreallocMethod getPreallocMethod() throws FieldNotFound
  { org.quickfix.field.PreallocMethod value = new org.quickfix.field.PreallocMethod();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.PreallocMethod field)
  { return isSetField(field); }
  public boolean isSetPreallocMethod()
  { return isSetField(591); }
  public void set(org.quickfix.field.SettlmntTyp value)
  { setField(value); }
  public org.quickfix.field.SettlmntTyp get(org.quickfix.field.SettlmntTyp  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SettlmntTyp getSettlmntTyp() throws FieldNotFound
  { org.quickfix.field.SettlmntTyp value = new org.quickfix.field.SettlmntTyp();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SettlmntTyp field)
  { return isSetField(field); }
  public boolean isSetSettlmntTyp()
  { return isSetField(63); }
  public void set(org.quickfix.field.FutSettDate value)
  { setField(value); }
  public org.quickfix.field.FutSettDate get(org.quickfix.field.FutSettDate  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.FutSettDate getFutSettDate() throws FieldNotFound
  { org.quickfix.field.FutSettDate value = new org.quickfix.field.FutSettDate();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.FutSettDate field)
  { return isSetField(field); }
  public boolean isSetFutSettDate()
  { return isSetField(64); }
  public void set(org.quickfix.field.CashMargin value)
  { setField(value); }
  public org.quickfix.field.CashMargin get(org.quickfix.field.CashMargin  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.CashMargin getCashMargin() throws FieldNotFound
  { org.quickfix.field.CashMargin value = new org.quickfix.field.CashMargin();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.CashMargin field)
  { return isSetField(field); }
  public boolean isSetCashMargin()
  { return isSetField(544); }
  public void set(org.quickfix.field.ClearingFeeIndicator value)
  { setField(value); }
  public org.quickfix.field.ClearingFeeIndicator get(org.quickfix.field.ClearingFeeIndicator  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ClearingFeeIndicator getClearingFeeIndicator() throws FieldNotFound
  { org.quickfix.field.ClearingFeeIndicator value = new org.quickfix.field.ClearingFeeIndicator();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ClearingFeeIndicator field)
  { return isSetField(field); }
  public boolean isSetClearingFeeIndicator()
  { return isSetField(635); }
  public void set(org.quickfix.field.Symbol value)
  { setField(value); }
  public org.quickfix.field.Symbol get(org.quickfix.field.Symbol  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.Symbol getSymbol() throws FieldNotFound
  { org.quickfix.field.Symbol value = new org.quickfix.field.Symbol();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.Symbol field)
  { return isSetField(field); }
  public boolean isSetSymbol()
  { return isSetField(55); }
  public void set(org.quickfix.field.SymbolSfx value)
  { setField(value); }
  public org.quickfix.field.SymbolSfx get(org.quickfix.field.SymbolSfx  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SymbolSfx getSymbolSfx() throws FieldNotFound
  { org.quickfix.field.SymbolSfx value = new org.quickfix.field.SymbolSfx();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SymbolSfx field)
  { return isSetField(field); }
  public boolean isSetSymbolSfx()
  { return isSetField(65); }
  public void set(org.quickfix.field.SecurityID value)
  { setField(value); }
  public org.quickfix.field.SecurityID get(org.quickfix.field.SecurityID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SecurityID getSecurityID() throws FieldNotFound
  { org.quickfix.field.SecurityID value = new org.quickfix.field.SecurityID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SecurityID field)
  { return isSetField(field); }
  public boolean isSetSecurityID()
  { return isSetField(48); }
  public void set(org.quickfix.field.SecurityIDSource value)
  { setField(value); }
  public org.quickfix.field.SecurityIDSource get(org.quickfix.field.SecurityIDSource  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SecurityIDSource getSecurityIDSource() throws FieldNotFound
  { org.quickfix.field.SecurityIDSource value = new org.quickfix.field.SecurityIDSource();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SecurityIDSource field)
  { return isSetField(field); }
  public boolean isSetSecurityIDSource()
  { return isSetField(22); }
  public void set(org.quickfix.field.Product value)
  { setField(value); }
  public org.quickfix.field.Product get(org.quickfix.field.Product  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.Product getProduct() throws FieldNotFound
  { org.quickfix.field.Product value = new org.quickfix.field.Product();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.Product field)
  { return isSetField(field); }
  public boolean isSetProduct()
  { return isSetField(460); }
  public void set(org.quickfix.field.CFICode value)
  { setField(value); }
  public org.quickfix.field.CFICode get(org.quickfix.field.CFICode  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.CFICode getCFICode() throws FieldNotFound
  { org.quickfix.field.CFICode value = new org.quickfix.field.CFICode();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.CFICode field)
  { return isSetField(field); }
  public boolean isSetCFICode()
  { return isSetField(461); }
  public void set(org.quickfix.field.SecurityType value)
  { setField(value); }
  public org.quickfix.field.SecurityType get(org.quickfix.field.SecurityType  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SecurityType getSecurityType() throws FieldNotFound
  { org.quickfix.field.SecurityType value = new org.quickfix.field.SecurityType();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SecurityType field)
  { return isSetField(field); }
  public boolean isSetSecurityType()
  { return isSetField(167); }
  public void set(org.quickfix.field.MaturityMonthYear value)
  { setField(value); }
  public org.quickfix.field.MaturityMonthYear get(org.quickfix.field.MaturityMonthYear  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.MaturityMonthYear getMaturityMonthYear() throws FieldNotFound
  { org.quickfix.field.MaturityMonthYear value = new org.quickfix.field.MaturityMonthYear();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.MaturityMonthYear field)
  { return isSetField(field); }
  public boolean isSetMaturityMonthYear()
  { return isSetField(200); }
  public void set(org.quickfix.field.MaturityDate value)
  { setField(value); }
  public org.quickfix.field.MaturityDate get(org.quickfix.field.MaturityDate  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.MaturityDate getMaturityDate() throws FieldNotFound
  { org.quickfix.field.MaturityDate value = new org.quickfix.field.MaturityDate();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.MaturityDate field)
  { return isSetField(field); }
  public boolean isSetMaturityDate()
  { return isSetField(541); }
  public void set(org.quickfix.field.CouponPaymentDate value)
  { setField(value); }
  public org.quickfix.field.CouponPaymentDate get(org.quickfix.field.CouponPaymentDate  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.CouponPaymentDate getCouponPaymentDate() throws FieldNotFound
  { org.quickfix.field.CouponPaymentDate value = new org.quickfix.field.CouponPaymentDate();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.CouponPaymentDate field)
  { return isSetField(field); }
  public boolean isSetCouponPaymentDate()
  { return isSetField(224); }
  public void set(org.quickfix.field.IssueDate value)
  { setField(value); }
  public org.quickfix.field.IssueDate get(org.quickfix.field.IssueDate  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.IssueDate getIssueDate() throws FieldNotFound
  { org.quickfix.field.IssueDate value = new org.quickfix.field.IssueDate();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.IssueDate field)
  { return isSetField(field); }
  public boolean isSetIssueDate()
  { return isSetField(225); }
  public void set(org.quickfix.field.RepoCollateralSecurityType value)
  { setField(value); }
  public org.quickfix.field.RepoCollateralSecurityType get(org.quickfix.field.RepoCollateralSecurityType  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.RepoCollateralSecurityType getRepoCollateralSecurityType() throws FieldNotFound
  { org.quickfix.field.RepoCollateralSecurityType value = new org.quickfix.field.RepoCollateralSecurityType();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.RepoCollateralSecurityType field)
  { return isSetField(field); }
  public boolean isSetRepoCollateralSecurityType()
  { return isSetField(239); }
  public void set(org.quickfix.field.RepurchaseTerm value)
  { setField(value); }
  public org.quickfix.field.RepurchaseTerm get(org.quickfix.field.RepurchaseTerm  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.RepurchaseTerm getRepurchaseTerm() throws FieldNotFound
  { org.quickfix.field.RepurchaseTerm value = new org.quickfix.field.RepurchaseTerm();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.RepurchaseTerm field)
  { return isSetField(field); }
  public boolean isSetRepurchaseTerm()
  { return isSetField(226); }
  public void set(org.quickfix.field.RepurchaseRate value)
  { setField(value); }
  public org.quickfix.field.RepurchaseRate get(org.quickfix.field.RepurchaseRate  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.RepurchaseRate getRepurchaseRate() throws FieldNotFound
  { org.quickfix.field.RepurchaseRate value = new org.quickfix.field.RepurchaseRate();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.RepurchaseRate field)
  { return isSetField(field); }
  public boolean isSetRepurchaseRate()
  { return isSetField(227); }
  public void set(org.quickfix.field.Factor value)
  { setField(value); }
  public org.quickfix.field.Factor get(org.quickfix.field.Factor  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.Factor getFactor() throws FieldNotFound
  { org.quickfix.field.Factor value = new org.quickfix.field.Factor();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.Factor field)
  { return isSetField(field); }
  public boolean isSetFactor()
  { return isSetField(228); }
  public void set(org.quickfix.field.CreditRating value)
  { setField(value); }
  public org.quickfix.field.CreditRating get(org.quickfix.field.CreditRating  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.CreditRating getCreditRating() throws FieldNotFound
  { org.quickfix.field.CreditRating value = new org.quickfix.field.CreditRating();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.CreditRating field)
  { return isSetField(field); }
  public boolean isSetCreditRating()
  { return isSetField(255); }
  public void set(org.quickfix.field.InstrRegistry value)
  { setField(value); }
  public org.quickfix.field.InstrRegistry get(org.quickfix.field.InstrRegistry  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.InstrRegistry getInstrRegistry() throws FieldNotFound
  { org.quickfix.field.InstrRegistry value = new org.quickfix.field.InstrRegistry();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.InstrRegistry field)
  { return isSetField(field); }
  public boolean isSetInstrRegistry()
  { return isSetField(543); }
  public void set(org.quickfix.field.CountryOfIssue value)
  { setField(value); }
  public org.quickfix.field.CountryOfIssue get(org.quickfix.field.CountryOfIssue  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.CountryOfIssue getCountryOfIssue() throws FieldNotFound
  { org.quickfix.field.CountryOfIssue value = new org.quickfix.field.CountryOfIssue();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.CountryOfIssue field)
  { return isSetField(field); }
  public boolean isSetCountryOfIssue()
  { return isSetField(470); }
  public void set(org.quickfix.field.StateOrProvinceOfIssue value)
  { setField(value); }
  public org.quickfix.field.StateOrProvinceOfIssue get(org.quickfix.field.StateOrProvinceOfIssue  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.StateOrProvinceOfIssue getStateOrProvinceOfIssue() throws FieldNotFound
  { org.quickfix.field.StateOrProvinceOfIssue value = new org.quickfix.field.StateOrProvinceOfIssue();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.StateOrProvinceOfIssue field)
  { return isSetField(field); }
  public boolean isSetStateOrProvinceOfIssue()
  { return isSetField(471); }
  public void set(org.quickfix.field.LocaleOfIssue value)
  { setField(value); }
  public org.quickfix.field.LocaleOfIssue get(org.quickfix.field.LocaleOfIssue  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LocaleOfIssue getLocaleOfIssue() throws FieldNotFound
  { org.quickfix.field.LocaleOfIssue value = new org.quickfix.field.LocaleOfIssue();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LocaleOfIssue field)
  { return isSetField(field); }
  public boolean isSetLocaleOfIssue()
  { return isSetField(472); }
  public void set(org.quickfix.field.RedemptionDate value)
  { setField(value); }
  public org.quickfix.field.RedemptionDate get(org.quickfix.field.RedemptionDate  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.RedemptionDate getRedemptionDate() throws FieldNotFound
  { org.quickfix.field.RedemptionDate value = new org.quickfix.field.RedemptionDate();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.RedemptionDate field)
  { return isSetField(field); }
  public boolean isSetRedemptionDate()
  { return isSetField(240); }
  public void set(org.quickfix.field.StrikePrice value)
  { setField(value); }
  public org.quickfix.field.StrikePrice get(org.quickfix.field.StrikePrice  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.StrikePrice getStrikePrice() throws FieldNotFound
  { org.quickfix.field.StrikePrice value = new org.quickfix.field.StrikePrice();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.StrikePrice field)
  { return isSetField(field); }
  public boolean isSetStrikePrice()
  { return isSetField(202); }
  public void set(org.quickfix.field.OptAttribute value)
  { setField(value); }
  public org.quickfix.field.OptAttribute get(org.quickfix.field.OptAttribute  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.OptAttribute getOptAttribute() throws FieldNotFound
  { org.quickfix.field.OptAttribute value = new org.quickfix.field.OptAttribute();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.OptAttribute field)
  { return isSetField(field); }
  public boolean isSetOptAttribute()
  { return isSetField(206); }
  public void set(org.quickfix.field.ContractMultiplier value)
  { setField(value); }
  public org.quickfix.field.ContractMultiplier get(org.quickfix.field.ContractMultiplier  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ContractMultiplier getContractMultiplier() throws FieldNotFound
  { org.quickfix.field.ContractMultiplier value = new org.quickfix.field.ContractMultiplier();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ContractMultiplier field)
  { return isSetField(field); }
  public boolean isSetContractMultiplier()
  { return isSetField(231); }
  public void set(org.quickfix.field.CouponRate value)
  { setField(value); }
  public org.quickfix.field.CouponRate get(org.quickfix.field.CouponRate  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.CouponRate getCouponRate() throws FieldNotFound
  { org.quickfix.field.CouponRate value = new org.quickfix.field.CouponRate();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.CouponRate field)
  { return isSetField(field); }
  public boolean isSetCouponRate()
  { return isSetField(223); }
  public void set(org.quickfix.field.SecurityExchange value)
  { setField(value); }
  public org.quickfix.field.SecurityExchange get(org.quickfix.field.SecurityExchange  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SecurityExchange getSecurityExchange() throws FieldNotFound
  { org.quickfix.field.SecurityExchange value = new org.quickfix.field.SecurityExchange();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SecurityExchange field)
  { return isSetField(field); }
  public boolean isSetSecurityExchange()
  { return isSetField(207); }
  public void set(org.quickfix.field.Issuer value)
  { setField(value); }
  public org.quickfix.field.Issuer get(org.quickfix.field.Issuer  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.Issuer getIssuer() throws FieldNotFound
  { org.quickfix.field.Issuer value = new org.quickfix.field.Issuer();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.Issuer field)
  { return isSetField(field); }
  public boolean isSetIssuer()
  { return isSetField(106); }
  public void set(org.quickfix.field.EncodedIssuerLen value)
  { setField(value); }
  public org.quickfix.field.EncodedIssuerLen get(org.quickfix.field.EncodedIssuerLen  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.EncodedIssuerLen getEncodedIssuerLen() throws FieldNotFound
  { org.quickfix.field.EncodedIssuerLen value = new org.quickfix.field.EncodedIssuerLen();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.EncodedIssuerLen field)
  { return isSetField(field); }
  public boolean isSetEncodedIssuerLen()
  { return isSetField(348); }
  public void set(org.quickfix.field.EncodedIssuer value)
  { setField(value); }
  public org.quickfix.field.EncodedIssuer get(org.quickfix.field.EncodedIssuer  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.EncodedIssuer getEncodedIssuer() throws FieldNotFound
  { org.quickfix.field.EncodedIssuer value = new org.quickfix.field.EncodedIssuer();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.EncodedIssuer field)
  { return isSetField(field); }
  public boolean isSetEncodedIssuer()
  { return isSetField(349); }
  public void set(org.quickfix.field.SecurityDesc value)
  { setField(value); }
  public org.quickfix.field.SecurityDesc get(org.quickfix.field.SecurityDesc  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SecurityDesc getSecurityDesc() throws FieldNotFound
  { org.quickfix.field.SecurityDesc value = new org.quickfix.field.SecurityDesc();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SecurityDesc field)
  { return isSetField(field); }
  public boolean isSetSecurityDesc()
  { return isSetField(107); }
  public void set(org.quickfix.field.EncodedSecurityDescLen value)
  { setField(value); }
  public org.quickfix.field.EncodedSecurityDescLen get(org.quickfix.field.EncodedSecurityDescLen  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.EncodedSecurityDescLen getEncodedSecurityDescLen() throws FieldNotFound
  { org.quickfix.field.EncodedSecurityDescLen value = new org.quickfix.field.EncodedSecurityDescLen();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.EncodedSecurityDescLen field)
  { return isSetField(field); }
  public boolean isSetEncodedSecurityDescLen()
  { return isSetField(350); }
  public void set(org.quickfix.field.EncodedSecurityDesc value)
  { setField(value); }
  public org.quickfix.field.EncodedSecurityDesc get(org.quickfix.field.EncodedSecurityDesc  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.EncodedSecurityDesc getEncodedSecurityDesc() throws FieldNotFound
  { org.quickfix.field.EncodedSecurityDesc value = new org.quickfix.field.EncodedSecurityDesc();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.EncodedSecurityDesc field)
  { return isSetField(field); }
  public boolean isSetEncodedSecurityDesc()
  { return isSetField(351); }
  public void set(org.quickfix.field.NoSecurityAltID value)
  { setField(value); }
  public org.quickfix.field.NoSecurityAltID get(org.quickfix.field.NoSecurityAltID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.NoSecurityAltID getNoSecurityAltID() throws FieldNotFound
  { org.quickfix.field.NoSecurityAltID value = new org.quickfix.field.NoSecurityAltID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.NoSecurityAltID field)
  { return isSetField(field); }
  public boolean isSetNoSecurityAltID()
  { return isSetField(454); }
  public static class NoSecurityAltID extends Group {
    public NoSecurityAltID() {
      super(454,455,
      new int[] {455,456,0 } ); }
  public void set(org.quickfix.field.SecurityAltID value)
  { setField(value); }
  public org.quickfix.field.SecurityAltID get(org.quickfix.field.SecurityAltID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SecurityAltID getSecurityAltID() throws FieldNotFound
  { org.quickfix.field.SecurityAltID value = new org.quickfix.field.SecurityAltID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SecurityAltID field)
  { return isSetField(field); }
  public boolean isSetSecurityAltID()
  { return isSetField(455); }
  public void set(org.quickfix.field.SecurityAltIDSource value)
  { setField(value); }
  public org.quickfix.field.SecurityAltIDSource get(org.quickfix.field.SecurityAltIDSource  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SecurityAltIDSource getSecurityAltIDSource() throws FieldNotFound
  { org.quickfix.field.SecurityAltIDSource value = new org.quickfix.field.SecurityAltIDSource();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SecurityAltIDSource field)
  { return isSetField(field); }
  public boolean isSetSecurityAltIDSource()
  { return isSetField(456); }
}
  public void set(org.quickfix.field.Side value)
  { setField(value); }
  public org.quickfix.field.Side get(org.quickfix.field.Side  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.Side getSide() throws FieldNotFound
  { org.quickfix.field.Side value = new org.quickfix.field.Side();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.Side field)
  { return isSetField(field); }
  public boolean isSetSide()
  { return isSetField(54); }
  public void set(org.quickfix.field.NoStipulations value)
  { setField(value); }
  public org.quickfix.field.NoStipulations get(org.quickfix.field.NoStipulations  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.NoStipulations getNoStipulations() throws FieldNotFound
  { org.quickfix.field.NoStipulations value = new org.quickfix.field.NoStipulations();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.NoStipulations field)
  { return isSetField(field); }
  public boolean isSetNoStipulations()
  { return isSetField(232); }
  public static class NoStipulations extends Group {
    public NoStipulations() {
      super(232,233,
      new int[] {233,234,0 } ); }
  public void set(org.quickfix.field.StipulationType value)
  { setField(value); }
  public org.quickfix.field.StipulationType get(org.quickfix.field.StipulationType  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.StipulationType getStipulationType() throws FieldNotFound
  { org.quickfix.field.StipulationType value = new org.quickfix.field.StipulationType();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.StipulationType field)
  { return isSetField(field); }
  public boolean isSetStipulationType()
  { return isSetField(233); }
  public void set(org.quickfix.field.StipulationValue value)
  { setField(value); }
  public org.quickfix.field.StipulationValue get(org.quickfix.field.StipulationValue  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.StipulationValue getStipulationValue() throws FieldNotFound
  { org.quickfix.field.StipulationValue value = new org.quickfix.field.StipulationValue();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.StipulationValue field)
  { return isSetField(field); }
  public boolean isSetStipulationValue()
  { return isSetField(234); }
}
  public void set(org.quickfix.field.QuantityType value)
  { setField(value); }
  public org.quickfix.field.QuantityType get(org.quickfix.field.QuantityType  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.QuantityType getQuantityType() throws FieldNotFound
  { org.quickfix.field.QuantityType value = new org.quickfix.field.QuantityType();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.QuantityType field)
  { return isSetField(field); }
  public boolean isSetQuantityType()
  { return isSetField(465); }
  public void set(org.quickfix.field.OrderQty value)
  { setField(value); }
  public org.quickfix.field.OrderQty get(org.quickfix.field.OrderQty  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.OrderQty getOrderQty() throws FieldNotFound
  { org.quickfix.field.OrderQty value = new org.quickfix.field.OrderQty();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.OrderQty field)
  { return isSetField(field); }
  public boolean isSetOrderQty()
  { return isSetField(38); }
  public void set(org.quickfix.field.CashOrderQty value)
  { setField(value); }
  public org.quickfix.field.CashOrderQty get(org.quickfix.field.CashOrderQty  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.CashOrderQty getCashOrderQty() throws FieldNotFound
  { org.quickfix.field.CashOrderQty value = new org.quickfix.field.CashOrderQty();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.CashOrderQty field)
  { return isSetField(field); }
  public boolean isSetCashOrderQty()
  { return isSetField(152); }
  public void set(org.quickfix.field.OrderPercent value)
  { setField(value); }
  public org.quickfix.field.OrderPercent get(org.quickfix.field.OrderPercent  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.OrderPercent getOrderPercent() throws FieldNotFound
  { org.quickfix.field.OrderPercent value = new org.quickfix.field.OrderPercent();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.OrderPercent field)
  { return isSetField(field); }
  public boolean isSetOrderPercent()
  { return isSetField(516); }
  public void set(org.quickfix.field.RoundingDirection value)
  { setField(value); }
  public org.quickfix.field.RoundingDirection get(org.quickfix.field.RoundingDirection  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.RoundingDirection getRoundingDirection() throws FieldNotFound
  { org.quickfix.field.RoundingDirection value = new org.quickfix.field.RoundingDirection();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.RoundingDirection field)
  { return isSetField(field); }
  public boolean isSetRoundingDirection()
  { return isSetField(468); }
  public void set(org.quickfix.field.RoundingModulus value)
  { setField(value); }
  public org.quickfix.field.RoundingModulus get(org.quickfix.field.RoundingModulus  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.RoundingModulus getRoundingModulus() throws FieldNotFound
  { org.quickfix.field.RoundingModulus value = new org.quickfix.field.RoundingModulus();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.RoundingModulus field)
  { return isSetField(field); }
  public boolean isSetRoundingModulus()
  { return isSetField(469); }
  public void set(org.quickfix.field.OrdType value)
  { setField(value); }
  public org.quickfix.field.OrdType get(org.quickfix.field.OrdType  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.OrdType getOrdType() throws FieldNotFound
  { org.quickfix.field.OrdType value = new org.quickfix.field.OrdType();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.OrdType field)
  { return isSetField(field); }
  public boolean isSetOrdType()
  { return isSetField(40); }
  public void set(org.quickfix.field.PriceType value)
  { setField(value); }
  public org.quickfix.field.PriceType get(org.quickfix.field.PriceType  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.PriceType getPriceType() throws FieldNotFound
  { org.quickfix.field.PriceType value = new org.quickfix.field.PriceType();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.PriceType field)
  { return isSetField(field); }
  public boolean isSetPriceType()
  { return isSetField(423); }
  public void set(org.quickfix.field.Price value)
  { setField(value); }
  public org.quickfix.field.Price get(org.quickfix.field.Price  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.Price getPrice() throws FieldNotFound
  { org.quickfix.field.Price value = new org.quickfix.field.Price();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.Price field)
  { return isSetField(field); }
  public boolean isSetPrice()
  { return isSetField(44); }
  public void set(org.quickfix.field.StopPx value)
  { setField(value); }
  public org.quickfix.field.StopPx get(org.quickfix.field.StopPx  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.StopPx getStopPx() throws FieldNotFound
  { org.quickfix.field.StopPx value = new org.quickfix.field.StopPx();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.StopPx field)
  { return isSetField(field); }
  public boolean isSetStopPx()
  { return isSetField(99); }
  public void set(org.quickfix.field.PegDifference value)
  { setField(value); }
  public org.quickfix.field.PegDifference get(org.quickfix.field.PegDifference  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.PegDifference getPegDifference() throws FieldNotFound
  { org.quickfix.field.PegDifference value = new org.quickfix.field.PegDifference();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.PegDifference field)
  { return isSetField(field); }
  public boolean isSetPegDifference()
  { return isSetField(211); }
  public void set(org.quickfix.field.DiscretionInst value)
  { setField(value); }
  public org.quickfix.field.DiscretionInst get(org.quickfix.field.DiscretionInst  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.DiscretionInst getDiscretionInst() throws FieldNotFound
  { org.quickfix.field.DiscretionInst value = new org.quickfix.field.DiscretionInst();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.DiscretionInst field)
  { return isSetField(field); }
  public boolean isSetDiscretionInst()
  { return isSetField(388); }
  public void set(org.quickfix.field.DiscretionOffset value)
  { setField(value); }
  public org.quickfix.field.DiscretionOffset get(org.quickfix.field.DiscretionOffset  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.DiscretionOffset getDiscretionOffset() throws FieldNotFound
  { org.quickfix.field.DiscretionOffset value = new org.quickfix.field.DiscretionOffset();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.DiscretionOffset field)
  { return isSetField(field); }
  public boolean isSetDiscretionOffset()
  { return isSetField(389); }
  public void set(org.quickfix.field.Currency value)
  { setField(value); }
  public org.quickfix.field.Currency get(org.quickfix.field.Currency  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.Currency getCurrency() throws FieldNotFound
  { org.quickfix.field.Currency value = new org.quickfix.field.Currency();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.Currency field)
  { return isSetField(field); }
  public boolean isSetCurrency()
  { return isSetField(15); }
  public void set(org.quickfix.field.ComplianceID value)
  { setField(value); }
  public org.quickfix.field.ComplianceID get(org.quickfix.field.ComplianceID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ComplianceID getComplianceID() throws FieldNotFound
  { org.quickfix.field.ComplianceID value = new org.quickfix.field.ComplianceID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ComplianceID field)
  { return isSetField(field); }
  public boolean isSetComplianceID()
  { return isSetField(376); }
  public void set(org.quickfix.field.SolicitedFlag value)
  { setField(value); }
  public org.quickfix.field.SolicitedFlag get(org.quickfix.field.SolicitedFlag  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SolicitedFlag getSolicitedFlag() throws FieldNotFound
  { org.quickfix.field.SolicitedFlag value = new org.quickfix.field.SolicitedFlag();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SolicitedFlag field)
  { return isSetField(field); }
  public boolean isSetSolicitedFlag()
  { return isSetField(377); }
  public void set(org.quickfix.field.TimeInForce value)
  { setField(value); }
  public org.quickfix.field.TimeInForce get(org.quickfix.field.TimeInForce  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.TimeInForce getTimeInForce() throws FieldNotFound
  { org.quickfix.field.TimeInForce value = new org.quickfix.field.TimeInForce();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.TimeInForce field)
  { return isSetField(field); }
  public boolean isSetTimeInForce()
  { return isSetField(59); }
  public void set(org.quickfix.field.EffectiveTime value)
  { setField(value); }
  public org.quickfix.field.EffectiveTime get(org.quickfix.field.EffectiveTime  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.EffectiveTime getEffectiveTime() throws FieldNotFound
  { org.quickfix.field.EffectiveTime value = new org.quickfix.field.EffectiveTime();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.EffectiveTime field)
  { return isSetField(field); }
  public boolean isSetEffectiveTime()
  { return isSetField(168); }
  public void set(org.quickfix.field.ExpireDate value)
  { setField(value); }
  public org.quickfix.field.ExpireDate get(org.quickfix.field.ExpireDate  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ExpireDate getExpireDate() throws FieldNotFound
  { org.quickfix.field.ExpireDate value = new org.quickfix.field.ExpireDate();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ExpireDate field)
  { return isSetField(field); }
  public boolean isSetExpireDate()
  { return isSetField(432); }
  public void set(org.quickfix.field.ExpireTime value)
  { setField(value); }
  public org.quickfix.field.ExpireTime get(org.quickfix.field.ExpireTime  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ExpireTime getExpireTime() throws FieldNotFound
  { org.quickfix.field.ExpireTime value = new org.quickfix.field.ExpireTime();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ExpireTime field)
  { return isSetField(field); }
  public boolean isSetExpireTime()
  { return isSetField(126); }
  public void set(org.quickfix.field.ExecInst value)
  { setField(value); }
  public org.quickfix.field.ExecInst get(org.quickfix.field.ExecInst  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ExecInst getExecInst() throws FieldNotFound
  { org.quickfix.field.ExecInst value = new org.quickfix.field.ExecInst();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ExecInst field)
  { return isSetField(field); }
  public boolean isSetExecInst()
  { return isSetField(18); }
  public void set(org.quickfix.field.OrderCapacity value)
  { setField(value); }
  public org.quickfix.field.OrderCapacity get(org.quickfix.field.OrderCapacity  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.OrderCapacity getOrderCapacity() throws FieldNotFound
  { org.quickfix.field.OrderCapacity value = new org.quickfix.field.OrderCapacity();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.OrderCapacity field)
  { return isSetField(field); }
  public boolean isSetOrderCapacity()
  { return isSetField(528); }
  public void set(org.quickfix.field.OrderRestrictions value)
  { setField(value); }
  public org.quickfix.field.OrderRestrictions get(org.quickfix.field.OrderRestrictions  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.OrderRestrictions getOrderRestrictions() throws FieldNotFound
  { org.quickfix.field.OrderRestrictions value = new org.quickfix.field.OrderRestrictions();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.OrderRestrictions field)
  { return isSetField(field); }
  public boolean isSetOrderRestrictions()
  { return isSetField(529); }
  public void set(org.quickfix.field.CustOrderCapacity value)
  { setField(value); }
  public org.quickfix.field.CustOrderCapacity get(org.quickfix.field.CustOrderCapacity  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.CustOrderCapacity getCustOrderCapacity() throws FieldNotFound
  { org.quickfix.field.CustOrderCapacity value = new org.quickfix.field.CustOrderCapacity();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.CustOrderCapacity field)
  { return isSetField(field); }
  public boolean isSetCustOrderCapacity()
  { return isSetField(582); }
  public void set(org.quickfix.field.Rule80A value)
  { setField(value); }
  public org.quickfix.field.Rule80A get(org.quickfix.field.Rule80A  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.Rule80A getRule80A() throws FieldNotFound
  { org.quickfix.field.Rule80A value = new org.quickfix.field.Rule80A();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.Rule80A field)
  { return isSetField(field); }
  public boolean isSetRule80A()
  { return isSetField(47); }
  public void set(org.quickfix.field.LastQty value)
  { setField(value); }
  public org.quickfix.field.LastQty get(org.quickfix.field.LastQty  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LastQty getLastQty() throws FieldNotFound
  { org.quickfix.field.LastQty value = new org.quickfix.field.LastQty();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LastQty field)
  { return isSetField(field); }
  public boolean isSetLastQty()
  { return isSetField(32); }
  public void set(org.quickfix.field.UnderlyingLastQty value)
  { setField(value); }
  public org.quickfix.field.UnderlyingLastQty get(org.quickfix.field.UnderlyingLastQty  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.UnderlyingLastQty getUnderlyingLastQty() throws FieldNotFound
  { org.quickfix.field.UnderlyingLastQty value = new org.quickfix.field.UnderlyingLastQty();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.UnderlyingLastQty field)
  { return isSetField(field); }
  public boolean isSetUnderlyingLastQty()
  { return isSetField(652); }
  public void set(org.quickfix.field.LastPx value)
  { setField(value); }
  public org.quickfix.field.LastPx get(org.quickfix.field.LastPx  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LastPx getLastPx() throws FieldNotFound
  { org.quickfix.field.LastPx value = new org.quickfix.field.LastPx();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LastPx field)
  { return isSetField(field); }
  public boolean isSetLastPx()
  { return isSetField(31); }
  public void set(org.quickfix.field.UnderlyingLastPx value)
  { setField(value); }
  public org.quickfix.field.UnderlyingLastPx get(org.quickfix.field.UnderlyingLastPx  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.UnderlyingLastPx getUnderlyingLastPx() throws FieldNotFound
  { org.quickfix.field.UnderlyingLastPx value = new org.quickfix.field.UnderlyingLastPx();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.UnderlyingLastPx field)
  { return isSetField(field); }
  public boolean isSetUnderlyingLastPx()
  { return isSetField(651); }
  public void set(org.quickfix.field.LastSpotRate value)
  { setField(value); }
  public org.quickfix.field.LastSpotRate get(org.quickfix.field.LastSpotRate  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LastSpotRate getLastSpotRate() throws FieldNotFound
  { org.quickfix.field.LastSpotRate value = new org.quickfix.field.LastSpotRate();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LastSpotRate field)
  { return isSetField(field); }
  public boolean isSetLastSpotRate()
  { return isSetField(194); }
  public void set(org.quickfix.field.LastForwardPoints value)
  { setField(value); }
  public org.quickfix.field.LastForwardPoints get(org.quickfix.field.LastForwardPoints  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LastForwardPoints getLastForwardPoints() throws FieldNotFound
  { org.quickfix.field.LastForwardPoints value = new org.quickfix.field.LastForwardPoints();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LastForwardPoints field)
  { return isSetField(field); }
  public boolean isSetLastForwardPoints()
  { return isSetField(195); }
  public void set(org.quickfix.field.LastMkt value)
  { setField(value); }
  public org.quickfix.field.LastMkt get(org.quickfix.field.LastMkt  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LastMkt getLastMkt() throws FieldNotFound
  { org.quickfix.field.LastMkt value = new org.quickfix.field.LastMkt();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LastMkt field)
  { return isSetField(field); }
  public boolean isSetLastMkt()
  { return isSetField(30); }
  public void set(org.quickfix.field.TradingSessionID value)
  { setField(value); }
  public org.quickfix.field.TradingSessionID get(org.quickfix.field.TradingSessionID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.TradingSessionID getTradingSessionID() throws FieldNotFound
  { org.quickfix.field.TradingSessionID value = new org.quickfix.field.TradingSessionID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.TradingSessionID field)
  { return isSetField(field); }
  public boolean isSetTradingSessionID()
  { return isSetField(336); }
  public void set(org.quickfix.field.TradingSessionSubID value)
  { setField(value); }
  public org.quickfix.field.TradingSessionSubID get(org.quickfix.field.TradingSessionSubID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.TradingSessionSubID getTradingSessionSubID() throws FieldNotFound
  { org.quickfix.field.TradingSessionSubID value = new org.quickfix.field.TradingSessionSubID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.TradingSessionSubID field)
  { return isSetField(field); }
  public boolean isSetTradingSessionSubID()
  { return isSetField(625); }
  public void set(org.quickfix.field.LastCapacity value)
  { setField(value); }
  public org.quickfix.field.LastCapacity get(org.quickfix.field.LastCapacity  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LastCapacity getLastCapacity() throws FieldNotFound
  { org.quickfix.field.LastCapacity value = new org.quickfix.field.LastCapacity();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LastCapacity field)
  { return isSetField(field); }
  public boolean isSetLastCapacity()
  { return isSetField(29); }
  public void set(org.quickfix.field.LeavesQty value)
  { setField(value); }
  public org.quickfix.field.LeavesQty get(org.quickfix.field.LeavesQty  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LeavesQty getLeavesQty() throws FieldNotFound
  { org.quickfix.field.LeavesQty value = new org.quickfix.field.LeavesQty();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LeavesQty field)
  { return isSetField(field); }
  public boolean isSetLeavesQty()
  { return isSetField(151); }
  public void set(org.quickfix.field.CumQty value)
  { setField(value); }
  public org.quickfix.field.CumQty get(org.quickfix.field.CumQty  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.CumQty getCumQty() throws FieldNotFound
  { org.quickfix.field.CumQty value = new org.quickfix.field.CumQty();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.CumQty field)
  { return isSetField(field); }
  public boolean isSetCumQty()
  { return isSetField(14); }
  public void set(org.quickfix.field.AvgPx value)
  { setField(value); }
  public org.quickfix.field.AvgPx get(org.quickfix.field.AvgPx  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.AvgPx getAvgPx() throws FieldNotFound
  { org.quickfix.field.AvgPx value = new org.quickfix.field.AvgPx();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.AvgPx field)
  { return isSetField(field); }
  public boolean isSetAvgPx()
  { return isSetField(6); }
  public void set(org.quickfix.field.DayOrderQty value)
  { setField(value); }
  public org.quickfix.field.DayOrderQty get(org.quickfix.field.DayOrderQty  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.DayOrderQty getDayOrderQty() throws FieldNotFound
  { org.quickfix.field.DayOrderQty value = new org.quickfix.field.DayOrderQty();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.DayOrderQty field)
  { return isSetField(field); }
  public boolean isSetDayOrderQty()
  { return isSetField(424); }
  public void set(org.quickfix.field.DayCumQty value)
  { setField(value); }
  public org.quickfix.field.DayCumQty get(org.quickfix.field.DayCumQty  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.DayCumQty getDayCumQty() throws FieldNotFound
  { org.quickfix.field.DayCumQty value = new org.quickfix.field.DayCumQty();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.DayCumQty field)
  { return isSetField(field); }
  public boolean isSetDayCumQty()
  { return isSetField(425); }
  public void set(org.quickfix.field.DayAvgPx value)
  { setField(value); }
  public org.quickfix.field.DayAvgPx get(org.quickfix.field.DayAvgPx  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.DayAvgPx getDayAvgPx() throws FieldNotFound
  { org.quickfix.field.DayAvgPx value = new org.quickfix.field.DayAvgPx();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.DayAvgPx field)
  { return isSetField(field); }
  public boolean isSetDayAvgPx()
  { return isSetField(426); }
  public void set(org.quickfix.field.GTBookingInst value)
  { setField(value); }
  public org.quickfix.field.GTBookingInst get(org.quickfix.field.GTBookingInst  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.GTBookingInst getGTBookingInst() throws FieldNotFound
  { org.quickfix.field.GTBookingInst value = new org.quickfix.field.GTBookingInst();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.GTBookingInst field)
  { return isSetField(field); }
  public boolean isSetGTBookingInst()
  { return isSetField(427); }
  public void set(org.quickfix.field.TradeDate value)
  { setField(value); }
  public org.quickfix.field.TradeDate get(org.quickfix.field.TradeDate  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.TradeDate getTradeDate() throws FieldNotFound
  { org.quickfix.field.TradeDate value = new org.quickfix.field.TradeDate();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.TradeDate field)
  { return isSetField(field); }
  public boolean isSetTradeDate()
  { return isSetField(75); }
  public void set(org.quickfix.field.TransactTime value)
  { setField(value); }
  public org.quickfix.field.TransactTime get(org.quickfix.field.TransactTime  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.TransactTime getTransactTime() throws FieldNotFound
  { org.quickfix.field.TransactTime value = new org.quickfix.field.TransactTime();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.TransactTime field)
  { return isSetField(field); }
  public boolean isSetTransactTime()
  { return isSetField(60); }
  public void set(org.quickfix.field.ReportToExch value)
  { setField(value); }
  public org.quickfix.field.ReportToExch get(org.quickfix.field.ReportToExch  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ReportToExch getReportToExch() throws FieldNotFound
  { org.quickfix.field.ReportToExch value = new org.quickfix.field.ReportToExch();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ReportToExch field)
  { return isSetField(field); }
  public boolean isSetReportToExch()
  { return isSetField(113); }
  public void set(org.quickfix.field.Commission value)
  { setField(value); }
  public org.quickfix.field.Commission get(org.quickfix.field.Commission  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.Commission getCommission() throws FieldNotFound
  { org.quickfix.field.Commission value = new org.quickfix.field.Commission();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.Commission field)
  { return isSetField(field); }
  public boolean isSetCommission()
  { return isSetField(12); }
  public void set(org.quickfix.field.CommType value)
  { setField(value); }
  public org.quickfix.field.CommType get(org.quickfix.field.CommType  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.CommType getCommType() throws FieldNotFound
  { org.quickfix.field.CommType value = new org.quickfix.field.CommType();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.CommType field)
  { return isSetField(field); }
  public boolean isSetCommType()
  { return isSetField(13); }
  public void set(org.quickfix.field.CommCurrency value)
  { setField(value); }
  public org.quickfix.field.CommCurrency get(org.quickfix.field.CommCurrency  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.CommCurrency getCommCurrency() throws FieldNotFound
  { org.quickfix.field.CommCurrency value = new org.quickfix.field.CommCurrency();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.CommCurrency field)
  { return isSetField(field); }
  public boolean isSetCommCurrency()
  { return isSetField(479); }
  public void set(org.quickfix.field.FundRenewWaiv value)
  { setField(value); }
  public org.quickfix.field.FundRenewWaiv get(org.quickfix.field.FundRenewWaiv  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.FundRenewWaiv getFundRenewWaiv() throws FieldNotFound
  { org.quickfix.field.FundRenewWaiv value = new org.quickfix.field.FundRenewWaiv();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.FundRenewWaiv field)
  { return isSetField(field); }
  public boolean isSetFundRenewWaiv()
  { return isSetField(497); }
  public void set(org.quickfix.field.Spread value)
  { setField(value); }
  public org.quickfix.field.Spread get(org.quickfix.field.Spread  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.Spread getSpread() throws FieldNotFound
  { org.quickfix.field.Spread value = new org.quickfix.field.Spread();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.Spread field)
  { return isSetField(field); }
  public boolean isSetSpread()
  { return isSetField(218); }
  public void set(org.quickfix.field.BenchmarkCurveCurrency value)
  { setField(value); }
  public org.quickfix.field.BenchmarkCurveCurrency get(org.quickfix.field.BenchmarkCurveCurrency  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.BenchmarkCurveCurrency getBenchmarkCurveCurrency() throws FieldNotFound
  { org.quickfix.field.BenchmarkCurveCurrency value = new org.quickfix.field.BenchmarkCurveCurrency();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.BenchmarkCurveCurrency field)
  { return isSetField(field); }
  public boolean isSetBenchmarkCurveCurrency()
  { return isSetField(220); }
  public void set(org.quickfix.field.BenchmarkCurveName value)
  { setField(value); }
  public org.quickfix.field.BenchmarkCurveName get(org.quickfix.field.BenchmarkCurveName  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.BenchmarkCurveName getBenchmarkCurveName() throws FieldNotFound
  { org.quickfix.field.BenchmarkCurveName value = new org.quickfix.field.BenchmarkCurveName();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.BenchmarkCurveName field)
  { return isSetField(field); }
  public boolean isSetBenchmarkCurveName()
  { return isSetField(221); }
  public void set(org.quickfix.field.BenchmarkCurvePoint value)
  { setField(value); }
  public org.quickfix.field.BenchmarkCurvePoint get(org.quickfix.field.BenchmarkCurvePoint  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.BenchmarkCurvePoint getBenchmarkCurvePoint() throws FieldNotFound
  { org.quickfix.field.BenchmarkCurvePoint value = new org.quickfix.field.BenchmarkCurvePoint();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.BenchmarkCurvePoint field)
  { return isSetField(field); }
  public boolean isSetBenchmarkCurvePoint()
  { return isSetField(222); }
  public void set(org.quickfix.field.YieldType value)
  { setField(value); }
  public org.quickfix.field.YieldType get(org.quickfix.field.YieldType  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.YieldType getYieldType() throws FieldNotFound
  { org.quickfix.field.YieldType value = new org.quickfix.field.YieldType();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.YieldType field)
  { return isSetField(field); }
  public boolean isSetYieldType()
  { return isSetField(235); }
  public void set(org.quickfix.field.Yield value)
  { setField(value); }
  public org.quickfix.field.Yield get(org.quickfix.field.Yield  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.Yield getYield() throws FieldNotFound
  { org.quickfix.field.Yield value = new org.quickfix.field.Yield();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.Yield field)
  { return isSetField(field); }
  public boolean isSetYield()
  { return isSetField(236); }
  public void set(org.quickfix.field.GrossTradeAmt value)
  { setField(value); }
  public org.quickfix.field.GrossTradeAmt get(org.quickfix.field.GrossTradeAmt  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.GrossTradeAmt getGrossTradeAmt() throws FieldNotFound
  { org.quickfix.field.GrossTradeAmt value = new org.quickfix.field.GrossTradeAmt();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.GrossTradeAmt field)
  { return isSetField(field); }
  public boolean isSetGrossTradeAmt()
  { return isSetField(381); }
  public void set(org.quickfix.field.NumDaysInterest value)
  { setField(value); }
  public org.quickfix.field.NumDaysInterest get(org.quickfix.field.NumDaysInterest  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.NumDaysInterest getNumDaysInterest() throws FieldNotFound
  { org.quickfix.field.NumDaysInterest value = new org.quickfix.field.NumDaysInterest();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.NumDaysInterest field)
  { return isSetField(field); }
  public boolean isSetNumDaysInterest()
  { return isSetField(157); }
  public void set(org.quickfix.field.ExDate value)
  { setField(value); }
  public org.quickfix.field.ExDate get(org.quickfix.field.ExDate  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ExDate getExDate() throws FieldNotFound
  { org.quickfix.field.ExDate value = new org.quickfix.field.ExDate();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ExDate field)
  { return isSetField(field); }
  public boolean isSetExDate()
  { return isSetField(230); }
  public void set(org.quickfix.field.AccruedInterestRate value)
  { setField(value); }
  public org.quickfix.field.AccruedInterestRate get(org.quickfix.field.AccruedInterestRate  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.AccruedInterestRate getAccruedInterestRate() throws FieldNotFound
  { org.quickfix.field.AccruedInterestRate value = new org.quickfix.field.AccruedInterestRate();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.AccruedInterestRate field)
  { return isSetField(field); }
  public boolean isSetAccruedInterestRate()
  { return isSetField(158); }
  public void set(org.quickfix.field.AccruedInterestAmt value)
  { setField(value); }
  public org.quickfix.field.AccruedInterestAmt get(org.quickfix.field.AccruedInterestAmt  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.AccruedInterestAmt getAccruedInterestAmt() throws FieldNotFound
  { org.quickfix.field.AccruedInterestAmt value = new org.quickfix.field.AccruedInterestAmt();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.AccruedInterestAmt field)
  { return isSetField(field); }
  public boolean isSetAccruedInterestAmt()
  { return isSetField(159); }
  public void set(org.quickfix.field.TradedFlatSwitch value)
  { setField(value); }
  public org.quickfix.field.TradedFlatSwitch get(org.quickfix.field.TradedFlatSwitch  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.TradedFlatSwitch getTradedFlatSwitch() throws FieldNotFound
  { org.quickfix.field.TradedFlatSwitch value = new org.quickfix.field.TradedFlatSwitch();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.TradedFlatSwitch field)
  { return isSetField(field); }
  public boolean isSetTradedFlatSwitch()
  { return isSetField(258); }
  public void set(org.quickfix.field.BasisFeatureDate value)
  { setField(value); }
  public org.quickfix.field.BasisFeatureDate get(org.quickfix.field.BasisFeatureDate  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.BasisFeatureDate getBasisFeatureDate() throws FieldNotFound
  { org.quickfix.field.BasisFeatureDate value = new org.quickfix.field.BasisFeatureDate();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.BasisFeatureDate field)
  { return isSetField(field); }
  public boolean isSetBasisFeatureDate()
  { return isSetField(259); }
  public void set(org.quickfix.field.BasisFeaturePrice value)
  { setField(value); }
  public org.quickfix.field.BasisFeaturePrice get(org.quickfix.field.BasisFeaturePrice  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.BasisFeaturePrice getBasisFeaturePrice() throws FieldNotFound
  { org.quickfix.field.BasisFeaturePrice value = new org.quickfix.field.BasisFeaturePrice();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.BasisFeaturePrice field)
  { return isSetField(field); }
  public boolean isSetBasisFeaturePrice()
  { return isSetField(260); }
  public void set(org.quickfix.field.Concession value)
  { setField(value); }
  public org.quickfix.field.Concession get(org.quickfix.field.Concession  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.Concession getConcession() throws FieldNotFound
  { org.quickfix.field.Concession value = new org.quickfix.field.Concession();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.Concession field)
  { return isSetField(field); }
  public boolean isSetConcession()
  { return isSetField(238); }
  public void set(org.quickfix.field.TotalTakedown value)
  { setField(value); }
  public org.quickfix.field.TotalTakedown get(org.quickfix.field.TotalTakedown  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.TotalTakedown getTotalTakedown() throws FieldNotFound
  { org.quickfix.field.TotalTakedown value = new org.quickfix.field.TotalTakedown();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.TotalTakedown field)
  { return isSetField(field); }
  public boolean isSetTotalTakedown()
  { return isSetField(237); }
  public void set(org.quickfix.field.NetMoney value)
  { setField(value); }
  public org.quickfix.field.NetMoney get(org.quickfix.field.NetMoney  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.NetMoney getNetMoney() throws FieldNotFound
  { org.quickfix.field.NetMoney value = new org.quickfix.field.NetMoney();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.NetMoney field)
  { return isSetField(field); }
  public boolean isSetNetMoney()
  { return isSetField(118); }
  public void set(org.quickfix.field.SettlCurrAmt value)
  { setField(value); }
  public org.quickfix.field.SettlCurrAmt get(org.quickfix.field.SettlCurrAmt  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SettlCurrAmt getSettlCurrAmt() throws FieldNotFound
  { org.quickfix.field.SettlCurrAmt value = new org.quickfix.field.SettlCurrAmt();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SettlCurrAmt field)
  { return isSetField(field); }
  public boolean isSetSettlCurrAmt()
  { return isSetField(119); }
  public void set(org.quickfix.field.SettlCurrency value)
  { setField(value); }
  public org.quickfix.field.SettlCurrency get(org.quickfix.field.SettlCurrency  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SettlCurrency getSettlCurrency() throws FieldNotFound
  { org.quickfix.field.SettlCurrency value = new org.quickfix.field.SettlCurrency();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SettlCurrency field)
  { return isSetField(field); }
  public boolean isSetSettlCurrency()
  { return isSetField(120); }
  public void set(org.quickfix.field.SettlCurrFxRate value)
  { setField(value); }
  public org.quickfix.field.SettlCurrFxRate get(org.quickfix.field.SettlCurrFxRate  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SettlCurrFxRate getSettlCurrFxRate() throws FieldNotFound
  { org.quickfix.field.SettlCurrFxRate value = new org.quickfix.field.SettlCurrFxRate();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SettlCurrFxRate field)
  { return isSetField(field); }
  public boolean isSetSettlCurrFxRate()
  { return isSetField(155); }
  public void set(org.quickfix.field.SettlCurrFxRateCalc value)
  { setField(value); }
  public org.quickfix.field.SettlCurrFxRateCalc get(org.quickfix.field.SettlCurrFxRateCalc  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.SettlCurrFxRateCalc getSettlCurrFxRateCalc() throws FieldNotFound
  { org.quickfix.field.SettlCurrFxRateCalc value = new org.quickfix.field.SettlCurrFxRateCalc();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.SettlCurrFxRateCalc field)
  { return isSetField(field); }
  public boolean isSetSettlCurrFxRateCalc()
  { return isSetField(156); }
  public void set(org.quickfix.field.HandlInst value)
  { setField(value); }
  public org.quickfix.field.HandlInst get(org.quickfix.field.HandlInst  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.HandlInst getHandlInst() throws FieldNotFound
  { org.quickfix.field.HandlInst value = new org.quickfix.field.HandlInst();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.HandlInst field)
  { return isSetField(field); }
  public boolean isSetHandlInst()
  { return isSetField(21); }
  public void set(org.quickfix.field.MinQty value)
  { setField(value); }
  public org.quickfix.field.MinQty get(org.quickfix.field.MinQty  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.MinQty getMinQty() throws FieldNotFound
  { org.quickfix.field.MinQty value = new org.quickfix.field.MinQty();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.MinQty field)
  { return isSetField(field); }
  public boolean isSetMinQty()
  { return isSetField(110); }
  public void set(org.quickfix.field.MaxFloor value)
  { setField(value); }
  public org.quickfix.field.MaxFloor get(org.quickfix.field.MaxFloor  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.MaxFloor getMaxFloor() throws FieldNotFound
  { org.quickfix.field.MaxFloor value = new org.quickfix.field.MaxFloor();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.MaxFloor field)
  { return isSetField(field); }
  public boolean isSetMaxFloor()
  { return isSetField(111); }
  public void set(org.quickfix.field.PositionEffect value)
  { setField(value); }
  public org.quickfix.field.PositionEffect get(org.quickfix.field.PositionEffect  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.PositionEffect getPositionEffect() throws FieldNotFound
  { org.quickfix.field.PositionEffect value = new org.quickfix.field.PositionEffect();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.PositionEffect field)
  { return isSetField(field); }
  public boolean isSetPositionEffect()
  { return isSetField(77); }
  public void set(org.quickfix.field.MaxShow value)
  { setField(value); }
  public org.quickfix.field.MaxShow get(org.quickfix.field.MaxShow  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.MaxShow getMaxShow() throws FieldNotFound
  { org.quickfix.field.MaxShow value = new org.quickfix.field.MaxShow();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.MaxShow field)
  { return isSetField(field); }
  public boolean isSetMaxShow()
  { return isSetField(210); }
  public void set(org.quickfix.field.Text value)
  { setField(value); }
  public org.quickfix.field.Text get(org.quickfix.field.Text  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.Text getText() throws FieldNotFound
  { org.quickfix.field.Text value = new org.quickfix.field.Text();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.Text field)
  { return isSetField(field); }
  public boolean isSetText()
  { return isSetField(58); }
  public void set(org.quickfix.field.EncodedTextLen value)
  { setField(value); }
  public org.quickfix.field.EncodedTextLen get(org.quickfix.field.EncodedTextLen  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.EncodedTextLen getEncodedTextLen() throws FieldNotFound
  { org.quickfix.field.EncodedTextLen value = new org.quickfix.field.EncodedTextLen();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.EncodedTextLen field)
  { return isSetField(field); }
  public boolean isSetEncodedTextLen()
  { return isSetField(354); }
  public void set(org.quickfix.field.EncodedText value)
  { setField(value); }
  public org.quickfix.field.EncodedText get(org.quickfix.field.EncodedText  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.EncodedText getEncodedText() throws FieldNotFound
  { org.quickfix.field.EncodedText value = new org.quickfix.field.EncodedText();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.EncodedText field)
  { return isSetField(field); }
  public boolean isSetEncodedText()
  { return isSetField(355); }
  public void set(org.quickfix.field.FutSettDate2 value)
  { setField(value); }
  public org.quickfix.field.FutSettDate2 get(org.quickfix.field.FutSettDate2  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.FutSettDate2 getFutSettDate2() throws FieldNotFound
  { org.quickfix.field.FutSettDate2 value = new org.quickfix.field.FutSettDate2();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.FutSettDate2 field)
  { return isSetField(field); }
  public boolean isSetFutSettDate2()
  { return isSetField(193); }
  public void set(org.quickfix.field.OrderQty2 value)
  { setField(value); }
  public org.quickfix.field.OrderQty2 get(org.quickfix.field.OrderQty2  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.OrderQty2 getOrderQty2() throws FieldNotFound
  { org.quickfix.field.OrderQty2 value = new org.quickfix.field.OrderQty2();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.OrderQty2 field)
  { return isSetField(field); }
  public boolean isSetOrderQty2()
  { return isSetField(192); }
  public void set(org.quickfix.field.LastForwardPoints2 value)
  { setField(value); }
  public org.quickfix.field.LastForwardPoints2 get(org.quickfix.field.LastForwardPoints2  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LastForwardPoints2 getLastForwardPoints2() throws FieldNotFound
  { org.quickfix.field.LastForwardPoints2 value = new org.quickfix.field.LastForwardPoints2();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LastForwardPoints2 field)
  { return isSetField(field); }
  public boolean isSetLastForwardPoints2()
  { return isSetField(641); }
  public void set(org.quickfix.field.MultiLegReportingType value)
  { setField(value); }
  public org.quickfix.field.MultiLegReportingType get(org.quickfix.field.MultiLegReportingType  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.MultiLegReportingType getMultiLegReportingType() throws FieldNotFound
  { org.quickfix.field.MultiLegReportingType value = new org.quickfix.field.MultiLegReportingType();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.MultiLegReportingType field)
  { return isSetField(field); }
  public boolean isSetMultiLegReportingType()
  { return isSetField(442); }
  public void set(org.quickfix.field.CancellationRights value)
  { setField(value); }
  public org.quickfix.field.CancellationRights get(org.quickfix.field.CancellationRights  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.CancellationRights getCancellationRights() throws FieldNotFound
  { org.quickfix.field.CancellationRights value = new org.quickfix.field.CancellationRights();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.CancellationRights field)
  { return isSetField(field); }
  public boolean isSetCancellationRights()
  { return isSetField(480); }
  public void set(org.quickfix.field.MoneyLaunderingStatus value)
  { setField(value); }
  public org.quickfix.field.MoneyLaunderingStatus get(org.quickfix.field.MoneyLaunderingStatus  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.MoneyLaunderingStatus getMoneyLaunderingStatus() throws FieldNotFound
  { org.quickfix.field.MoneyLaunderingStatus value = new org.quickfix.field.MoneyLaunderingStatus();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.MoneyLaunderingStatus field)
  { return isSetField(field); }
  public boolean isSetMoneyLaunderingStatus()
  { return isSetField(481); }
  public void set(org.quickfix.field.RegistID value)
  { setField(value); }
  public org.quickfix.field.RegistID get(org.quickfix.field.RegistID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.RegistID getRegistID() throws FieldNotFound
  { org.quickfix.field.RegistID value = new org.quickfix.field.RegistID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.RegistID field)
  { return isSetField(field); }
  public boolean isSetRegistID()
  { return isSetField(513); }
  public void set(org.quickfix.field.Designation value)
  { setField(value); }
  public org.quickfix.field.Designation get(org.quickfix.field.Designation  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.Designation getDesignation() throws FieldNotFound
  { org.quickfix.field.Designation value = new org.quickfix.field.Designation();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.Designation field)
  { return isSetField(field); }
  public boolean isSetDesignation()
  { return isSetField(494); }
  public void set(org.quickfix.field.TransBkdTime value)
  { setField(value); }
  public org.quickfix.field.TransBkdTime get(org.quickfix.field.TransBkdTime  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.TransBkdTime getTransBkdTime() throws FieldNotFound
  { org.quickfix.field.TransBkdTime value = new org.quickfix.field.TransBkdTime();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.TransBkdTime field)
  { return isSetField(field); }
  public boolean isSetTransBkdTime()
  { return isSetField(483); }
  public void set(org.quickfix.field.ExecValuationPoint value)
  { setField(value); }
  public org.quickfix.field.ExecValuationPoint get(org.quickfix.field.ExecValuationPoint  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ExecValuationPoint getExecValuationPoint() throws FieldNotFound
  { org.quickfix.field.ExecValuationPoint value = new org.quickfix.field.ExecValuationPoint();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ExecValuationPoint field)
  { return isSetField(field); }
  public boolean isSetExecValuationPoint()
  { return isSetField(515); }
  public void set(org.quickfix.field.ExecPriceType value)
  { setField(value); }
  public org.quickfix.field.ExecPriceType get(org.quickfix.field.ExecPriceType  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ExecPriceType getExecPriceType() throws FieldNotFound
  { org.quickfix.field.ExecPriceType value = new org.quickfix.field.ExecPriceType();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ExecPriceType field)
  { return isSetField(field); }
  public boolean isSetExecPriceType()
  { return isSetField(484); }
  public void set(org.quickfix.field.ExecPriceAdjustment value)
  { setField(value); }
  public org.quickfix.field.ExecPriceAdjustment get(org.quickfix.field.ExecPriceAdjustment  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ExecPriceAdjustment getExecPriceAdjustment() throws FieldNotFound
  { org.quickfix.field.ExecPriceAdjustment value = new org.quickfix.field.ExecPriceAdjustment();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ExecPriceAdjustment field)
  { return isSetField(field); }
  public boolean isSetExecPriceAdjustment()
  { return isSetField(485); }
  public void set(org.quickfix.field.PriorityIndicator value)
  { setField(value); }
  public org.quickfix.field.PriorityIndicator get(org.quickfix.field.PriorityIndicator  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.PriorityIndicator getPriorityIndicator() throws FieldNotFound
  { org.quickfix.field.PriorityIndicator value = new org.quickfix.field.PriorityIndicator();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.PriorityIndicator field)
  { return isSetField(field); }
  public boolean isSetPriorityIndicator()
  { return isSetField(638); }
  public void set(org.quickfix.field.PriceImprovement value)
  { setField(value); }
  public org.quickfix.field.PriceImprovement get(org.quickfix.field.PriceImprovement  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.PriceImprovement getPriceImprovement() throws FieldNotFound
  { org.quickfix.field.PriceImprovement value = new org.quickfix.field.PriceImprovement();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.PriceImprovement field)
  { return isSetField(field); }
  public boolean isSetPriceImprovement()
  { return isSetField(639); }
  public void set(org.quickfix.field.NoContraBrokers value)
  { setField(value); }
  public org.quickfix.field.NoContraBrokers get(org.quickfix.field.NoContraBrokers  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.NoContraBrokers getNoContraBrokers() throws FieldNotFound
  { org.quickfix.field.NoContraBrokers value = new org.quickfix.field.NoContraBrokers();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.NoContraBrokers field)
  { return isSetField(field); }
  public boolean isSetNoContraBrokers()
  { return isSetField(382); }
  public static class NoContraBrokers extends Group {
    public NoContraBrokers() {
      super(382,375,
      new int[] {375,337,437,438,655,0 } ); }
  public void set(org.quickfix.field.ContraBroker value)
  { setField(value); }
  public org.quickfix.field.ContraBroker get(org.quickfix.field.ContraBroker  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ContraBroker getContraBroker() throws FieldNotFound
  { org.quickfix.field.ContraBroker value = new org.quickfix.field.ContraBroker();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ContraBroker field)
  { return isSetField(field); }
  public boolean isSetContraBroker()
  { return isSetField(375); }
  public void set(org.quickfix.field.ContraTrader value)
  { setField(value); }
  public org.quickfix.field.ContraTrader get(org.quickfix.field.ContraTrader  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ContraTrader getContraTrader() throws FieldNotFound
  { org.quickfix.field.ContraTrader value = new org.quickfix.field.ContraTrader();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ContraTrader field)
  { return isSetField(field); }
  public boolean isSetContraTrader()
  { return isSetField(337); }
  public void set(org.quickfix.field.ContraTradeQty value)
  { setField(value); }
  public org.quickfix.field.ContraTradeQty get(org.quickfix.field.ContraTradeQty  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ContraTradeQty getContraTradeQty() throws FieldNotFound
  { org.quickfix.field.ContraTradeQty value = new org.quickfix.field.ContraTradeQty();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ContraTradeQty field)
  { return isSetField(field); }
  public boolean isSetContraTradeQty()
  { return isSetField(437); }
  public void set(org.quickfix.field.ContraTradeTime value)
  { setField(value); }
  public org.quickfix.field.ContraTradeTime get(org.quickfix.field.ContraTradeTime  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ContraTradeTime getContraTradeTime() throws FieldNotFound
  { org.quickfix.field.ContraTradeTime value = new org.quickfix.field.ContraTradeTime();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ContraTradeTime field)
  { return isSetField(field); }
  public boolean isSetContraTradeTime()
  { return isSetField(438); }
  public void set(org.quickfix.field.ContraLegRefID value)
  { setField(value); }
  public org.quickfix.field.ContraLegRefID get(org.quickfix.field.ContraLegRefID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ContraLegRefID getContraLegRefID() throws FieldNotFound
  { org.quickfix.field.ContraLegRefID value = new org.quickfix.field.ContraLegRefID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ContraLegRefID field)
  { return isSetField(field); }
  public boolean isSetContraLegRefID()
  { return isSetField(655); }
}
  public void set(org.quickfix.field.NoContAmts value)
  { setField(value); }
  public org.quickfix.field.NoContAmts get(org.quickfix.field.NoContAmts  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.NoContAmts getNoContAmts() throws FieldNotFound
  { org.quickfix.field.NoContAmts value = new org.quickfix.field.NoContAmts();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.NoContAmts field)
  { return isSetField(field); }
  public boolean isSetNoContAmts()
  { return isSetField(518); }
  public static class NoContAmts extends Group {
    public NoContAmts() {
      super(518,519,
      new int[] {519,520,521,0 } ); }
  public void set(org.quickfix.field.ContAmtType value)
  { setField(value); }
  public org.quickfix.field.ContAmtType get(org.quickfix.field.ContAmtType  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ContAmtType getContAmtType() throws FieldNotFound
  { org.quickfix.field.ContAmtType value = new org.quickfix.field.ContAmtType();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ContAmtType field)
  { return isSetField(field); }
  public boolean isSetContAmtType()
  { return isSetField(519); }
  public void set(org.quickfix.field.ContAmtValue value)
  { setField(value); }
  public org.quickfix.field.ContAmtValue get(org.quickfix.field.ContAmtValue  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ContAmtValue getContAmtValue() throws FieldNotFound
  { org.quickfix.field.ContAmtValue value = new org.quickfix.field.ContAmtValue();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ContAmtValue field)
  { return isSetField(field); }
  public boolean isSetContAmtValue()
  { return isSetField(520); }
  public void set(org.quickfix.field.ContAmtCurr value)
  { setField(value); }
  public org.quickfix.field.ContAmtCurr get(org.quickfix.field.ContAmtCurr  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.ContAmtCurr getContAmtCurr() throws FieldNotFound
  { org.quickfix.field.ContAmtCurr value = new org.quickfix.field.ContAmtCurr();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.ContAmtCurr field)
  { return isSetField(field); }
  public boolean isSetContAmtCurr()
  { return isSetField(521); }
}
  public void set(org.quickfix.field.NoLegs value)
  { setField(value); }
  public org.quickfix.field.NoLegs get(org.quickfix.field.NoLegs  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.NoLegs getNoLegs() throws FieldNotFound
  { org.quickfix.field.NoLegs value = new org.quickfix.field.NoLegs();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.NoLegs field)
  { return isSetField(field); }
  public boolean isSetNoLegs()
  { return isSetField(555); }
  public static class NoLegs extends Group {
    public NoLegs() {
      super(555,600,
      new int[] {600,601,602,603,607,608,609,610,611,248,249,250,251,252,253,257,599,596,597,598,254,612,613,614,615,616,617,618,619,620,621,622,623,624,564,565,654,566,587,588,637,0 } ); }
  public void set(org.quickfix.field.LegSymbol value)
  { setField(value); }
  public org.quickfix.field.LegSymbol get(org.quickfix.field.LegSymbol  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegSymbol getLegSymbol() throws FieldNotFound
  { org.quickfix.field.LegSymbol value = new org.quickfix.field.LegSymbol();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegSymbol field)
  { return isSetField(field); }
  public boolean isSetLegSymbol()
  { return isSetField(600); }
  public void set(org.quickfix.field.LegSymbolSfx value)
  { setField(value); }
  public org.quickfix.field.LegSymbolSfx get(org.quickfix.field.LegSymbolSfx  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegSymbolSfx getLegSymbolSfx() throws FieldNotFound
  { org.quickfix.field.LegSymbolSfx value = new org.quickfix.field.LegSymbolSfx();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegSymbolSfx field)
  { return isSetField(field); }
  public boolean isSetLegSymbolSfx()
  { return isSetField(601); }
  public void set(org.quickfix.field.LegSecurityID value)
  { setField(value); }
  public org.quickfix.field.LegSecurityID get(org.quickfix.field.LegSecurityID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegSecurityID getLegSecurityID() throws FieldNotFound
  { org.quickfix.field.LegSecurityID value = new org.quickfix.field.LegSecurityID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegSecurityID field)
  { return isSetField(field); }
  public boolean isSetLegSecurityID()
  { return isSetField(602); }
  public void set(org.quickfix.field.LegSecurityIDSource value)
  { setField(value); }
  public org.quickfix.field.LegSecurityIDSource get(org.quickfix.field.LegSecurityIDSource  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegSecurityIDSource getLegSecurityIDSource() throws FieldNotFound
  { org.quickfix.field.LegSecurityIDSource value = new org.quickfix.field.LegSecurityIDSource();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegSecurityIDSource field)
  { return isSetField(field); }
  public boolean isSetLegSecurityIDSource()
  { return isSetField(603); }
  public void set(org.quickfix.field.LegProduct value)
  { setField(value); }
  public org.quickfix.field.LegProduct get(org.quickfix.field.LegProduct  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegProduct getLegProduct() throws FieldNotFound
  { org.quickfix.field.LegProduct value = new org.quickfix.field.LegProduct();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegProduct field)
  { return isSetField(field); }
  public boolean isSetLegProduct()
  { return isSetField(607); }
  public void set(org.quickfix.field.LegCFICode value)
  { setField(value); }
  public org.quickfix.field.LegCFICode get(org.quickfix.field.LegCFICode  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegCFICode getLegCFICode() throws FieldNotFound
  { org.quickfix.field.LegCFICode value = new org.quickfix.field.LegCFICode();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegCFICode field)
  { return isSetField(field); }
  public boolean isSetLegCFICode()
  { return isSetField(608); }
  public void set(org.quickfix.field.LegSecurityType value)
  { setField(value); }
  public org.quickfix.field.LegSecurityType get(org.quickfix.field.LegSecurityType  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegSecurityType getLegSecurityType() throws FieldNotFound
  { org.quickfix.field.LegSecurityType value = new org.quickfix.field.LegSecurityType();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegSecurityType field)
  { return isSetField(field); }
  public boolean isSetLegSecurityType()
  { return isSetField(609); }
  public void set(org.quickfix.field.LegMaturityMonthYear value)
  { setField(value); }
  public org.quickfix.field.LegMaturityMonthYear get(org.quickfix.field.LegMaturityMonthYear  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegMaturityMonthYear getLegMaturityMonthYear() throws FieldNotFound
  { org.quickfix.field.LegMaturityMonthYear value = new org.quickfix.field.LegMaturityMonthYear();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegMaturityMonthYear field)
  { return isSetField(field); }
  public boolean isSetLegMaturityMonthYear()
  { return isSetField(610); }
  public void set(org.quickfix.field.LegMaturityDate value)
  { setField(value); }
  public org.quickfix.field.LegMaturityDate get(org.quickfix.field.LegMaturityDate  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegMaturityDate getLegMaturityDate() throws FieldNotFound
  { org.quickfix.field.LegMaturityDate value = new org.quickfix.field.LegMaturityDate();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegMaturityDate field)
  { return isSetField(field); }
  public boolean isSetLegMaturityDate()
  { return isSetField(611); }
  public void set(org.quickfix.field.LegCouponPaymentDate value)
  { setField(value); }
  public org.quickfix.field.LegCouponPaymentDate get(org.quickfix.field.LegCouponPaymentDate  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegCouponPaymentDate getLegCouponPaymentDate() throws FieldNotFound
  { org.quickfix.field.LegCouponPaymentDate value = new org.quickfix.field.LegCouponPaymentDate();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegCouponPaymentDate field)
  { return isSetField(field); }
  public boolean isSetLegCouponPaymentDate()
  { return isSetField(248); }
  public void set(org.quickfix.field.LegIssueDate value)
  { setField(value); }
  public org.quickfix.field.LegIssueDate get(org.quickfix.field.LegIssueDate  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegIssueDate getLegIssueDate() throws FieldNotFound
  { org.quickfix.field.LegIssueDate value = new org.quickfix.field.LegIssueDate();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegIssueDate field)
  { return isSetField(field); }
  public boolean isSetLegIssueDate()
  { return isSetField(249); }
  public void set(org.quickfix.field.LegRepoCollateralSecurityType value)
  { setField(value); }
  public org.quickfix.field.LegRepoCollateralSecurityType get(org.quickfix.field.LegRepoCollateralSecurityType  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegRepoCollateralSecurityType getLegRepoCollateralSecurityType() throws FieldNotFound
  { org.quickfix.field.LegRepoCollateralSecurityType value = new org.quickfix.field.LegRepoCollateralSecurityType();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegRepoCollateralSecurityType field)
  { return isSetField(field); }
  public boolean isSetLegRepoCollateralSecurityType()
  { return isSetField(250); }
  public void set(org.quickfix.field.LegRepurchaseTerm value)
  { setField(value); }
  public org.quickfix.field.LegRepurchaseTerm get(org.quickfix.field.LegRepurchaseTerm  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegRepurchaseTerm getLegRepurchaseTerm() throws FieldNotFound
  { org.quickfix.field.LegRepurchaseTerm value = new org.quickfix.field.LegRepurchaseTerm();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegRepurchaseTerm field)
  { return isSetField(field); }
  public boolean isSetLegRepurchaseTerm()
  { return isSetField(251); }
  public void set(org.quickfix.field.LegRepurchaseRate value)
  { setField(value); }
  public org.quickfix.field.LegRepurchaseRate get(org.quickfix.field.LegRepurchaseRate  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegRepurchaseRate getLegRepurchaseRate() throws FieldNotFound
  { org.quickfix.field.LegRepurchaseRate value = new org.quickfix.field.LegRepurchaseRate();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegRepurchaseRate field)
  { return isSetField(field); }
  public boolean isSetLegRepurchaseRate()
  { return isSetField(252); }
  public void set(org.quickfix.field.LegFactor value)
  { setField(value); }
  public org.quickfix.field.LegFactor get(org.quickfix.field.LegFactor  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegFactor getLegFactor() throws FieldNotFound
  { org.quickfix.field.LegFactor value = new org.quickfix.field.LegFactor();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegFactor field)
  { return isSetField(field); }
  public boolean isSetLegFactor()
  { return isSetField(253); }
  public void set(org.quickfix.field.LegCreditRating value)
  { setField(value); }
  public org.quickfix.field.LegCreditRating get(org.quickfix.field.LegCreditRating  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegCreditRating getLegCreditRating() throws FieldNotFound
  { org.quickfix.field.LegCreditRating value = new org.quickfix.field.LegCreditRating();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegCreditRating field)
  { return isSetField(field); }
  public boolean isSetLegCreditRating()
  { return isSetField(257); }
  public void set(org.quickfix.field.LegInstrRegistry value)
  { setField(value); }
  public org.quickfix.field.LegInstrRegistry get(org.quickfix.field.LegInstrRegistry  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegInstrRegistry getLegInstrRegistry() throws FieldNotFound
  { org.quickfix.field.LegInstrRegistry value = new org.quickfix.field.LegInstrRegistry();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegInstrRegistry field)
  { return isSetField(field); }
  public boolean isSetLegInstrRegistry()
  { return isSetField(599); }
  public void set(org.quickfix.field.LegCountryOfIssue value)
  { setField(value); }
  public org.quickfix.field.LegCountryOfIssue get(org.quickfix.field.LegCountryOfIssue  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegCountryOfIssue getLegCountryOfIssue() throws FieldNotFound
  { org.quickfix.field.LegCountryOfIssue value = new org.quickfix.field.LegCountryOfIssue();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegCountryOfIssue field)
  { return isSetField(field); }
  public boolean isSetLegCountryOfIssue()
  { return isSetField(596); }
  public void set(org.quickfix.field.LegStateOrProvinceOfIssue value)
  { setField(value); }
  public org.quickfix.field.LegStateOrProvinceOfIssue get(org.quickfix.field.LegStateOrProvinceOfIssue  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegStateOrProvinceOfIssue getLegStateOrProvinceOfIssue() throws FieldNotFound
  { org.quickfix.field.LegStateOrProvinceOfIssue value = new org.quickfix.field.LegStateOrProvinceOfIssue();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegStateOrProvinceOfIssue field)
  { return isSetField(field); }
  public boolean isSetLegStateOrProvinceOfIssue()
  { return isSetField(597); }
  public void set(org.quickfix.field.LegLocaleOfIssue value)
  { setField(value); }
  public org.quickfix.field.LegLocaleOfIssue get(org.quickfix.field.LegLocaleOfIssue  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegLocaleOfIssue getLegLocaleOfIssue() throws FieldNotFound
  { org.quickfix.field.LegLocaleOfIssue value = new org.quickfix.field.LegLocaleOfIssue();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegLocaleOfIssue field)
  { return isSetField(field); }
  public boolean isSetLegLocaleOfIssue()
  { return isSetField(598); }
  public void set(org.quickfix.field.LegRedemptionDate value)
  { setField(value); }
  public org.quickfix.field.LegRedemptionDate get(org.quickfix.field.LegRedemptionDate  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegRedemptionDate getLegRedemptionDate() throws FieldNotFound
  { org.quickfix.field.LegRedemptionDate value = new org.quickfix.field.LegRedemptionDate();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegRedemptionDate field)
  { return isSetField(field); }
  public boolean isSetLegRedemptionDate()
  { return isSetField(254); }
  public void set(org.quickfix.field.LegStrikePrice value)
  { setField(value); }
  public org.quickfix.field.LegStrikePrice get(org.quickfix.field.LegStrikePrice  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegStrikePrice getLegStrikePrice() throws FieldNotFound
  { org.quickfix.field.LegStrikePrice value = new org.quickfix.field.LegStrikePrice();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegStrikePrice field)
  { return isSetField(field); }
  public boolean isSetLegStrikePrice()
  { return isSetField(612); }
  public void set(org.quickfix.field.LegOptAttribute value)
  { setField(value); }
  public org.quickfix.field.LegOptAttribute get(org.quickfix.field.LegOptAttribute  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegOptAttribute getLegOptAttribute() throws FieldNotFound
  { org.quickfix.field.LegOptAttribute value = new org.quickfix.field.LegOptAttribute();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegOptAttribute field)
  { return isSetField(field); }
  public boolean isSetLegOptAttribute()
  { return isSetField(613); }
  public void set(org.quickfix.field.LegContractMultiplier value)
  { setField(value); }
  public org.quickfix.field.LegContractMultiplier get(org.quickfix.field.LegContractMultiplier  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegContractMultiplier getLegContractMultiplier() throws FieldNotFound
  { org.quickfix.field.LegContractMultiplier value = new org.quickfix.field.LegContractMultiplier();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegContractMultiplier field)
  { return isSetField(field); }
  public boolean isSetLegContractMultiplier()
  { return isSetField(614); }
  public void set(org.quickfix.field.LegCouponRate value)
  { setField(value); }
  public org.quickfix.field.LegCouponRate get(org.quickfix.field.LegCouponRate  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegCouponRate getLegCouponRate() throws FieldNotFound
  { org.quickfix.field.LegCouponRate value = new org.quickfix.field.LegCouponRate();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegCouponRate field)
  { return isSetField(field); }
  public boolean isSetLegCouponRate()
  { return isSetField(615); }
  public void set(org.quickfix.field.LegSecurityExchange value)
  { setField(value); }
  public org.quickfix.field.LegSecurityExchange get(org.quickfix.field.LegSecurityExchange  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegSecurityExchange getLegSecurityExchange() throws FieldNotFound
  { org.quickfix.field.LegSecurityExchange value = new org.quickfix.field.LegSecurityExchange();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegSecurityExchange field)
  { return isSetField(field); }
  public boolean isSetLegSecurityExchange()
  { return isSetField(616); }
  public void set(org.quickfix.field.LegIssuer value)
  { setField(value); }
  public org.quickfix.field.LegIssuer get(org.quickfix.field.LegIssuer  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegIssuer getLegIssuer() throws FieldNotFound
  { org.quickfix.field.LegIssuer value = new org.quickfix.field.LegIssuer();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegIssuer field)
  { return isSetField(field); }
  public boolean isSetLegIssuer()
  { return isSetField(617); }
  public void set(org.quickfix.field.EncodedLegIssuerLen value)
  { setField(value); }
  public org.quickfix.field.EncodedLegIssuerLen get(org.quickfix.field.EncodedLegIssuerLen  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.EncodedLegIssuerLen getEncodedLegIssuerLen() throws FieldNotFound
  { org.quickfix.field.EncodedLegIssuerLen value = new org.quickfix.field.EncodedLegIssuerLen();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.EncodedLegIssuerLen field)
  { return isSetField(field); }
  public boolean isSetEncodedLegIssuerLen()
  { return isSetField(618); }
  public void set(org.quickfix.field.EncodedLegIssuer value)
  { setField(value); }
  public org.quickfix.field.EncodedLegIssuer get(org.quickfix.field.EncodedLegIssuer  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.EncodedLegIssuer getEncodedLegIssuer() throws FieldNotFound
  { org.quickfix.field.EncodedLegIssuer value = new org.quickfix.field.EncodedLegIssuer();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.EncodedLegIssuer field)
  { return isSetField(field); }
  public boolean isSetEncodedLegIssuer()
  { return isSetField(619); }
  public void set(org.quickfix.field.LegSecurityDesc value)
  { setField(value); }
  public org.quickfix.field.LegSecurityDesc get(org.quickfix.field.LegSecurityDesc  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegSecurityDesc getLegSecurityDesc() throws FieldNotFound
  { org.quickfix.field.LegSecurityDesc value = new org.quickfix.field.LegSecurityDesc();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegSecurityDesc field)
  { return isSetField(field); }
  public boolean isSetLegSecurityDesc()
  { return isSetField(620); }
  public void set(org.quickfix.field.EncodedLegSecurityDescLen value)
  { setField(value); }
  public org.quickfix.field.EncodedLegSecurityDescLen get(org.quickfix.field.EncodedLegSecurityDescLen  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.EncodedLegSecurityDescLen getEncodedLegSecurityDescLen() throws FieldNotFound
  { org.quickfix.field.EncodedLegSecurityDescLen value = new org.quickfix.field.EncodedLegSecurityDescLen();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.EncodedLegSecurityDescLen field)
  { return isSetField(field); }
  public boolean isSetEncodedLegSecurityDescLen()
  { return isSetField(621); }
  public void set(org.quickfix.field.EncodedLegSecurityDesc value)
  { setField(value); }
  public org.quickfix.field.EncodedLegSecurityDesc get(org.quickfix.field.EncodedLegSecurityDesc  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.EncodedLegSecurityDesc getEncodedLegSecurityDesc() throws FieldNotFound
  { org.quickfix.field.EncodedLegSecurityDesc value = new org.quickfix.field.EncodedLegSecurityDesc();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.EncodedLegSecurityDesc field)
  { return isSetField(field); }
  public boolean isSetEncodedLegSecurityDesc()
  { return isSetField(622); }
  public void set(org.quickfix.field.LegRatioQty value)
  { setField(value); }
  public org.quickfix.field.LegRatioQty get(org.quickfix.field.LegRatioQty  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegRatioQty getLegRatioQty() throws FieldNotFound
  { org.quickfix.field.LegRatioQty value = new org.quickfix.field.LegRatioQty();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegRatioQty field)
  { return isSetField(field); }
  public boolean isSetLegRatioQty()
  { return isSetField(623); }
  public void set(org.quickfix.field.LegSide value)
  { setField(value); }
  public org.quickfix.field.LegSide get(org.quickfix.field.LegSide  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegSide getLegSide() throws FieldNotFound
  { org.quickfix.field.LegSide value = new org.quickfix.field.LegSide();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegSide field)
  { return isSetField(field); }
  public boolean isSetLegSide()
  { return isSetField(624); }
  public void set(org.quickfix.field.NoLegSecurityAltID value)
  { setField(value); }
  public org.quickfix.field.NoLegSecurityAltID get(org.quickfix.field.NoLegSecurityAltID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.NoLegSecurityAltID getNoLegSecurityAltID() throws FieldNotFound
  { org.quickfix.field.NoLegSecurityAltID value = new org.quickfix.field.NoLegSecurityAltID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.NoLegSecurityAltID field)
  { return isSetField(field); }
  public boolean isSetNoLegSecurityAltID()
  { return isSetField(604); }
  public static class NoLegSecurityAltID extends Group {
    public NoLegSecurityAltID() {
      super(604,605,
      new int[] {605,606,0 } ); }
  public void set(org.quickfix.field.LegSecurityAltID value)
  { setField(value); }
  public org.quickfix.field.LegSecurityAltID get(org.quickfix.field.LegSecurityAltID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegSecurityAltID getLegSecurityAltID() throws FieldNotFound
  { org.quickfix.field.LegSecurityAltID value = new org.quickfix.field.LegSecurityAltID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegSecurityAltID field)
  { return isSetField(field); }
  public boolean isSetLegSecurityAltID()
  { return isSetField(605); }
  public void set(org.quickfix.field.LegSecurityAltIDSource value)
  { setField(value); }
  public org.quickfix.field.LegSecurityAltIDSource get(org.quickfix.field.LegSecurityAltIDSource  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegSecurityAltIDSource getLegSecurityAltIDSource() throws FieldNotFound
  { org.quickfix.field.LegSecurityAltIDSource value = new org.quickfix.field.LegSecurityAltIDSource();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegSecurityAltIDSource field)
  { return isSetField(field); }
  public boolean isSetLegSecurityAltIDSource()
  { return isSetField(606); }
}
  public void set(org.quickfix.field.LegPositionEffect value)
  { setField(value); }
  public org.quickfix.field.LegPositionEffect get(org.quickfix.field.LegPositionEffect  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegPositionEffect getLegPositionEffect() throws FieldNotFound
  { org.quickfix.field.LegPositionEffect value = new org.quickfix.field.LegPositionEffect();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegPositionEffect field)
  { return isSetField(field); }
  public boolean isSetLegPositionEffect()
  { return isSetField(564); }
  public void set(org.quickfix.field.LegCoveredOrUncovered value)
  { setField(value); }
  public org.quickfix.field.LegCoveredOrUncovered get(org.quickfix.field.LegCoveredOrUncovered  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegCoveredOrUncovered getLegCoveredOrUncovered() throws FieldNotFound
  { org.quickfix.field.LegCoveredOrUncovered value = new org.quickfix.field.LegCoveredOrUncovered();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegCoveredOrUncovered field)
  { return isSetField(field); }
  public boolean isSetLegCoveredOrUncovered()
  { return isSetField(565); }
  public void set(org.quickfix.field.NoNestedPartyIDs value)
  { setField(value); }
  public org.quickfix.field.NoNestedPartyIDs get(org.quickfix.field.NoNestedPartyIDs  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.NoNestedPartyIDs getNoNestedPartyIDs() throws FieldNotFound
  { org.quickfix.field.NoNestedPartyIDs value = new org.quickfix.field.NoNestedPartyIDs();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.NoNestedPartyIDs field)
  { return isSetField(field); }
  public boolean isSetNoNestedPartyIDs()
  { return isSetField(539); }
  public static class NoNestedPartyIDs extends Group {
    public NoNestedPartyIDs() {
      super(539,524,
      new int[] {524,525,538,545,0 } ); }
  public void set(org.quickfix.field.NestedPartyID value)
  { setField(value); }
  public org.quickfix.field.NestedPartyID get(org.quickfix.field.NestedPartyID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.NestedPartyID getNestedPartyID() throws FieldNotFound
  { org.quickfix.field.NestedPartyID value = new org.quickfix.field.NestedPartyID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.NestedPartyID field)
  { return isSetField(field); }
  public boolean isSetNestedPartyID()
  { return isSetField(524); }
  public void set(org.quickfix.field.NestedPartyIDSource value)
  { setField(value); }
  public org.quickfix.field.NestedPartyIDSource get(org.quickfix.field.NestedPartyIDSource  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.NestedPartyIDSource getNestedPartyIDSource() throws FieldNotFound
  { org.quickfix.field.NestedPartyIDSource value = new org.quickfix.field.NestedPartyIDSource();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.NestedPartyIDSource field)
  { return isSetField(field); }
  public boolean isSetNestedPartyIDSource()
  { return isSetField(525); }
  public void set(org.quickfix.field.NestedPartyRole value)
  { setField(value); }
  public org.quickfix.field.NestedPartyRole get(org.quickfix.field.NestedPartyRole  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.NestedPartyRole getNestedPartyRole() throws FieldNotFound
  { org.quickfix.field.NestedPartyRole value = new org.quickfix.field.NestedPartyRole();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.NestedPartyRole field)
  { return isSetField(field); }
  public boolean isSetNestedPartyRole()
  { return isSetField(538); }
  public void set(org.quickfix.field.NestedPartySubID value)
  { setField(value); }
  public org.quickfix.field.NestedPartySubID get(org.quickfix.field.NestedPartySubID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.NestedPartySubID getNestedPartySubID() throws FieldNotFound
  { org.quickfix.field.NestedPartySubID value = new org.quickfix.field.NestedPartySubID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.NestedPartySubID field)
  { return isSetField(field); }
  public boolean isSetNestedPartySubID()
  { return isSetField(545); }
}
  public void set(org.quickfix.field.LegRefID value)
  { setField(value); }
  public org.quickfix.field.LegRefID get(org.quickfix.field.LegRefID  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegRefID getLegRefID() throws FieldNotFound
  { org.quickfix.field.LegRefID value = new org.quickfix.field.LegRefID();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegRefID field)
  { return isSetField(field); }
  public boolean isSetLegRefID()
  { return isSetField(654); }
  public void set(org.quickfix.field.LegPrice value)
  { setField(value); }
  public org.quickfix.field.LegPrice get(org.quickfix.field.LegPrice  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegPrice getLegPrice() throws FieldNotFound
  { org.quickfix.field.LegPrice value = new org.quickfix.field.LegPrice();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegPrice field)
  { return isSetField(field); }
  public boolean isSetLegPrice()
  { return isSetField(566); }
  public void set(org.quickfix.field.LegSettlmntTyp value)
  { setField(value); }
  public org.quickfix.field.LegSettlmntTyp get(org.quickfix.field.LegSettlmntTyp  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegSettlmntTyp getLegSettlmntTyp() throws FieldNotFound
  { org.quickfix.field.LegSettlmntTyp value = new org.quickfix.field.LegSettlmntTyp();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegSettlmntTyp field)
  { return isSetField(field); }
  public boolean isSetLegSettlmntTyp()
  { return isSetField(587); }
  public void set(org.quickfix.field.LegFutSettDate value)
  { setField(value); }
  public org.quickfix.field.LegFutSettDate get(org.quickfix.field.LegFutSettDate  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegFutSettDate getLegFutSettDate() throws FieldNotFound
  { org.quickfix.field.LegFutSettDate value = new org.quickfix.field.LegFutSettDate();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegFutSettDate field)
  { return isSetField(field); }
  public boolean isSetLegFutSettDate()
  { return isSetField(588); }
  public void set(org.quickfix.field.LegLastPx value)
  { setField(value); }
  public org.quickfix.field.LegLastPx get(org.quickfix.field.LegLastPx  value)
    throws FieldNotFound
  { getField(value); return value; }
  public org.quickfix.field.LegLastPx getLegLastPx() throws FieldNotFound
  { org.quickfix.field.LegLastPx value = new org.quickfix.field.LegLastPx();
    getField(value); return value; }
  public boolean isSet(org.quickfix.field.LegLastPx field)
  { return isSetField(field); }
  public boolean isSetLegLastPx()
  { return isSetField(637); }
}
}
