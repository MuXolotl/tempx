package defpackage;

/* JADX INFO: renamed from: lٕۧؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16080l {
    public final ScheduledExecutorServiceC10335l loadAd;
    public final C15615l yandex;

    public C16080l(C15615l c15615l, ScheduledExecutorServiceC10335l scheduledExecutorServiceC10335l) {
        this.yandex = c15615l;
        this.loadAd = scheduledExecutorServiceC10335l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16080l)) {
            return false;
        }
        C16080l c16080l = (C16080l) obj;
        return this.yandex == c16080l.yandex && this.loadAd == c16080l.loadAd;
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "ListenerWrapper(listener=" + this.yandex + ", executor=" + this.loadAd + ')';
    }
}
