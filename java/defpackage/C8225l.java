package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: lًۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C8225l implements InterfaceC0627l {
    public final InterfaceC18322l amazon;
    public final C5664l crashlytics;
    public final C7931l loadAd;
    public final C7094l purchase;
    public final C11969l yandex;

    public C8225l(C11969l c11969l, C7931l c7931l, C5664l c5664l, InterfaceC18322l interfaceC18322l, C7094l c7094l) {
        this.yandex = c11969l;
        this.loadAd = c7931l;
        this.crashlytics = c5664l;
        this.amazon = interfaceC18322l;
        this.purchase = c7094l;
    }

    @Override // defpackage.InterfaceC0627l
    public final InterfaceC17866l yandex(InterfaceC2413l interfaceC2413l, Map map, C15202l c15202l) throws Exception {
        InterfaceC16282l interfaceC16282lAmazon;
        C7931l c7931l = this.loadAd;
        if (c7931l.admob != 2) {
            C4875l.smaato(C10053l.admob(this.loadAd.admob), " for Extension CameraGraph", "Unsupported session mode: ");
            return null;
        }
        Object obj = c7931l.mopub.get(AbstractC12634l.yandex);
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num == null) {
            C8339l.smaato("The CameraPipeKeys.camera2ExtensionMode must be set in the sessionParameters of the CameraGraph.Config when creating an Extension CameraGraph.");
            return null;
        }
        int iIntValue = num.intValue();
        if (this.loadAd.amazon != null) {
            C8339l.smaato("Reprocessing is not supported for Extensions");
            return null;
        }
        C10861l c10861l = (C10861l) ((C10596l) this.amazon).purchase(interfaceC2413l.vip());
        Set set = (Set) c10861l.f21957l.getValue();
        C7094l c7094l = this.purchase;
        if (!set.contains(Integer.valueOf(iIntValue))) {
            c7094l.getClass();
            Log.w("CXCP", interfaceC2413l + " does not support extension mode " + iIntValue + ". Supported extensions are " + set);
        }
        if (this.loadAd.purchase != null) {
            synchronized (c10861l.f21963l) {
                interfaceC16282lAmazon = (InterfaceC16282l) c10861l.f21963l.get(Integer.valueOf(iIntValue));
            }
            if (interfaceC16282lAmazon == null) {
                interfaceC16282lAmazon = c10861l.f21956l.amazon(iIntValue, c10861l.f21960l);
                synchronized (c10861l.f21963l) {
                    c10861l.f21963l.put(Integer.valueOf(iIntValue), interfaceC16282lAmazon);
                    Unit unit = Unit.INSTANCE;
                }
            }
            C7094l c7094l2 = this.purchase;
            if (!((Boolean) ((C3390l) interfaceC16282lAmazon).f7237l.getValue()).booleanValue()) {
                c7094l2.getClass();
                Log.w("CXCP", interfaceC2413l + " does not support Postview streams");
            }
            if (this.loadAd.purchase.yandex.size() != 1) {
                C8339l.smaato("Postview streams can only have one OutputStream.config object");
                return null;
            }
        }
        C4291l c4291lAmazon = AbstractC11965l.amazon(this.loadAd, this.crashlytics, map);
        if (c4291lAmazon.yandex.isEmpty()) {
            Log.w("CXCP", "Failed to create OutputConfigurations for " + this.loadAd);
            c15202l.yandex();
            return C7472l.f15449l;
        }
        if (!c4291lAmazon.loadAd.isEmpty()) {
            C8339l.smaato("Deferred output is not supported for Extensions");
            return null;
        }
        C8796l c8796l = new C8796l(c15202l);
        ArrayList arrayList = c4291lAmazon.yandex;
        ExecutorC10608l executorC10608l = new ExecutorC10608l(this.yandex.yandex(), 1);
        C7931l c7931l2 = this.loadAd;
        if (interfaceC2413l.mo838l(new C9212l(arrayList, executorC10608l, c15202l, c7931l2.billing, c7931l2.mopub, Integer.valueOf(iIntValue), c8796l, c4291lAmazon.crashlytics))) {
            return new C5522l(c4291lAmazon.loadAd, c4291lAmazon.amazon);
        }
        Log.w("CXCP", "Failed to create ExtensionCaptureSession from " + interfaceC2413l + " for " + c15202l + '!');
        c15202l.yandex();
        return C7472l.f15449l;
    }
}
