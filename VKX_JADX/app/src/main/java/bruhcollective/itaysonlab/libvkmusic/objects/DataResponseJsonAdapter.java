package bruhcollective.itaysonlab.libvkmusic.objects;

import defpackage.AbstractC0653l;
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
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class DataResponseJsonAdapter<T> extends AbstractC7188l {
    public final AbstractC7188l loadAd;
    public final C0458l yandex = C0458l.m547strictfp("data");

    public DataResponseJsonAdapter(C12952l c12952l, Type[] typeArr) {
        this.loadAd = c12952l.loadAd(typeArr[0], C5746l.f12138l, "data");
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
        c3631l.mopub();
        c3631l.isVip("data");
        this.loadAd.billing(c3631l, ((DataResponse) obj).yandex);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Object objLoadAd = null;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l == -1) {
                c0396l.m502l();
                c0396l.m501l();
            } else if (iM503l == 0) {
                objLoadAd = this.loadAd.loadAd(c0396l);
            }
        }
        c0396l.ads();
        return new DataResponse(objLoadAd);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(DataResponse)";
    }
}
