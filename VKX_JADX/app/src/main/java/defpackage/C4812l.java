package defpackage;

/* JADX INFO: renamed from: lُؗؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4812l {
    public final int yandex;

    public C4812l(int i) {
        this.yandex = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C4812l) && this.yandex == ((C4812l) obj).yandex;
    }

    public final int hashCode() {
        return (this.yandex ^ 1000003) * 1000003;
    }

    public final String toString() {
        return AbstractC14814l.remoteconfig(this.yandex, ", cause=null}", new StringBuilder("StateError{code="));
    }
}
