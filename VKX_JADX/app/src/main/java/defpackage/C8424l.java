package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.catalogkit.objects.Catalog2Response;

/* JADX INFO: renamed from: lًۧؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8424l implements InterfaceC0896l {
    public final C11919l amazon;
    public final C11919l crashlytics;
    public final C11919l loadAd;
    public final C11919l purchase;
    public final C9554l yandex = new C9554l(new Catalog2Response(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741823));

    public C8424l() {
        C11919l c11919l = new C11919l(EnumC12413l.f24507l);
        this.loadAd = c11919l;
        this.crashlytics = c11919l;
        C11919l c11919l2 = new C11919l(C11507l.f23131l);
        this.amazon = c11919l2;
        this.purchase = c11919l2;
    }

    @Override // defpackage.InterfaceC0896l
    public final void onDestroy() {
        this.loadAd.subscription(EnumC12413l.f24507l);
        this.amazon.subscription(C11507l.f23131l);
        this.yandex.loadAd();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yandex(Function0 function0, AbstractC0283l abstractC0283l) {
        C13472l c13472l;
        Object c18435l;
        if (abstractC0283l instanceof C13472l) {
            c13472l = (C13472l) abstractC0283l;
            int i = c13472l.f26446l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c13472l.f26446l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c13472l = new C13472l(this, abstractC0283l);
            }
        } else {
            c13472l = new C13472l(this, abstractC0283l);
        }
        Object objMopub = c13472l.f26447l;
        int i2 = c13472l.f26446l;
        EnumC12413l enumC12413l = EnumC12413l.f24505l;
        C11919l c11919l = this.loadAd;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(objMopub);
                if (c11919l.admob() == enumC12413l) {
                    return Unit.INSTANCE;
                }
                c11919l.subscription(EnumC12413l.f24507l);
                AbstractC8189l abstractC8189l = (AbstractC8189l) function0.invoke();
                c13472l.f26448l = this;
                c13472l.f26446l = 1;
                objMopub = abstractC8189l.mopub(c13472l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objMopub == enumC9342l) {
                    return enumC9342l;
                }
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = c13472l.f26448l;
                AbstractC2829l.crashlytics(objMopub);
            }
            this.amazon.subscription(AbstractC0509l.billing(AbstractC13360l.yandex(this.yandex, (Catalog2Response) objMopub)));
            this.loadAd.subscription(enumC12413l);
            c18435l = Unit.INSTANCE;
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        Throwable thYandex = C1171l.yandex(c18435l);
        if (thYandex != null) {
            thYandex.printStackTrace();
            c11919l.subscription(EnumC12413l.f24506l);
        }
        return Unit.INSTANCE;
    }
}
