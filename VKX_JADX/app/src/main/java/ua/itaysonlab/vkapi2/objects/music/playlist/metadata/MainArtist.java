package ua.itaysonlab.vkapi2.objects.music.playlist.metadata;

import defpackage.AbstractC11036l;
import defpackage.AbstractC8576l;
import defpackage.AbstractC9968l;
import defpackage.C15367l;
import defpackage.C16513l;
import defpackage.C6573l;
import defpackage.InterfaceC1220l;
import defpackage.InterfaceC15749l;
import defpackage.InterfaceC8296l;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lua/itaysonlab/vkapi2/objects/music/playlist/metadata/MainArtist;", "", "Companion", "lٕۣؐ", "lٖٝٓ", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC8296l
@InterfaceC15749l(generateAdapter = true)
public final class MainArtist {
    public static final C16513l Companion = new C16513l();
    public static final InterfaceC1220l[] billing = {null, null, null, AbstractC9968l.crashlytics(2, new C6573l(7)), null};
    public final List amazon;
    public final String crashlytics;
    public final String loadAd;
    public final boolean purchase;
    public final String yandex;

    public /* synthetic */ MainArtist(int i, String str, String str2, String str3, List list, boolean z) {
        if (5 != (i & 5)) {
            AbstractC11036l.isPro(i, 5, C15367l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        if ((i & 2) == 0) {
            this.loadAd = null;
        } else {
            this.loadAd = str2;
        }
        this.crashlytics = str3;
        if ((i & 8) == 0) {
            this.amazon = null;
        } else {
            this.amazon = list;
        }
        if ((i & 16) == 0) {
            this.purchase = false;
        } else {
            this.purchase = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MainArtist.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        MainArtist mainArtist = (MainArtist) obj;
        return AbstractC8576l.yandex(this.yandex, mainArtist.yandex) && AbstractC8576l.yandex(this.crashlytics, mainArtist.crashlytics);
    }

    public final int hashCode() {
        String str = this.yandex;
        return this.crashlytics.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    public MainArtist(String str, String str2, String str3, List list, boolean z) {
        this.yandex = str;
        this.loadAd = str2;
        this.crashlytics = str3;
        this.amazon = list;
        this.purchase = z;
    }

    public /* synthetic */ MainArtist(String str, String str2, String str3, List list, boolean z, int i) {
        this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? false : z);
    }
}
