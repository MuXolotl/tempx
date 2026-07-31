package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٔۦؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15309l extends AbstractC11904l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final C2563l f29917l = new C2563l(3, AbstractC18202l.yandex.loadAd(C15309l.class), 2, null);

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f29918l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final long f29919l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f29920l;

    public C15309l(long j, int i, boolean z, C3844l c3844l) {
        super(f29917l, c3844l);
        this.f29919l = j;
        this.f29918l = i;
        this.f29920l = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15309l)) {
            return false;
        }
        C15309l c15309l = (C15309l) obj;
        return AbstractC8576l.yandex(yandex(), c15309l.yandex()) && this.f29919l == c15309l.f29919l && this.f29918l == c15309l.f29918l && this.f29920l == c15309l.f29920l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = yandex().hashCode() * 37;
        long j = this.f29919l;
        int i2 = ((((iHashCode + ((int) (j ^ (j >>> 32)))) * 37) + this.f29918l) * 37) + (this.f29920l ? 1231 : 1237);
        this.f23747l = i2;
        return i2;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("last_read=" + this.f29919l);
        arrayList.add("unread_messages=" + this.f29918l);
        AbstractC9029l.ad(new StringBuilder("is_important="), this.f29920l, arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "InboxIsReadResponse{", "}", null, 56);
    }
}
