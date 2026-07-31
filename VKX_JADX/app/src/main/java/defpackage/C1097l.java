package defpackage;

import kotlin.Metadata;

/* JADX INFO: renamed from: lؘؒٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Llؘؒٗ;", "Llَُۜ;", "Llؔۗۥ;", "io.realm.kotlin.library"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class C1097l implements InterfaceC11343l, InterfaceC2851l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public C1332l f3035l;

    @Override // defpackage.InterfaceC2851l
    /* JADX INFO: renamed from: Signature, reason: from getter */
    public final C1332l getF36799l() {
        return this.f3035l;
    }

    @Override // defpackage.InterfaceC2851l
    public final void ads(C1332l c1332l) {
        this.f3035l = c1332l;
    }

    @Override // defpackage.InterfaceC11343l
    public InterfaceC11334l firebase(String str) {
        return yandex(AbstractC18202l.yandex.loadAd(InterfaceC11343l.class), str);
    }

    @Override // defpackage.InterfaceC11343l
    public InterfaceC11343l mopub(String str) {
        return (InterfaceC11343l) tapsense(AbstractC18202l.yandex.loadAd(InterfaceC11343l.class), str);
    }

    @Override // defpackage.InterfaceC11343l
    public Object smaato(InterfaceC1388l interfaceC1388l, String str) {
        return C2782l.adcel(this.f3035l, str, interfaceC1388l, false, false);
    }

    @Override // defpackage.InterfaceC11343l
    public Object tapsense(InterfaceC1388l interfaceC1388l, String str) {
        return C2782l.adcel(this.f3035l, str, interfaceC1388l, true, false);
    }

    public C3364l yandex(InterfaceC1388l interfaceC1388l, String str) {
        return C2782l.ads(this.f3035l, str, interfaceC1388l, false, false);
    }
}
