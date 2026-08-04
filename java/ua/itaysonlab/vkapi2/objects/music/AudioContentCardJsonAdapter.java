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
import defpackage.EnumC12756l;
import java.io.EOFException;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItemPhoto;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
public final class AudioContentCardJsonAdapter extends AbstractC7188l {
    public final AbstractC7188l amazon;
    public final AbstractC7188l crashlytics;
    public final AbstractC7188l loadAd;
    public final AbstractC7188l purchase;
    public final C0458l yandex = C0458l.m547strictfp("editor_annotation", "editor_background_image", "editor_gradient_image", "editor_tag", "entity_id", "entity_owner_id", "entity_type");

    public AudioContentCardJsonAdapter(C12952l c12952l) {
        C5746l c5746l = C5746l.f12138l;
        this.loadAd = c12952l.loadAd(String.class, c5746l, "editorAnnotation");
        this.crashlytics = c12952l.loadAd(AbstractC15639l.mopub(List.class, CustomCatalogBlockItemPhoto.class), c5746l, "editorBackgroundImage");
        this.amazon = c12952l.loadAd(String.class, c5746l, "entityId");
        this.purchase = c12952l.loadAd(EnumC12756l.class, c5746l, "entityType");
    }

    @Override // defpackage.AbstractC7188l
    public final void billing(C3631l c3631l, Object obj) {
        if (obj == null) {
            C18262l.mopub();
            return;
        }
        AudioContentCard audioContentCard = (AudioContentCard) obj;
        c3631l.mopub();
        c3631l.isVip("editor_annotation");
        String str = audioContentCard.yandex;
        AbstractC7188l abstractC7188l = this.loadAd;
        abstractC7188l.billing(c3631l, str);
        c3631l.isVip("editor_background_image");
        List list = audioContentCard.loadAd;
        AbstractC7188l abstractC7188l2 = this.crashlytics;
        abstractC7188l2.billing(c3631l, list);
        c3631l.isVip("editor_gradient_image");
        abstractC7188l2.billing(c3631l, audioContentCard.crashlytics);
        c3631l.isVip("editor_tag");
        abstractC7188l.billing(c3631l, audioContentCard.amazon);
        c3631l.isVip("entity_id");
        String str2 = audioContentCard.purchase;
        AbstractC7188l abstractC7188l3 = this.amazon;
        abstractC7188l3.billing(c3631l, str2);
        c3631l.isVip("entity_owner_id");
        abstractC7188l3.billing(c3631l, audioContentCard.billing);
        c3631l.isVip("entity_type");
        this.purchase.billing(c3631l, audioContentCard.mopub);
        c3631l.adcel();
    }

    @Override // defpackage.AbstractC7188l
    public final Object loadAd(C0396l c0396l) throws C8413l, EOFException {
        c0396l.billing();
        Set setLicense = C5746l.f12138l;
        int i = -1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        Object objLoadAd = null;
        Object obj = null;
        Object obj2 = null;
        String str = null;
        String str2 = null;
        EnumC12756l enumC12756l = null;
        Object objLoadAd2 = null;
        while (true) {
            boolean z4 = z;
            boolean z5 = z2;
            boolean z6 = z3;
            Object obj3 = objLoadAd;
            if (!c0396l.m504package()) {
                Object obj4 = obj;
                Object obj5 = obj2;
                String str3 = str;
                c0396l.ads();
                if ((!z4) & (str3 == null)) {
                    setLicense = AbstractC2812l.license("entityId", "entity_id", c0396l, setLicense);
                }
                if ((!z5) & (str2 == null)) {
                    setLicense = AbstractC2812l.license("entityOwnerId", "entity_owner_id", c0396l, setLicense);
                }
                if ((!z6) & (enumC12756l == null)) {
                    setLicense = AbstractC2812l.license("entityType", "entity_type", c0396l, setLicense);
                }
                if (setLicense.size() != 0) {
                    C11467l.subscription(AbstractC16901l.m4210case(setLicense, "\n", null, null, null, 62));
                    return null;
                }
                if (i == -16) {
                    return new AudioContentCard((String) obj3, (List) obj4, (List) obj5, (String) objLoadAd2, str3, str2, enumC12756l);
                }
                List list = (List) obj4;
                List list2 = (List) obj5;
                String str4 = (String) objLoadAd2;
                String str5 = (i & 1) != 0 ? null : (String) obj3;
                int i2 = i & 2;
                C2580l c2580l = C2580l.f5619l;
                return new AudioContentCard(str5, i2 != 0 ? c2580l : list, (i & 4) != 0 ? c2580l : list2, (i & 8) != 0 ? null : str4, str3, str2, enumC12756l);
            }
            Object obj6 = obj;
            int iM503l = c0396l.m503l(this.yandex);
            AbstractC7188l abstractC7188l = this.crashlytics;
            Object obj7 = obj2;
            AbstractC7188l abstractC7188l2 = this.loadAd;
            String str6 = str;
            AbstractC7188l abstractC7188l3 = this.amazon;
            switch (iM503l) {
                case -1:
                    c0396l.m502l();
                    c0396l.m501l();
                    obj = obj6;
                    z = z4;
                    z2 = z5;
                    z3 = z6;
                    objLoadAd = obj3;
                    obj2 = obj7;
                    str = str6;
                    break;
                case 0:
                    objLoadAd = abstractC7188l2.loadAd(c0396l);
                    i &= -2;
                    obj = obj6;
                    z = z4;
                    z2 = z5;
                    z3 = z6;
                    obj2 = obj7;
                    str = str6;
                    break;
                case 1:
                    Object objLoadAd3 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd3 == null) {
                        setLicense = AbstractC2812l.isVip("editorBackgroundImage", "editor_background_image", c0396l, setLicense);
                        obj = obj6;
                    } else {
                        obj = objLoadAd3;
                    }
                    i &= -3;
                    z = z4;
                    z2 = z5;
                    z3 = z6;
                    objLoadAd = obj3;
                    obj2 = obj7;
                    str = str6;
                    break;
                case 2:
                    Object objLoadAd4 = abstractC7188l.loadAd(c0396l);
                    if (objLoadAd4 == null) {
                        setLicense = AbstractC2812l.isVip("editorGradientImage", "editor_gradient_image", c0396l, setLicense);
                        obj2 = obj7;
                    } else {
                        obj2 = objLoadAd4;
                    }
                    i &= -5;
                    obj = obj6;
                    z = z4;
                    z2 = z5;
                    z3 = z6;
                    objLoadAd = obj3;
                    str = str6;
                    break;
                case 3:
                    objLoadAd2 = abstractC7188l2.loadAd(c0396l);
                    i &= -9;
                    obj = obj6;
                    z = z4;
                    z2 = z5;
                    z3 = z6;
                    objLoadAd = obj3;
                    obj2 = obj7;
                    str = str6;
                    break;
                case 4:
                    Object objLoadAd5 = abstractC7188l3.loadAd(c0396l);
                    if (objLoadAd5 != null) {
                        str = (String) objLoadAd5;
                        obj = obj6;
                        z = z4;
                        z2 = z5;
                        z3 = z6;
                        objLoadAd = obj3;
                        obj2 = obj7;
                    } else {
                        setLicense = AbstractC2812l.isVip("entityId", "entity_id", c0396l, setLicense);
                        obj = obj6;
                        z2 = z5;
                        z3 = z6;
                        objLoadAd = obj3;
                        z = true;
                        obj2 = obj7;
                        str = str6;
                    }
                    break;
                case 5:
                    Object objLoadAd6 = abstractC7188l3.loadAd(c0396l);
                    if (objLoadAd6 == null) {
                        setLicense = AbstractC2812l.isVip("entityOwnerId", "entity_owner_id", c0396l, setLicense);
                        obj = obj6;
                        z = z4;
                        z3 = z6;
                        objLoadAd = obj3;
                        z2 = true;
                    } else {
                        str2 = (String) objLoadAd6;
                        obj = obj6;
                        z = z4;
                        z2 = z5;
                        z3 = z6;
                        objLoadAd = obj3;
                    }
                    obj2 = obj7;
                    str = str6;
                    break;
                case 6:
                    Object objLoadAd7 = this.purchase.loadAd(c0396l);
                    if (objLoadAd7 == null) {
                        setLicense = AbstractC2812l.isVip("entityType", "entity_type", c0396l, setLicense);
                        obj = obj6;
                        z = z4;
                        z2 = z5;
                        objLoadAd = obj3;
                        z3 = true;
                    } else {
                        enumC12756l = (EnumC12756l) objLoadAd7;
                        obj = obj6;
                        z = z4;
                        z2 = z5;
                        z3 = z6;
                        objLoadAd = obj3;
                    }
                    obj2 = obj7;
                    str = str6;
                    break;
                default:
                    obj = obj6;
                    z = z4;
                    z2 = z5;
                    z3 = z6;
                    objLoadAd = obj3;
                    obj2 = obj7;
                    str = str6;
                    break;
            }
        }
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AudioContentCard)";
    }
}
