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
import ua.itaysonlab.vkapi2.objects.users.VKProfile;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class VKResponseWithItemsJsonAdapter<T> extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l purchase;
    public final C0458l yandex = C0458l.m547strictfp("items", "count", "profiles", "groups", "next_from");

    public VKResponseWithItemsJsonAdapter(C12952l c12952l, Type[] typeArr) {
        Type type = typeArr[0];
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(type, c5746l, "items");
        this.crashlytics = c12952l.loadAd(Integer.class, c5746l, "count");
        this.amazon = c12952l.loadAd(AbstractC15639l.mopub(List.class, VKProfile.class), c5746l, "profiles");
        this.purchase = c12952l.loadAd(String.class, c5746l, "next_from");
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
        VKResponseWithItems vKResponseWithItems = (VKResponseWithItems) obj;
        c3631l.mopub();
        c3631l.isVip("items");
        this.loadAd.billing(c3631l, vKResponseWithItems.yandex);
        c3631l.isVip("count");
        this.crashlytics.billing(c3631l, vKResponseWithItems.loadAd);
        c3631l.isVip("profiles");
        List list = vKResponseWithItems.crashlytics;
        AbstractC7188l abstractC7188l = this.amazon;
        abstractC7188l.billing(c3631l, list);
        c3631l.isVip("groups");
        abstractC7188l.billing(c3631l, vKResponseWithItems.amazon);
        c3631l.isVip("next_from");
        this.purchase.billing(c3631l, vKResponseWithItems.purchase);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Object objLoadAd = null;
        Object objLoadAd2 = null;
        Object objLoadAd3 = null;
        Object objLoadAd4 = null;
        Object objLoadAd5 = null;
        int i = -1;
        while (c0396l.m504package()) {
            int iM503l = c0396l.m503l(this.yandex);
            if (iM503l == -1) {
                c0396l.m502l();
                c0396l.m501l();
            } else if (iM503l == 0) {
                objLoadAd3 = this.loadAd.loadAd(c0396l);
                i &= -2;
            } else if (iM503l != 1) {
                AbstractC7188l abstractC7188l = this.amazon;
                if (iM503l == 2) {
                    objLoadAd2 = abstractC7188l.loadAd(c0396l);
                    i &= -5;
                } else if (iM503l == 3) {
                    objLoadAd4 = abstractC7188l.loadAd(c0396l);
                    i &= -9;
                } else if (iM503l == 4) {
                    objLoadAd5 = this.purchase.loadAd(c0396l);
                    i &= -17;
                }
            } else {
                objLoadAd = this.crashlytics.loadAd(c0396l);
                i &= -3;
            }
        }
        c0396l.ads();
        if (i == -32) {
            return new VKResponseWithItems(objLoadAd3, (Integer) objLoadAd, (List) objLoadAd2, (List) objLoadAd4, (String) objLoadAd5);
        }
        return new VKResponseWithItems(objLoadAd3, (Integer) objLoadAd, (List) objLoadAd2, (List) objLoadAd4, (String) objLoadAd5, i);
    }

    public final String toString() {
        return "GeneratedJsonAdapter(VKResponseWithItems)";
    }
}
