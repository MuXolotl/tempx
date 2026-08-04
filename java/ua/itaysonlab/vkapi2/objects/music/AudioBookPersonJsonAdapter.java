package ua.itaysonlab.vkapi2.objects.music;

import defpackage.AbstractC15639l;
import defpackage.AbstractC16901l;
import defpackage.AbstractC2812l;
import defpackage.AbstractC7188l;
import defpackage.C0396l;
import defpackage.C0458l;
import defpackage.C11467l;
import defpackage.C12952l;
import defpackage.C18262l;
import defpackage.C2580l;
import defpackage.C3631l;
import defpackage.C5746l;
import defpackage.C8413l;
import java.io.EOFException;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItemPhoto;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class AudioBookPersonJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l purchase;
    public final C0458l yandex = C0458l.m547strictfp("description", "id", "name", "photo", "roles");

    public AudioBookPersonJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "description");
        this.crashlytics = c12952l.loadAd(Integer.class, c5746l, "id");
        this.amazon = c12952l.loadAd(AbstractC15639l.mopub(List.class, CustomCatalogBlockItemPhoto.class), c5746l, "photo");
        this.purchase = c12952l.loadAd(AbstractC15639l.mopub(List.class, AudioBookPerson.AudioBookPersonRole.class), c5746l, "roles");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        AudioBookPerson audioBookPerson = (AudioBookPerson) obj;
        c3631l.mopub();
        c3631l.isVip("description");
        String str = audioBookPerson.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("id");
        this.crashlytics.billing(c3631l, audioBookPerson.loadAd);
        c3631l.isVip("name");
        abstractC7188l.billing(c3631l, audioBookPerson.crashlytics);
        c3631l.isVip("photo");
        this.amazon.billing(c3631l, audioBookPerson.amazon);
        c3631l.isVip("roles");
        this.purchase.billing(c3631l, audioBookPerson.purchase);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setIsVip = C5746l.f12138l;
        Object objLoadAd = null;
        Object objLoadAd2 = null;
        Object objLoadAd3 = null;
        Object obj = null;
        Object obj2 = null;
        int i = -1;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l != -1) {
                AbstractC7188l abstractC7188l = this.loadAd;
                if (iM503l == 0) {
                    objLoadAd = abstractC7188l.loadAd(c0396l);
                    i &= -2;
                } else if (iM503l == 1) {
                    objLoadAd2 = this.crashlytics.loadAd(c0396l);
                    i &= -3;
                } else if (iM503l == 2) {
                    objLoadAd3 = abstractC7188l.loadAd(c0396l);
                    i &= -5;
                } else if (iM503l == 3) {
                    Object objLoadAd4 = this.amazon.loadAd(c0396l);
                    if (objLoadAd4 == null) {
                        setIsVip = AbstractC2812l.isVip("photo", "photo", c0396l, setIsVip);
                    } else {
                        obj = objLoadAd4;
                    }
                    i &= -9;
                } else if (iM503l == 4) {
                    Object objLoadAd5 = this.purchase.loadAd(c0396l);
                    if (objLoadAd5 == null) {
                        setIsVip = AbstractC2812l.isVip("roles", "roles", c0396l, setIsVip);
                    } else {
                        obj2 = objLoadAd5;
                    }
                    i &= -17;
                }
            } else {
                c0396l.m502l();
                c0396l.m501l();
            }
        }
        c0396l.ads();
        if (setIsVip.size() != 0) {
            C11467l.subscription(AbstractC16901l.m4210case(setIsVip, "\n", null, null, null, 62));
            return null;
        }
        if (i == -32) {
            return new AudioBookPerson((String) objLoadAd, (Integer) objLoadAd2, (String) objLoadAd3, (List) obj, (List) obj2);
        }
        Integer num = (Integer) objLoadAd2;
        String str = (String) objLoadAd3;
        List list = (List) obj;
        List list2 = (List) obj2;
        String str2 = (i & 1) != 0 ? null : (String) objLoadAd;
        if ((i & 2) != 0) {
            num = null;
        }
        String str3 = (i & 4) != 0 ? null : str;
        int i2 = i & 8;
        C2580l c2580l = C2580l.f5619l;
        if (i2 != 0) {
            list = c2580l;
        }
        return new AudioBookPerson(str2, num, str3, list, (i & 16) != 0 ? c2580l : list2);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioBookPerson)";
    }
}
