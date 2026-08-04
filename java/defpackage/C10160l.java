package defpackage;

/* JADX INFO: renamed from: lًٍَ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C10160l {
    public final String yandex;

    public /* synthetic */ C10160l(String str) {
        this.yandex = str;
    }

    public static String loadAd(String str) {
        return AbstractC14814l.startapp("CameraId-", str);
    }

    public static void yandex(String str) {
        if (AbstractC12024l.m3315catch(str)) {
            C8339l.metrica("CameraId cannot be null or blank!");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10160l) {
            return AbstractC8576l.yandex(this.yandex, ((C10160l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return loadAd(this.yandex);
    }
}
