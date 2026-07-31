package defpackage;

/* JADX INFO: renamed from: lؑ٘ٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0381l {
    public static final C15230l loadAd = new C15230l();
    public final Object yandex;

    public static final void loadAd(Object obj) {
        if (obj instanceof C15230l) {
            if (!(obj instanceof C14638l)) {
                C8339l.smaato("Trying to call 'getOrThrow' on a failed result of a non-closed channel");
                return;
            }
            Throwable th = ((C14638l) obj).yandex;
            if (th != null) {
                throw th;
            }
            C8339l.smaato("Trying to call 'getOrThrow' on a channel closed without a cause");
        }
    }

    public static final Object yandex(Object obj) {
        if (obj instanceof C15230l) {
            return null;
        }
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0381l) {
            return AbstractC8576l.yandex(this.yandex, ((C0381l) obj).yandex);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.yandex;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.yandex;
        if (obj instanceof C14638l) {
            return ((C14638l) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
