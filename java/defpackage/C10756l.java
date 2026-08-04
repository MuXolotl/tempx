package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* JADX INFO: renamed from: lُؐٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class C10756l extends Exception {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21789l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10756l(int i, String str) {
        super("sRPC " + i + ": " + str);
        this.f21789l = 14;
    }

    private final synchronized Throwable yandex() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f21789l) {
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                yandex();
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10756l(int i, String str, Throwable th) {
        super(str, th);
        this.f21789l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10756l(String str, int i) {
        super(str);
        this.f21789l = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10756l(Throwable th) {
        super(th);
        this.f21789l = 7;
    }
}
