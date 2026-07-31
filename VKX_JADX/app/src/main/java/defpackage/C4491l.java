package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.service.AutostartReceiver;

/* JADX INFO: renamed from: lؖۤٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4491l extends AbstractC5563l implements Function2 {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final /* synthetic */ C7968l f9124l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ Context f9125l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f9126l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public /* synthetic */ Object f9127l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final /* synthetic */ String f9128l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC4505l f9129l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final /* synthetic */ boolean f9130l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4491l(InterfaceC4505l interfaceC4505l, C7968l c7968l, Context context, String str, boolean z, boolean z2, InterfaceC14029l interfaceC14029l) {
        super(2, interfaceC14029l);
        this.f9129l = interfaceC4505l;
        this.f9124l = c7968l;
        this.f9125l = context;
        this.f9128l = str;
        this.f9126l = z;
        this.f9130l = z2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.AbstractC12050l
    public final Object Signature(Object obj) {
        boolean zIsIgnoringBatteryOptimizations;
        InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f9127l;
        AbstractC2829l.crashlytics(obj);
        boolean zYandex = AbstractC8576l.yandex(this.f9129l, C17565l.yandex);
        Context context = this.f9125l;
        String str = this.f9128l;
        C7968l c7968l = this.f9124l;
        if (zYandex) {
            try {
                C16968l c16968l = AutostartReceiver.yandex;
                AbstractC7720l.mopub(context, C16968l.loadAd(context, str, this.f9126l, c7968l.f16618l, c7968l.f16615l));
            } catch (Exception e) {
                AbstractC2991l.billing(AbstractC17265l.yandex(interfaceC2262l), 6, "autostart direct failed", e);
                C16968l c16968l2 = AutostartReceiver.yandex;
                C16968l.yandex(this.f9125l, this.f9129l, str, this.f9130l, c7968l.f16618l, c7968l.f16615l);
            }
        } else {
            if (c7968l.f16619l) {
                C16968l c16968l3 = AutostartReceiver.yandex;
                if (Build.VERSION.SDK_INT < 31) {
                    zIsIgnoringBatteryOptimizations = true;
                } else {
                    PowerManager powerManager = (PowerManager) context.getSystemService(PowerManager.class);
                    zIsIgnoringBatteryOptimizations = powerManager != null ? powerManager.isIgnoringBatteryOptimizations(context.getPackageName()) : false;
                }
                if (zIsIgnoringBatteryOptimizations) {
                    C16968l c16968l4 = AutostartReceiver.yandex;
                    AbstractC7720l.mopub(context, C16968l.loadAd(context, str, this.f9126l, c7968l.f16618l, c7968l.f16615l));
                }
            }
            C16968l c16968l5 = AutostartReceiver.yandex;
            C16968l.yandex(this.f9125l, this.f9129l, str, this.f9130l, c7968l.f16618l, c7968l.f16615l);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.AbstractC12050l
    public final InterfaceC14029l ads(InterfaceC14029l interfaceC14029l, Object obj) {
        C4491l c4491l = new C4491l(this.f9129l, this.f9124l, this.f9125l, this.f9128l, this.f9126l, this.f9130l, interfaceC14029l);
        c4491l.f9127l = obj;
        return c4491l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4491l) ads((InterfaceC14029l) obj2, (InterfaceC2262l) obj)).Signature(Unit.INSTANCE);
    }
}
