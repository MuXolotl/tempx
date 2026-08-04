package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lٓٔۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14157l implements Function1 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ float f27684l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f27685l;

    public /* synthetic */ C14157l(int i, float f) {
        this.f27685l = i;
        this.f27684l = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f27685l;
        float f = this.f27684l;
        switch (i) {
            case 0:
                C6148l c6148l = (C6148l) obj;
                float fTapsense = AbstractC10310l.tapsense(0.9f, 1.0f, 1.0f - AbstractC8576l.amazon(Math.abs(f), 0.0f, 1.0f));
                c6148l.remoteconfig(fTapsense);
                c6148l.vip(fTapsense);
                break;
            case 1:
                C6148l c6148l2 = (C6148l) obj;
                float fCrashlytics = AbstractC10208l.crashlytics(c6148l2, f);
                float fAmazon = AbstractC10208l.amazon(c6148l2, f);
                c6148l2.vip(fAmazon != 0.0f ? fCrashlytics / fAmazon : 1.0f);
                c6148l2.tapsense(AbstractC10208l.yandex);
                break;
            case 2:
                C11183l c11183l = (C11183l) obj;
                long j = C9735l.loadAd;
                if (!C9735l.crashlytics(j, c11183l.f22491l)) {
                    c11183l.f22490l |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    c11183l.f22491l = j;
                }
                List listSingletonList = Collections.singletonList(new C12870l(C9735l.loadAd(0.7f, j)));
                if (!listSingletonList.equals(c11183l.f22499l)) {
                    c11183l.f22490l |= AbstractC12994l.AUDIO_CONTENT_BUFFER_SIZE;
                    c11183l.f22499l = listSingletonList;
                }
                if (0.15f != c11183l.f22501l) {
                    c11183l.f22490l |= 64;
                    c11183l.f22501l = 0.15f;
                }
                if (!C14467l.loadAd(25.0f, c11183l.f22496l)) {
                    c11183l.f22490l |= 32;
                    c11183l.f22496l = 25.0f;
                }
                InterfaceC16339l interfaceC16339l = c11183l.f22483l;
                C18501l c18501l = C18501l.yandex;
                if (!c18501l.equals(interfaceC16339l)) {
                    c11183l.f22483l = c18501l;
                    c11183l.f22490l |= 2;
                }
                if (true != c11183l.f22489l) {
                    c11183l.f22489l = true;
                    c11183l.f22490l |= 1;
                }
                c11183l.f22502l = true;
                C10417l c10417l = new C10417l(AbstractC5355l.loadAd, (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L));
                if (!c10417l.equals(c11183l.f22487l)) {
                    c11183l.f22490l |= 4096;
                    c11183l.f22487l = c10417l;
                }
                break;
            default:
                ((C6148l) obj).pro(-f);
                break;
        }
        return Unit.INSTANCE;
    }
}
