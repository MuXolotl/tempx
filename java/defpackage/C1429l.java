package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* JADX INFO: renamed from: lَۣؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1429l extends AbstractC1134l {
    public final long crashlytics;
    public final long loadAd;
    public final /* synthetic */ int yandex;

    public C1429l(int i, long j, long j2) {
        this.yandex = i;
        switch (i) {
            case 2:
                this.loadAd = j;
                this.crashlytics = j2;
                break;
            default:
                this.loadAd = j2;
                this.crashlytics = j;
                break;
        }
    }

    public static long amazon(long j, C13143l c13143l) {
        long jSignatures = c13143l.signatures();
        if ((128 & jSignatures) != 0) {
            return 8589934591L & ((((jSignatures & 1) << 32) | c13143l.applovin()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.AbstractC1134l
    public final String toString() {
        switch (this.yandex) {
            case 0:
                StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
                sb.append(this.loadAd);
                sb.append(", identifier= ");
                return AbstractC15560l.ads(this.crashlytics, " }", sb);
            case 1:
                StringBuilder sb2 = new StringBuilder("SCTE-35 SpliceInsertCommand { programSplicePts=");
                sb2.append(this.loadAd);
                sb2.append(", programSplicePlaybackPositionUs= ");
                return AbstractC15560l.ads(this.crashlytics, " }", sb2);
            default:
                StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
                sb3.append(this.loadAd);
                sb3.append(", playbackPositionUs= ");
                return AbstractC15560l.ads(this.crashlytics, " }", sb3);
        }
    }

    public C1429l(long j, long j2, List list) {
        this.yandex = 1;
        this.loadAd = j;
        this.crashlytics = j2;
        DesugarCollections.unmodifiableList(list);
    }
}
