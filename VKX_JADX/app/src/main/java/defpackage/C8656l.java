package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lًٌۣ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8656l implements InterfaceC11724l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ List f17835l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C13208l f17836l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17837l;

    public /* synthetic */ C8656l(C13208l c13208l, List list, int i) {
        this.f17837l = i;
        this.f17836l = c13208l;
        this.f17835l = list;
    }

    @Override // defpackage.InterfaceC11724l
    public final void billing(InterfaceC4725l interfaceC4725l, int i) {
        int i2 = this.f17837l;
        int i3 = 0;
        List list = this.f17835l;
        C13208l c13208l = this.f17836l;
        switch (i2) {
            case 0:
                BinderC11857l binderC11857l = c13208l.crashlytics;
                C16971l c16971lMetrica = AbstractC1186l.metrica();
                while (i3 < list.size()) {
                    c16971lMetrica.crashlytics(((C2427l) list.get(i3)).crashlytics(c13208l.m3611l(), true));
                    i3++;
                }
                interfaceC4725l.mo468super(binderC11857l, i, new BinderC11373l(c16971lMetrica.mopub()), true);
                break;
            default:
                BinderC11857l binderC11857l2 = c13208l.crashlytics;
                C16971l c16971lMetrica2 = AbstractC1186l.metrica();
                while (i3 < list.size()) {
                    c16971lMetrica2.crashlytics(((C2427l) list.get(i3)).crashlytics(c13208l.m3611l(), true));
                    i3++;
                }
                interfaceC4725l.mo431implements(binderC11857l2, i, new BinderC11373l(c16971lMetrica2.mopub()));
                break;
        }
    }
}
