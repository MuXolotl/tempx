package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: lُٕٟ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C15848l implements InterfaceC9710l, InterfaceC11545l, InterfaceC12238l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f31100l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31101l;

    public /* synthetic */ C15848l(int i, Object obj) {
        this.f31101l = i;
        this.f31100l = obj;
    }

    @Override // defpackage.InterfaceC11545l
    public void accept(Object obj, Object obj2) {
        switch (this.f31101l) {
            case 2:
                BinderC7645l binderC7645l = new BinderC7645l((C7560l) this.f31100l, (C2350l) obj2);
                C2368l c2368l = (C2368l) ((C8800l) obj).metrica();
                Parcel parcelM743l = c2368l.m743l();
                AbstractC14627l.crashlytics(parcelM743l, binderC7645l);
                c2368l.m741l(parcelM743l, 2);
                break;
            default:
                int i = C1539l.firebase;
                BinderC15695l binderC15695l = new BinderC15695l((C2350l) obj2);
                C18414l c18414l = (C18414l) ((C8900l) obj).metrica();
                byte[] bArrYandex = ((C13658l) this.f31100l).yandex();
                Parcel parcelM743l2 = c18414l.m743l();
                AbstractC15425l.crashlytics(parcelM743l2, binderC15695l);
                parcelM743l2.writeByteArray(bArrYandex);
                c18414l.m741l(parcelM743l2, 31);
                break;
        }
    }

    @Override // defpackage.InterfaceC9710l
    public void firebase(Bundle bundle) {
        ((InterfaceC15669l) this.f31100l).mo1410l();
    }

    @Override // defpackage.InterfaceC9710l
    public void isPro(int i) {
        ((InterfaceC15669l) this.f31100l).isPro(i);
    }

    @Override // defpackage.InterfaceC12238l
    public void subs(String str, String str2, Bundle bundle) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        C6901l c6901l = (C6901l) this.f31100l;
        if (!zIsEmpty) {
            c6901l.mo224l().m4449l(new RunnableC16843l(this, str, str2, bundle, 15));
            return;
        }
        C17417l c17417l = c6901l.f14473l;
        if (c17417l != null) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.loadAd(str2, "AppId not known when logging event");
        }
    }

    public void yandex() {
        C17186l c17186l = (C17186l) this.f31100l;
        Iterator it = c17186l.mopub.iterator();
        if (it.hasNext()) {
            throw AbstractC15560l.adcel(it);
        }
        for (C7801l c7801l : c17186l.admob) {
            switch (c7801l.yandex) {
                case 2:
                    ((C9937l) c7801l.loadAd).loadAd();
                    break;
            }
        }
    }

    public /* synthetic */ C15848l() {
        this.f31101l = 5;
    }
}
