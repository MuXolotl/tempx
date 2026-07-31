package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lْؒؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public abstract class AbstractC13065l implements InterfaceC2244l {
    public final EnumC9331l loadAd;
    public final String yandex;
    public static final C16697l Companion = new C16697l();
    public static final InterfaceC1220l[] crashlytics = {null, AbstractC9968l.crashlytics(2, new C8810l(28))};
    public static final InterfaceC1220l amazon = AbstractC9968l.crashlytics(2, new C8810l(29));

    public /* synthetic */ AbstractC13065l(String str, EnumC9331l enumC9331l, int i) {
        this.yandex = str;
        this.loadAd = enumC9331l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Serializable admob(AbstractC13065l abstractC13065l, AbstractC0283l abstractC0283l) {
        C14800l c14800l;
        List list;
        if (abstractC0283l instanceof C14800l) {
            c14800l = (C14800l) abstractC0283l;
            int i = c14800l.f28944l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c14800l.f28944l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c14800l = new C14800l(abstractC13065l, abstractC0283l);
            }
        } else {
            c14800l = new C14800l(abstractC13065l, abstractC0283l);
        }
        Object objBilling = c14800l.f28945l;
        int i2 = c14800l.f28944l;
        ArrayList arrayList = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objBilling);
            C7644l c7644lLoadAd = AbstractC16584l.loadAd();
            EnumC9331l enumC9331l = abstractC13065l.loadAd;
            String str = abstractC13065l.yandex;
            c14800l.f28946l = abstractC13065l;
            c14800l.f28944l = 1;
            C17464l c17464l = new C17464l("audio.getAudioIdsBySource", C1461l.f3669l);
            c17464l.yandex("source", enumC9331l.f19157l);
            c17464l.yandex("entity_id", str);
            objBilling = c7644lLoadAd.billing(c17464l, c14800l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objBilling == enumC9342l) {
                return enumC9342l;
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            abstractC13065l = c14800l.f28946l;
            AbstractC2829l.crashlytics(objBilling);
        }
        abstractC13065l.getClass();
        C10974l c10974l = (C10974l) AbstractC10802l.isPro((AbstractC14237l) objBilling);
        if (c10974l != null && (list = c10974l.yandex) != null) {
            arrayList = new ArrayList(AbstractC14055l.billing(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C16997l) it.next()).yandex);
            }
        }
        return arrayList == null ? C2580l.f5619l : arrayList;
    }

    public static final /* synthetic */ void subs(AbstractC13065l abstractC13065l, InterfaceC0039l interfaceC0039l, InterfaceC18035l interfaceC18035l) {
        AbstractC4072l abstractC4072l = (AbstractC4072l) interfaceC0039l;
        abstractC4072l.appmetrica(interfaceC18035l, 0, abstractC13065l.yandex);
        abstractC4072l.applovin(interfaceC18035l, 1, (InterfaceC16588l) crashlytics[1].getValue(), abstractC13065l.loadAd);
    }

    @Override // defpackage.InterfaceC2244l
    public final Object amazon(AbstractC0283l abstractC0283l) {
        return admob(this, abstractC0283l);
    }

    @Override // defpackage.InterfaceC17817l
    public final boolean billing() {
        return false;
    }

    @Override // defpackage.InterfaceC2244l
    public final Object loadAd(List list, AbstractC0283l abstractC0283l) {
        String[] strArr = (String[]) list.toArray(new String[0]);
        return AbstractC8189l.admob(new C16534l((String[]) Arrays.copyOf(strArr, strArr.length)), abstractC0283l);
    }

    @Override // defpackage.InterfaceC17817l
    public final String mopub() {
        return null;
    }

    public AbstractC13065l(String str, EnumC9331l enumC9331l) {
        this.yandex = str;
        this.loadAd = enumC9331l;
    }
}
