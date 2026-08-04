package defpackage;

import android.os.SystemClock;

/* JADX INFO: renamed from: lٗۚؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17388l extends AbstractC11156l {
    public final /* synthetic */ int admob;

    public /* synthetic */ C17388l(int i) {
        this.admob = i;
    }

    @Override // defpackage.AbstractC11156l
    public final long billing() {
        switch (this.admob) {
            case 0:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}
