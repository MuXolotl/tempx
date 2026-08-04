package ua.itaysonlab.vkapi2.internal.objects;

import defpackage.AbstractC0653l;
import defpackage.AbstractC15639l;
import defpackage.AbstractC7188l;
import defpackage.C0396l;
import defpackage.C0458l;
import defpackage.C12952l;
import defpackage.C18262l;
import defpackage.C3631l;
import defpackage.C5746l;
import defpackage.C8339l;
import defpackage.C8413l;
import java.io.EOFException;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class VKResponseJsonAdapter<T> extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("response", "error", "execute_errors");

    public VKResponseJsonAdapter(C12952l c12952l, Type[] typeArr) {
        Type type = typeArr[0];
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(type, c5746l, "response");
        this.crashlytics = c12952l.loadAd(VKError.class, c5746l, "error");
        this.amazon = c12952l.loadAd(AbstractC15639l.mopub(List.class, VKError.class), c5746l, "execute_errors");
        int length = typeArr.length;
        if (length == 1) {
            return;
        }
        C8339l.metrica(AbstractC0653l.vip(length, "TypeVariable mismatch: Expecting 1 type for generic type variables [T], but received "));
        throw null;
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        VKResponse vKResponse = (VKResponse) obj;
        c3631l.mopub();
        c3631l.isVip("response");
        this.loadAd.billing(c3631l, vKResponse.yandex);
        c3631l.isVip("error");
        this.crashlytics.billing(c3631l, vKResponse.loadAd);
        c3631l.isVip("execute_errors");
        this.amazon.billing(c3631l, vKResponse.crashlytics);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Object objLoadAd = null;
        Object objLoadAd2 = null;
        Object objLoadAd3 = null;
        int i = -1;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l == -1) {
                c0396l.m502l();
                c0396l.m501l();
            } else if (iM503l == 0) {
                objLoadAd = this.loadAd.loadAd(c0396l);
                i &= -2;
            } else if (iM503l == 1) {
                objLoadAd2 = this.crashlytics.loadAd(c0396l);
                i &= -3;
            } else if (iM503l == 2) {
                objLoadAd3 = this.amazon.loadAd(c0396l);
                i &= -5;
            }
        }
        c0396l.ads();
        if (i == -8) {
            return new VKResponse(objLoadAd, (VKError) objLoadAd2, (List) objLoadAd3);
        }
        VKError vKError = (VKError) objLoadAd2;
        List list = (List) objLoadAd3;
        if ((i & 1) != 0) {
            objLoadAd = null;
        }
        if ((i & 2) != 0) {
            vKError = null;
        }
        return new VKResponse(objLoadAd, vKError, (i & 4) == 0 ? list : null);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(VKResponse)";
    }
}
