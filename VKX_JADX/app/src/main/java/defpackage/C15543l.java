package defpackage;

/* JADX INFO: renamed from: lؚٕٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15543l implements InterfaceC6752l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public String f30375l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C10740l f30376l = new C10740l(29, this);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public InterfaceC2449l f30377l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public InterfaceC10315l f30378l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public Object[] f30379l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f30380l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public InterfaceC18327l f30381l;

    public C15543l(InterfaceC10315l interfaceC10315l, InterfaceC2449l interfaceC2449l, String str, Object obj, Object[] objArr) {
        this.f30378l = interfaceC10315l;
        this.f30377l = interfaceC2449l;
        this.f30375l = str;
        this.f30380l = obj;
        this.f30379l = objArr;
    }

    public final void amazon() {
        String strAmazon;
        InterfaceC2449l interfaceC2449l = this.f30377l;
        InterfaceC18327l interfaceC18327l = this.f30381l;
        if (interfaceC18327l != null) {
            C10754l.license(interfaceC18327l, ") is not null", "entry(");
            return;
        }
        if (interfaceC2449l != null) {
            C10740l c10740l = this.f30376l;
            Object objInvoke = c10740l.invoke();
            if (objInvoke == null || interfaceC2449l.crashlytics(objInvoke)) {
                this.f30381l = interfaceC2449l.billing(this.f30375l, c10740l);
                return;
            }
            if (objInvoke instanceof InterfaceC0938l) {
                InterfaceC0938l interfaceC0938l = (InterfaceC0938l) objInvoke;
                if (interfaceC0938l.loadAd() == C18450l.f36015l || interfaceC0938l.loadAd() == C7472l.f15463l || interfaceC0938l.loadAd() == C1461l.f3659l) {
                    strAmazon = "MutableState containing " + interfaceC0938l.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strAmazon = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strAmazon = AbstractC0825l.amazon(objInvoke);
            }
            throw new IllegalArgumentException(strAmazon);
        }
    }

    @Override // defpackage.InterfaceC6752l
    public final void crashlytics() {
        amazon();
    }

    @Override // defpackage.InterfaceC6752l
    public final void loadAd() {
        InterfaceC18327l interfaceC18327l = this.f30381l;
        if (interfaceC18327l != null) {
            ((C5991l) interfaceC18327l).signatures();
        }
    }

    @Override // defpackage.InterfaceC6752l
    public final void yandex() {
        InterfaceC18327l interfaceC18327l = this.f30381l;
        if (interfaceC18327l != null) {
            ((C5991l) interfaceC18327l).signatures();
        }
    }
}
