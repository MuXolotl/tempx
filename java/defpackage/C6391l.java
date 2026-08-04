package defpackage;

import android.os.Parcel;

/* JADX INFO: renamed from: lؙُ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6391l implements InterfaceC11545l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ String[] f13375l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C7560l f13376l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13377l;

    public /* synthetic */ C6391l(C7560l c7560l, String[] strArr, int i) {
        this.f13377l = i;
        this.f13376l = c7560l;
        this.f13375l = strArr;
    }

    @Override // defpackage.InterfaceC11545l
    public final void accept(Object obj, Object obj2) {
        int i = this.f13377l;
        String[] strArr = this.f13375l;
        C7560l c7560l = this.f13376l;
        C2350l c2350l = (C2350l) obj2;
        C18304l c18304l = (C18304l) obj;
        switch (i) {
            case 0:
                BinderC17818l binderC17818l = new BinderC17818l(c7560l, c2350l, 1);
                C7132l c7132l = (C7132l) c18304l.metrica();
                C3448l c3448lRemoteconfig = AbstractC11990l.remoteconfig();
                Parcel parcelM743l = c7132l.m743l();
                AbstractC14627l.crashlytics(parcelM743l, binderC17818l);
                parcelM743l.writeStringArray(strArr);
                AbstractC14627l.loadAd(parcelM743l, c3448lRemoteconfig);
                c7132l.m747l(parcelM743l, 6);
                break;
            default:
                BinderC17818l binderC17818l2 = new BinderC17818l(c7560l, c2350l, 2);
                C7132l c7132l2 = (C7132l) c18304l.metrica();
                C3448l c3448lRemoteconfig2 = AbstractC11990l.remoteconfig();
                Parcel parcelM743l2 = c7132l2.m743l();
                AbstractC14627l.crashlytics(parcelM743l2, binderC17818l2);
                parcelM743l2.writeStringArray(strArr);
                AbstractC14627l.loadAd(parcelM743l2, c3448lRemoteconfig2);
                c7132l2.m747l(parcelM743l2, 7);
                break;
        }
    }
}
