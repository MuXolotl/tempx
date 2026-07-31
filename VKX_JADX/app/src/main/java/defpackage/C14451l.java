package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.metrica;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: lٓ۟ۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14451l extends AbstractC14630l implements InterfaceC2262l, InterfaceC4364l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public AbstractC18643l f28308l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f28309l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final InterfaceC17817l f28310l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public Function1 f28311l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final AbstractC7076l f28312l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final boolean f28313l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public final C4910l f28314l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public ArrayList f28315l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final Function0 f28316l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ C18662l f28317l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final InterfaceC1982l f28318l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final C18480l f28319l;

    public C14451l(boolean z, boolean z2, int i, InterfaceC17817l interfaceC17817l, Function0 function0, InterfaceC1982l interfaceC1982l, int i2) {
        AbstractC7076l c2849l;
        C18480l c18480lIsPro;
        int i3 = 0;
        z = (i2 & 1) != 0 ? false : z;
        z2 = (i2 & 2) != 0 ? false : z2;
        i = (i2 & 4) != 0 ? 4 : i;
        interfaceC17817l = (i2 & 8) != 0 ? null : interfaceC17817l;
        function0 = (i2 & 16) != 0 ? null : function0;
        int i4 = 1;
        boolean z3 = (i2 & 32) == 0;
        interfaceC1982l = (i2 & 64) != 0 ? null : interfaceC1982l;
        this.f28317l = AbstractC11990l.loadAd();
        this.f28309l = i;
        this.f28310l = interfaceC17817l;
        this.f28316l = function0;
        this.f28313l = z3;
        this.f28318l = interfaceC1982l;
        this.f28315l = new ArrayList();
        this.f28314l = AbstractC8618l.yandex();
        if (i == 5) {
            if (interfaceC1982l != null) {
                try {
                    c18480lIsPro = interfaceC1982l.isPro();
                } catch (IllegalStateException unused) {
                }
            } else {
                c18480lIsPro = null;
            }
            this.f28319l = c18480lIsPro;
            if (c18480lIsPro != null) {
                c18480lIsPro.f36088l = this;
            }
        }
        int iInmobi = AbstractC5020l.inmobi(this.f28309l);
        if (iInmobi == 0) {
            c2849l = new C2849l(i4);
        } else if (iInmobi == 1 || iInmobi == 2) {
            c2849l = new C2849l(i3);
        } else if (iInmobi == 3) {
            c2849l = new C2899l(z, z2, this.f28313l);
        } else {
            if (iInmobi != 4) {
                C18725l.billing();
                throw null;
            }
            c2849l = new C6278l();
        }
        this.f28312l = c2849l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object inmobi(C14451l c14451l, List list, AbstractC0283l abstractC0283l) throws Throwable {
        C5391l c5391l;
        List list2;
        C14451l c14451l2;
        c14451l.getClass();
        if (abstractC0283l instanceof C5391l) {
            c5391l = (C5391l) abstractC0283l;
            int i = c5391l.f11547l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c5391l.f11547l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c5391l = new C5391l(c14451l, abstractC0283l);
            }
        } else {
            c5391l = new C5391l(c14451l, abstractC0283l);
        }
        Object objFirebase = c5391l.f11550l;
        int i2 = c5391l.f11547l;
        InterfaceC14029l interfaceC14029l = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objFirebase);
            C16552l c16552l = AbstractC11463l.yandex;
            C2975l c2975l = AbstractC17278l.yandex;
            C0071l c0071l = new C0071l(2, interfaceC14029l, 13);
            c5391l.f11549l = list;
            c5391l.f11548l = c14451l;
            c5391l.f11547l = 1;
            objFirebase = AbstractC10999l.firebase(c2975l, c0071l, c5391l);
            EnumC9342l enumC9342l = EnumC9342l.f19165l;
            if (objFirebase == enumC9342l) {
                return enumC9342l;
            }
            list2 = list;
            c14451l2 = c14451l;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c14451l2 = c5391l.f11548l;
            list2 = c5391l.f11549l;
            AbstractC2829l.crashlytics(objFirebase);
        }
        c14451l2.f28308l = (AbstractC18643l) objFirebase;
        if (list2 == null) {
            list2 = C2580l.f5619l;
        }
        ArrayList arrayList = new ArrayList(list2);
        c14451l.f28315l = arrayList;
        super.appmetrica(arrayList);
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.subs
    public final long admob(int i) {
        return ((AudioTrack) this.f28630l.billing.get(i)).hashCode();
    }

    @Override // androidx.recyclerview.widget.subs
    public final void advert(metrica metricaVar) {
        this.f28312l.billing(((C8813l) metricaVar).Signature);
    }

    @Override // defpackage.AbstractC14630l
    public final int applovin() {
        return this.f28312l.purchase();
    }

    @Override // defpackage.AbstractC14630l
    public final void appmetrica(List list) {
        if (this.f28308l == null && list != null) {
            C16552l c16552l = AbstractC11463l.yandex;
            AbstractC10999l.mopub(this, AbstractC17278l.yandex, 0, new C5472l(this, null, 0), 2);
        }
        if (list == null) {
            list = C2580l.f5619l;
        }
        ArrayList arrayList = new ArrayList(list);
        this.f28315l = arrayList;
        super.appmetrica(arrayList);
    }

    @Override // defpackage.InterfaceC4364l
    public final boolean crashlytics() {
        if (this.f28309l == 5) {
            C18480l c18480l = this.f28319l;
            if (!(c18480l != null ? c18480l.f36085l : false)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC4364l
    public final void loadAd(int i, int i2) {
        Collections.swap(this.f28315l, i, i2);
        smaato(i, i2);
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final void m3856package(C1725l c1725l) {
        AbstractC10999l.mopub(this, AbstractC11463l.yandex, 0, new C6603l(this, c1725l, null), 2);
    }

    @Override // defpackage.AbstractC14630l
    public final InterfaceC0589l premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f28312l.crashlytics(layoutInflater, viewGroup);
    }

    @Override // defpackage.AbstractC14630l
    public final void signatures(int i, Object obj, final InterfaceC0589l interfaceC0589l, final C8813l c8813l) {
        final AudioTrack audioTrack = (AudioTrack) obj;
        if (!crashlytics()) {
            interfaceC0589l.getRoot().setOnLongClickListener(new View.OnLongClickListener() { // from class: lٟٓۤ
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    int i2 = C4456l.f9065l;
                    AbstractC4115l.amazon(audioTrack, this.f28433l.f28316l).Signature((Activity) interfaceC0589l.getRoot().getContext());
                    return true;
                }
            });
        }
        interfaceC0589l.getRoot().setOnClickListener(new View.OnClickListener() { // from class: lَؘٞ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C14451l c14451l = this.f21264l;
                C18480l c18480l = c14451l.f28319l;
                InterfaceC17817l interfaceC17817l = c14451l.f28310l;
                AudioTrack audioTrack2 = audioTrack;
                C8813l c8813l2 = c8813l;
                InterfaceC14029l interfaceC14029l = null;
                if (c18480l != null && c18480l.f36085l) {
                    c18480l.ads(audioTrack2, c8813l2.crashlytics());
                    c14451l.f465l.amazon(c8813l2.crashlytics(), 1, null);
                    return;
                }
                boolean zPurchase = AbstractC16676l.purchase(audioTrack2);
                int i2 = 2;
                InterfaceC0589l interfaceC0589l2 = interfaceC0589l;
                if (zPurchase) {
                    new C10655l(new C13752l(audioTrack2), c14451l.f28309l != 5 ? 2 : 1).Signature((AppActivity) interfaceC0589l2.getRoot().getContext());
                    return;
                }
                InterfaceC1982l interfaceC1982l = c14451l.f28318l;
                if (interfaceC1982l != null && (interfaceC17817l instanceof C7108l)) {
                    interfaceC1982l.ads(c8813l2.crashlytics(), ((C7108l) interfaceC17817l).purchase, c14451l.f28630l.billing);
                    return;
                }
                Function1 function1 = c14451l.f28311l;
                if (function1 != null) {
                    function1.invoke(audioTrack2);
                } else {
                    AbstractC9033l.crashlytics((AppActivity) interfaceC0589l2.getRoot().getContext(), new C15556l(c14451l, c8813l2, interfaceC14029l, i2));
                }
            }
        });
        int i2 = this.f28309l;
        AbstractC7076l abstractC7076l = this.f28312l;
        if (i2 != 5) {
            List list = this.f28630l.billing;
            abstractC7076l.loadAd(interfaceC0589l, audioTrack, i);
        } else {
            if ((abstractC7076l instanceof C6278l ? (C6278l) abstractC7076l : null) != null) {
                C6278l.firebase((C4004l) interfaceC0589l, audioTrack, i, this.f28319l, new C5514l(this, c8813l, 12));
            }
        }
    }

    @Override // androidx.recyclerview.widget.subs
    public final void subscription(metrica metricaVar, int i, List list) {
        C8813l c8813l = (C8813l) metricaVar;
        if (list.isEmpty()) {
            ads(c8813l, i);
            return;
        }
        InterfaceC0589l interfaceC0589l = c8813l.Signature;
        Object obj = list.get(0);
        AbstractC7076l abstractC7076l = this.f28312l;
        abstractC7076l.getClass();
        AbstractC8199l abstractC8199l = obj instanceof AbstractC8199l ? (AbstractC8199l) obj : null;
        if (abstractC8199l == null) {
            return;
        }
        ImageView imageViewAdmob = abstractC7076l.admob(interfaceC0589l);
        if (abstractC8199l instanceof C8692l) {
            imageViewAdmob.setVisibility(8);
            imageViewAdmob.setActivated(false);
            abstractC7076l.yandex(interfaceC0589l, false);
            return;
        }
        if (!(abstractC8199l instanceof C2162l) && !(abstractC8199l instanceof C6701l)) {
            C18725l.billing();
            return;
        }
        AbstractC18643l abstractC18643l = abstractC8199l.yandex;
        C16076l c16076l = VKXApplication.f36632l;
        if (c16076l == null) {
            c16076l = null;
        }
        C10507l c10507lCrashlytics = c16076l.crashlytics();
        if (AbstractC8576l.yandex(abstractC18643l, c10507lCrashlytics != null ? c10507lCrashlytics.loadAd : null)) {
            imageViewAdmob.setVisibility(0);
            imageViewAdmob.setActivated(abstractC8199l instanceof C6701l);
            abstractC7076l.yandex(interfaceC0589l, true);
        } else if (imageViewAdmob.getVisibility() != 8) {
            imageViewAdmob.setVisibility(8);
            imageViewAdmob.setActivated(false);
            abstractC7076l.yandex(interfaceC0589l, false);
        }
    }

    /* JADX INFO: renamed from: throws, reason: not valid java name */
    public final void m3857throws(C14759l c14759l) {
        AbstractC10999l.mopub(this, AbstractC11463l.yandex, 0, new C3771l(this, c14759l, null), 2);
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f28317l.f36440l;
    }

    @Override // defpackage.InterfaceC4364l
    public final void yandex(int i) {
        C16534l c16534l;
        C12552l c12552l = this.f28630l;
        AudioTrack audioTrack = (AudioTrack) AbstractC16901l.m4220for(i, c12552l.billing);
        if (audioTrack == null) {
            return;
        }
        List list = c12552l.billing;
        if (i == 0) {
            c16534l = new C16534l(audioTrack, Integer.valueOf(((AudioTrack) list.get(1)).loadAd), (Integer) null, 4);
        } else {
            int iSmaato = AbstractC14055l.smaato(list);
            List list2 = c12552l.billing;
            c16534l = i == iSmaato ? new C16534l(audioTrack, (Integer) null, Integer.valueOf(((AudioTrack) list2.get(AbstractC14055l.smaato(list2) - 1)).loadAd), 2) : new C16534l(audioTrack, (Integer) null, Integer.valueOf(((AudioTrack) list2.get(i - 1)).loadAd), 2);
        }
        AbstractC8189l.purchase(c16534l);
    }
}
