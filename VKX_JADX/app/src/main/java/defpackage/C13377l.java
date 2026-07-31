package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: lْٔۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13377l implements InterfaceC10820l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final Size f26254l = new Size(1280, 720);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C16928l f26255l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final EnumC8920l f26256l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final String f26257l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C15421l f26258l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Size f26259l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Range f26260l;

    public C13377l(String str, EnumC8920l enumC8920l, C16928l c16928l, Size size, C15421l c15421l, Range range) {
        this.f26257l = str;
        this.f26256l = enumC8920l;
        this.f26255l = c16928l;
        this.f26259l = size;
        this.f26258l = c15421l;
        this.f26260l = range;
    }

    @Override // defpackage.InterfaceC10820l
    public final Object get() {
        Integer num;
        LinkedHashMap linkedHashMap = AbstractC15040l.yandex;
        C16672l c16672lLoadAd = AbstractC15040l.loadAd(this.f26255l, this.f26260l);
        StringBuilder sb = new StringBuilder("Resolved VIDEO frame rates: Capture frame rate = ");
        int i = c16672lLoadAd.yandex;
        sb.append(i);
        sb.append("fps. Encode frame rate = ");
        int i2 = c16672lLoadAd.loadAd;
        sb.append(i2);
        sb.append("fps.");
        AbstractC5088l.yandex("VidEncCfgDefaultRslvr", sb.toString());
        AbstractC5088l.yandex("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        C15421l c15421l = this.f26258l;
        int i3 = c15421l.loadAd;
        int i4 = c16672lLoadAd.loadAd;
        Size size = this.f26259l;
        int width = size.getWidth();
        Size size2 = f26254l;
        int iAmazon = AbstractC15040l.amazon(14000000, i3, 8, i4, 30, width, size2.getWidth(), size.getHeight(), size2.getHeight());
        HashMap map = AbstractC12637l.purchase;
        String str = this.f26257l;
        Map map2 = (Map) map.get(str);
        int iIntValue = (map2 == null || (num = (Integer) map2.get(c15421l)) == null) ? -1 : num.intValue();
        C8581l c8581lYandex = AbstractC15040l.yandex(iIntValue, str);
        C18289l c18289lAmazon = C5274l.amazon();
        c18289lAmazon.loadAd = str;
        EnumC8920l enumC8920l = this.f26256l;
        if (enumC8920l == null) {
            C6541l.subs("Null inputTimebase");
            return null;
        }
        c18289lAmazon.amazon = enumC8920l;
        if (size == null) {
            C6541l.subs("Null resolution");
            return null;
        }
        c18289lAmazon.purchase = size;
        c18289lAmazon.firebase = Integer.valueOf(iAmazon);
        c18289lAmazon.admob = Integer.valueOf(i);
        c18289lAmazon.subs = Integer.valueOf(i2);
        c18289lAmazon.crashlytics = Integer.valueOf(iIntValue);
        c18289lAmazon.mopub = c8581lYandex;
        return c18289lAmazon.amazon();
    }
}
