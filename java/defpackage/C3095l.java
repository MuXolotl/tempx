package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import kotlin.Unit;

/* JADX INFO: renamed from: lؕؐؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3095l implements InterfaceC17842l {
    public final C17928l amazon;
    public final C11644l crashlytics;
    public final C18662l loadAd;
    public final C11919l purchase;
    public final /* synthetic */ C16793l yandex;

    public C3095l(C16793l c16793l) {
        this.yandex = c16793l;
        C18662l c18662lPurchase = AbstractC18263l.purchase(this);
        this.loadAd = c18662lPurchase;
        int i = 0;
        C7424l c7424l = new C7424l(this, i);
        int i2 = 1;
        C7424l c7424l2 = new C7424l(this, i2);
        C11644l c11644l = new C11644l(c18662lPurchase, Collections.singletonList(new C15814l(new C6379l(c7424l, null), new C4236l(3, C12450l.yandex, C12450l.class, "checkDuplicateSession", "checkDuplicateSession(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 14), c7424l2)));
        this.crashlytics = c11644l;
        InterfaceC12356l interfaceC12356l = c16793l.yandex;
        interfaceC12356l.mopub(new C12924l(interfaceC12356l, this, i2));
        if (interfaceC12356l.yandex() == EnumC2771l.f6019l) {
            C7504l c7504l = (C7504l) c11644l.f23361l;
            if (c7504l != null) {
                c7504l.ads(null);
            }
            c11644l.f23361l = null;
        } else {
            interfaceC12356l.mopub(new C8633l(5, this));
        }
        interfaceC12356l.mopub(new C12924l(interfaceC12356l, this, i));
        C17928l c17928l = new C17928l();
        this.amazon = c17928l;
        C5834l c5834l = new C5834l(0, this, C3095l.class, "initialStack", "initialStack()Ljava/util/List;", 0, 0, 12);
        int i3 = 2;
        Class<C3095l> cls = C3095l.class;
        String str = "createChild";
        String str2 = "createChild(Lua/itaysonlab/vkxtv/components/VkxTvRootComponent$Config;Lcom/arkivanov/decompose/ComponentContext;)Lua/itaysonlab/vkxtv/core/ComposeComponent;";
        this.purchase = AbstractC0545l.yandex(this, c17928l, InterfaceC0564l.Companion.serializer(), c5834l, "DefaultChildStack", true, new C14959l(i3, this, cls, str, str2, 0, 0, 16));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object yandex(C3095l c3095l, AbstractC0283l abstractC0283l) {
        C9423l c9423l;
        C17928l c17928l = c3095l.amazon;
        if (abstractC0283l instanceof C9423l) {
            c9423l = (C9423l) abstractC0283l;
            int i = c9423l.f19278l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c9423l.f19278l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c9423l = new C9423l(c3095l, abstractC0283l);
            }
        } else {
            c9423l = new C9423l(c3095l, abstractC0283l);
        }
        Object obj = c9423l.f19277l;
        int i2 = c9423l.f19278l;
        InterfaceC14029l interfaceC14029l = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C5492l c5492l = (C5492l) ((C7549l) AbstractC16584l.yandex().billing.billing).f15551l.getValue();
            if (c5492l != null && c5492l.loadAd == ((C4645l) AbstractC16584l.loadAd().f15735l).yandex && ((Boolean) ((C7549l) AbstractC16584l.yandex().billing.admob).f15551l.getValue()).booleanValue()) {
                AbstractC6873l.crashlytics(c17928l, new C8578l(25));
                AbstractC10999l.mopub(c3095l.loadAd, null, 0, new C11671l(c3095l, interfaceC14029l, 15), 3);
            } else {
                AbstractC16584l.yandex().yandex();
                C5374l c5374lYandex = AbstractC16584l.yandex();
                c9423l.f19278l = 1;
                Object objLoadAd = c5374lYandex.loadAd(c9423l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objLoadAd == enumC9342l) {
                    return enumC9342l;
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC2829l.crashlytics(obj);
        if (((Boolean) ((C7549l) AbstractC16584l.yandex().billing.admob).f15551l.getValue()).booleanValue()) {
            AbstractC6873l.crashlytics(c17928l, new C8578l(26));
        } else {
            AbstractC6873l.crashlytics(c17928l, new C8578l(27));
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC17842l
    public final C10023l amazon() {
        return this.yandex.loadAd;
    }

    @Override // defpackage.InterfaceC17842l
    public final C4917l billing() {
        return this.yandex.purchase;
    }

    @Override // defpackage.InterfaceC17842l
    public final C6921l crashlytics() {
        return this.yandex.crashlytics;
    }

    @Override // defpackage.InterfaceC17842l
    public final InterfaceC12356l loadAd() {
        return this.yandex.yandex;
    }

    @Override // defpackage.InterfaceC17842l
    public final InterfaceC9573l purchase() {
        return this.yandex.amazon;
    }
}
