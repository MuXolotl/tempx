package ua.itaysonlab.vkapi2.objects.users;

import defpackage.InterfaceC12360l;
import defpackage.InterfaceC15749l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lua/itaysonlab/vkapi2/objects/users/VKProfile;", "Llُّؔ;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@InterfaceC15749l(generateAdapter = true)
public final class VKProfile implements InterfaceC12360l {
    public static final VKProfile admob = new VKProfile(0, "Placeholder", "", null, null, null, null, 96);
    public final String amazon;
    public Boolean billing;
    public final String crashlytics;
    public final String loadAd;
    public final Boolean mopub;
    public final String purchase;
    public long yandex;

    public /* synthetic */ VKProfile(long j, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2, int i) {
        this(j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2);
    }

    @Override // defpackage.InterfaceC12360l
    public final String getItemId() {
        return String.valueOf(this.yandex);
    }

    public final String toString() {
        return "VKProfile(id=" + this.yandex + ", renderedName='" + yandex() + "')";
    }

    public final String yandex() {
        String str;
        String str2 = this.loadAd;
        if (str2 == null || (str = this.crashlytics) == null) {
            return this.purchase;
        }
        return str2 + ' ' + str;
    }

    public VKProfile(long j, String str, String str2, String str3, String str4, Boolean bool, Boolean bool2) {
        this.yandex = j;
        this.loadAd = str;
        this.crashlytics = str2;
        this.amazon = str3;
        this.purchase = str4;
        this.billing = bool;
        this.mopub = bool2;
    }
}
