package ua.itaysonlab.vkapi2.objects.music.catalog;

import defpackage.AbstractC11036l;
import defpackage.C10174l;
import defpackage.C10914l;
import defpackage.InterfaceC15749l;
import defpackage.InterfaceC8296l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/catalog/CustomCatalogBlockItemPhoto;", "", "Companion", "lًَۤ", "lٌُؚ", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC8296l
@InterfaceC15749l(generateAdapter = true)
public final class CustomCatalogBlockItemPhoto {
    public static final C10914l Companion = new C10914l();
    public final String amazon;
    public final int crashlytics;
    public final String loadAd;
    public final int yandex;

    public /* synthetic */ CustomCatalogBlockItemPhoto(int i, int i2, int i3, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC11036l.isPro(i, 7, C10174l.yandex.purchase());
            throw null;
        }
        this.yandex = i2;
        this.loadAd = str;
        this.crashlytics = i3;
        if ((i & 8) == 0) {
            this.amazon = "";
        } else {
            this.amazon = str2;
        }
    }

    public CustomCatalogBlockItemPhoto(int i, int i2, String str, String str2) {
        this.yandex = i;
        this.loadAd = str;
        this.crashlytics = i2;
        this.amazon = str2;
    }
}
