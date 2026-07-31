package defpackage;

import android.os.Trace;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lّٜؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12404l {
    public final C0466l yandex;

    public C12404l(C0466l c0466l) {
        this.yandex = c0466l;
    }

    public final void loadAd(AbstractC6896l... abstractC6896lArr) {
        C15615l c15615l = this.yandex.yandex;
        AbstractC6896l[] abstractC6896lArr2 = (AbstractC6896l[]) Arrays.copyOf(abstractC6896lArr, abstractC6896lArr.length);
        Trace.beginSection("CX:unbind");
        try {
            AbstractC12225l.crashlytics();
            if (C15615l.loadAd(c15615l) == 2) {
                throw new UnsupportedOperationException("Unbind UseCase is not supported in concurrent camera mode, call unbindAll() first.");
            }
            ((C15974l) c15615l.f30482l).firebase(new C1869l(AbstractC8669l.m2420volatile(abstractC6896lArr2), null, C2580l.f5619l), (HashSet) c15615l.f30485l);
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final C7930l yandex(InterfaceC3177l interfaceC3177l, C7542l c7542l, C12418l c12418l) {
        C15615l c15615l = this.yandex.yandex;
        Trace.beginSection("CX:bindToLifecycle-UseCaseGroup");
        try {
            if (C15615l.loadAd(c15615l) == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first.");
            }
            C15615l.crashlytics(c15615l, 1);
            C7930l c7930lAmazon = C15615l.amazon(c15615l, interfaceC3177l, c7542l, new C1869l((List) c12418l.f24518l, (C14671l) c12418l.f24519l, (List) c12418l.f24521l));
            Trace.endSection();
            return c7930lAmazon;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
