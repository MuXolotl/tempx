package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؚؓؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6982l implements Function1 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f14649l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f14650l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f14651l;

    public /* synthetic */ C6982l(Object obj, Object obj2, int i) {
        this.f14651l = i;
        this.f14649l = obj;
        this.f14650l = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f14651l;
        Object obj2 = this.f14650l;
        Object obj3 = this.f14649l;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                return ((C14813l) obj3).invoke(Integer.valueOf(iIntValue), ((List) obj2).get(iIntValue));
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                return ((C14813l) obj3).invoke(Integer.valueOf(iIntValue2), ((List) obj2).get(iIntValue2));
            default:
                Throwable th = (Throwable) obj;
                if (th instanceof C14930l) {
                    ((AbstractC16137l) obj3).crashlytics.compareAndSet(-256, ((C14930l) th).f29384l);
                }
                ((ListenableFuture) obj2).cancel(false);
                return Unit.INSTANCE;
        }
    }
}
