package defpackage;

/* JADX INFO: renamed from: lٍَۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9459l implements InterfaceC12244l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public final /* synthetic */ C18656l f19318l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C10086l f19319l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f19320l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C10086l f19321l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C10086l f19322l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C0010l f19323l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C10703l f19324l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C10086l f19325l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C10086l f19326l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C13315l f19327l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public AbstractC2249l f19328l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C13765l f19329l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public boolean f19330l;

    public C9459l(C18656l c18656l, Object obj, AbstractC2249l abstractC2249l, C0010l c0010l) {
        this.f19318l = c18656l;
        this.f19323l = c0010l;
        C10086l c10086lSmaato = AbstractC8020l.smaato(obj);
        this.f19322l = c10086lSmaato;
        Object objInvoke = null;
        C10086l c10086lSmaato2 = AbstractC8020l.smaato(AbstractC0532l.admob(0.0f, 0.0f, null, 7));
        this.f19319l = c10086lSmaato2;
        this.f19326l = AbstractC8020l.smaato(new C5810l((InterfaceC17807l) c10086lSmaato2.getValue(), c0010l, obj, c10086lSmaato.getValue(), abstractC2249l));
        this.f19325l = AbstractC8020l.smaato(Boolean.TRUE);
        this.f19329l = new C13765l(-1.0f);
        this.f19321l = AbstractC8020l.smaato(obj);
        this.f19328l = abstractC2249l;
        this.f19324l = new C10703l(crashlytics().loadAd());
        Float f = (Float) AbstractC11922l.loadAd.get(c0010l);
        if (f != null) {
            float fFloatValue = f.floatValue();
            AbstractC2249l abstractC2249l2 = (AbstractC2249l) c0010l.yandex.invoke(obj);
            int iLoadAd = abstractC2249l2.loadAd();
            for (int i = 0; i < iLoadAd; i++) {
                abstractC2249l2.purchase(i, fFloatValue);
            }
            objInvoke = this.f19323l.loadAd.invoke(abstractC2249l2);
        }
        this.f19327l = AbstractC0532l.admob(0.0f, 0.0f, objInvoke, 3);
    }

    public final void admob(Object obj, InterfaceC17807l interfaceC17807l, Object obj2, AbstractC2249l abstractC2249l) {
        Object value;
        if (this.f19320l && AbstractC8576l.yandex(obj, null)) {
            return;
        }
        C10086l c10086l = this.f19322l;
        boolean zYandex = AbstractC8576l.yandex(c10086l.getValue(), obj);
        C13765l c13765l = this.f19329l;
        if (zYandex && c13765l.admob() == -1.0f && (obj2 == null || obj2.equals(crashlytics().amazon))) {
            return;
        }
        c10086l.setValue(obj);
        this.f19319l.setValue(interfaceC17807l);
        if (obj2 == null) {
            value = c13765l.admob() == -3.0f ? obj : this.f19321l.getValue();
        } else {
            value = obj2;
        }
        if (obj2 != null) {
            purchase(value);
            if (abstractC2249l != null) {
                this.f19328l = abstractC2249l;
            }
        }
        C10086l c10086l2 = this.f19325l;
        billing(value, !((Boolean) c10086l2.getValue()).booleanValue());
        c10086l2.setValue(Boolean.valueOf(c13765l.admob() == -3.0f));
        if (c13765l.admob() >= 0.0f) {
            purchase(crashlytics().billing((long) (c13765l.admob() * crashlytics().loadAd())));
        } else if (c13765l.admob() == -3.0f) {
            purchase(obj);
        }
        this.f19320l = false;
        c13765l.subs(-1.0f);
    }

    public final void amazon() {
        if (this.f19329l.admob() == -1.0f) {
            this.f19330l = true;
            if (AbstractC8576l.yandex(crashlytics().crashlytics, crashlytics().amazon)) {
                purchase(crashlytics().crashlytics);
            } else {
                purchase(crashlytics().billing(0L));
                this.f19328l = crashlytics().amazon(0L);
            }
        }
    }

    public final void billing(Object obj, boolean z) {
        C10086l c10086l = this.f19322l;
        boolean zYandex = AbstractC8576l.yandex(null, c10086l.getValue());
        C10703l c10703l = this.f19324l;
        C10086l c10086l2 = this.f19326l;
        InterfaceC17807l interfaceC17807l = this.f19327l;
        if (zYandex) {
            c10086l2.setValue(new C5810l(interfaceC17807l, this.f19323l, obj, obj, this.f19328l.crashlytics()));
            this.f19320l = true;
            c10703l.subs(crashlytics().loadAd());
            return;
        }
        C10086l c10086l3 = this.f19319l;
        if (!z || this.f19330l || (((InterfaceC17807l) c10086l3.getValue()) instanceof C13315l)) {
            interfaceC17807l = (InterfaceC17807l) c10086l3.getValue();
        }
        C18656l c18656l = this.f19318l;
        long jPurchase = c18656l.purchase();
        C10086l c10086l4 = c18656l.subs;
        long jMax = 0;
        c10086l2.setValue(new C5810l(jPurchase <= 0 ? interfaceC17807l : new C7783l(interfaceC17807l, c18656l.purchase()), this.f19323l, obj, c10086l.getValue(), this.f19328l));
        c10703l.subs(crashlytics().loadAd());
        this.f19320l = false;
        c10086l4.setValue(Boolean.TRUE);
        if (c18656l.mopub()) {
            C11362l c11362l = c18656l.isPro;
            int size = c11362l.size();
            for (int i = 0; i < size; i++) {
                C9459l c9459l = (C9459l) c11362l.get(i);
                jMax = Math.max(jMax, c9459l.f19324l.admob());
                c9459l.amazon();
            }
            c10086l4.setValue(Boolean.FALSE);
        }
    }

    public final C5810l crashlytics() {
        return (C5810l) this.f19326l.getValue();
    }

    @Override // defpackage.InterfaceC12244l
    public final Object getValue() {
        return this.f19321l.getValue();
    }

    public final void mopub(Object obj, Object obj2, InterfaceC17807l interfaceC17807l) {
        this.f19322l.setValue(obj2);
        this.f19319l.setValue(interfaceC17807l);
        if (AbstractC8576l.yandex(crashlytics().amazon, obj) && AbstractC8576l.yandex(crashlytics().crashlytics, obj2)) {
            return;
        }
        billing(obj, false);
    }

    public final void purchase(Object obj) {
        this.f19321l.setValue(obj);
    }

    public final String toString() {
        return "current value: " + this.f19321l.getValue() + ", target: " + this.f19322l.getValue() + ", spec: " + ((InterfaceC17807l) this.f19319l.getValue());
    }
}
