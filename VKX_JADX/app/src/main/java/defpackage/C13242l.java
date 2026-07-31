package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: lٌْۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13242l implements InterfaceC17842l {
    public final long amazon;
    public final C10239l billing;
    public final int crashlytics;
    public final String loadAd;
    public final C3151l purchase;
    public final /* synthetic */ InterfaceC17842l yandex;
    public final C18662l mopub = AbstractC18263l.purchase(this);
    public final C11919l admob = new C11919l(Boolean.TRUE);
    public final C11919l subs = new C11919l(Boolean.FALSE);
    public final C11919l isPro = new C11919l(C11507l.f23131l);

    public C13242l(String str, int i, long j, InterfaceC17842l interfaceC17842l, C3151l c3151l, C10239l c10239l) {
        this.yandex = interfaceC17842l;
        this.loadAd = str;
        this.crashlytics = i;
        this.amazon = j;
        this.purchase = c3151l;
        this.billing = c10239l;
        InterfaceC12356l interfaceC12356lLoadAd = interfaceC17842l.loadAd();
        interfaceC12356lLoadAd.mopub(new C17326l(interfaceC12356lLoadAd, this, 4));
    }

    @Override // defpackage.InterfaceC17842l
    public final C10023l amazon() {
        return this.yandex.amazon();
    }

    @Override // defpackage.InterfaceC17842l
    public final C4917l billing() {
        return this.yandex.billing();
    }

    @Override // defpackage.InterfaceC17842l
    public final C6921l crashlytics() {
        return this.yandex.crashlytics();
    }

    @Override // defpackage.InterfaceC17842l
    public final InterfaceC12356l loadAd() {
        return this.yandex.loadAd();
    }

    @Override // defpackage.InterfaceC17842l
    public final InterfaceC9573l purchase() {
        return this.yandex.purchase();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object yandex(AbstractC0283l abstractC0283l) {
        C15666l c15666l;
        Object c18435l;
        C13242l c13242l;
        if (abstractC0283l instanceof C15666l) {
            c15666l = (C15666l) abstractC0283l;
            int i = c15666l.f30627l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c15666l.f30627l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c15666l = new C15666l(this, abstractC0283l);
            }
        } else {
            c15666l = new C15666l(this, abstractC0283l);
        }
        C15666l c15666l2 = c15666l;
        Object objLoadAd = c15666l2.f30628l;
        int i2 = c15666l2.f30627l;
        C11919l c11919l = this.admob;
        boolean z = true;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(objLoadAd);
                c11919l.subscription(Boolean.TRUE);
                C7644l c7644lLoadAd = AbstractC16584l.loadAd();
                int i3 = this.crashlytics;
                long j = this.amazon;
                int iPro = ((AbstractC18082l) this.isPro.admob()).pro();
                Long l = new Long(j);
                Integer num = new Integer(i3);
                c15666l2.f30629l = this;
                c15666l2.f30627l = 1;
                objLoadAd = AbstractC14312l.loadAd(c7644lLoadAd, iPro, 100, l, num, c15666l2, 16360);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objLoadAd == enumC9342l) {
                    return enumC9342l;
                }
                c13242l = this;
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c13242l = c15666l2.f30629l;
                AbstractC2829l.crashlytics(objLoadAd);
            }
            List<C2757l> list = ((C4363l) AbstractC10802l.subs((AbstractC14237l) objLoadAd)).loadAd;
            ArrayList arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
            for (C2757l c2757l : list) {
                StringBuilder sb = new StringBuilder();
                sb.append((Object) String.valueOf(c2757l.crashlytics));
                sb.append('_');
                sb.append(c2757l.loadAd);
                arrayList.add(new C7933l(sb.toString(), c2757l));
            }
            C11919l c11919l2 = c13242l.isPro;
            c11919l2.subscription(((AbstractC18082l) c11919l2.admob()).advert(arrayList));
            C11919l c11919l3 = c13242l.subs;
            if (arrayList.size() != 100) {
                z = false;
            }
            c11919l3.subscription(Boolean.valueOf(z));
            c18435l = Unit.INSTANCE;
        } catch (Throwable th) {
            c18435l = new C18435l(th);
        }
        Throwable thYandex = C1171l.yandex(c18435l);
        if (thYandex != null) {
            thYandex.printStackTrace();
            this.subs.subscription(Boolean.FALSE);
        }
        c11919l.subscription(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
