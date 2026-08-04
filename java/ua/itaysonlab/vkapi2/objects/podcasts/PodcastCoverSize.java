package ua.itaysonlab.vkapi2.objects.podcasts;

import defpackage.C12792l;
import defpackage.InterfaceC15749l;
import defpackage.InterfaceC8296l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkapi2/objects/podcasts/PodcastCoverSize;", "", "Companion", "lٖؐؗ", "lّۗۚ", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC8296l
@InterfaceC15749l(generateAdapter = true)
public final class PodcastCoverSize {
    public static final C12792l Companion = new C12792l();
    public final String amazon;
    public final String crashlytics;
    public final String loadAd;
    public final int purchase;
    public final int yandex;

    public /* synthetic */ PodcastCoverSize(int i, int i2, String str, String str2, String str3, int i3) {
        if ((i & 1) == 0) {
            this.yandex = 0;
        } else {
            this.yandex = i2;
        }
        if ((i & 2) == 0) {
            this.loadAd = "";
        } else {
            this.loadAd = str;
        }
        if ((i & 4) == 0) {
            this.crashlytics = "";
        } else {
            this.crashlytics = str2;
        }
        if ((i & 8) == 0) {
            this.amazon = "";
        } else {
            this.amazon = str3;
        }
        if ((i & 16) == 0) {
            this.purchase = 0;
        } else {
            this.purchase = i3;
        }
    }

    public PodcastCoverSize(int i, int i2, String str, String str2, String str3) {
        this.yandex = i;
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = str3;
        this.purchase = i2;
    }
}
