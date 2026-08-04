package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lُُۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C10974l {
    public static final C15149l Companion = new C15149l();
    public static final InterfaceC1220l[] loadAd = {AbstractC9968l.crashlytics(2, new C14499l(2))};
    public final List yandex;

    public /* synthetic */ C10974l(int i, List list) {
        if ((i & 1) == 0) {
            this.yandex = C2580l.f5619l;
        } else {
            this.yandex = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10974l) && AbstractC8576l.yandex(this.yandex, ((C10974l) obj).yandex);
    }

    public final int hashCode() {
        return this.yandex.hashCode();
    }

    public final String toString() {
        return AbstractC0653l.subscription(new StringBuilder("AudioGetAudioIdsBySourceResponseDto(audios="), this.yandex, ')');
    }
}
