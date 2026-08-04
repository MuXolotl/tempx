package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.privacy.PrivacySetting;
import ua.itaysonlab.vkx.R;

/* JADX INFO: renamed from: lْ۟ٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13695l extends AbstractC11801l implements InterfaceC2262l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f26737l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public final C10086l f26738l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public final C10086l f26739l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public final C10086l f26740l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final /* synthetic */ C18662l f26741l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10227l f26742l;

    public C13695l() {
        super(0);
        this.f26741l = AbstractC11990l.loadAd();
        C10227l c10227lAdmob = AbstractC14055l.admob();
        c10227lAdmob.add(new C8195l(EnumC7331l.EVERYBODY, Integer.valueOf(R.string.privacy_all)));
        c10227lAdmob.add(new C8195l(EnumC7331l.FRIENDS_AND_FOF, Integer.valueOf(R.string.privacy_fof)));
        c10227lAdmob.add(new C8195l(EnumC7331l.FRIENDS, Integer.valueOf(R.string.privacy_friends)));
        c10227lAdmob.add(new C8195l(EnumC7331l.ONLY_ME, Integer.valueOf(R.string.privacy_me)));
        this.f26742l = AbstractC14055l.purchase(c10227lAdmob);
        this.f26740l = AbstractC8020l.smaato(Boolean.TRUE);
        this.f26739l = AbstractC8020l.smaato(Boolean.FALSE);
        EnumC7331l enumC7331l = EnumC7331l.UNKNOWN;
        this.f26738l = AbstractC8020l.smaato(enumC7331l);
        this.f26737l = AbstractC8020l.smaato(enumC7331l);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: import, reason: not valid java name */
    public static final Object m3662import(C13695l c13695l, AbstractC0283l abstractC0283l) {
        C1836l c1836l;
        C13695l c13695l2;
        EnumC7331l enumC7331l;
        C10086l c10086l = c13695l.f26740l;
        if (abstractC0283l instanceof C1836l) {
            c1836l = (C1836l) abstractC0283l;
            int i = c1836l.f4240l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c1836l.f4240l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c1836l = new C1836l(c13695l, abstractC0283l);
            }
        } else {
            c1836l = new C1836l(c13695l, abstractC0283l);
        }
        Object objAdmob = c1836l.f4241l;
        int i2 = c1836l.f4240l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(objAdmob);
                c10086l.setValue(Boolean.TRUE);
                C12772l c12772l = new C12772l((byte) 0, 4);
                c1836l.f4242l = c13695l;
                c1836l.f4240l = 1;
                objAdmob = AbstractC8189l.admob(c12772l, c1836l);
                EnumC9342l enumC9342l = EnumC9342l.f19165l;
                if (objAdmob == enumC9342l) {
                    return enumC9342l;
                }
                c13695l2 = c13695l;
            } else {
                if (i2 != 1) {
                    C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c13695l2 = c1836l.f4242l;
                AbstractC2829l.crashlytics(objAdmob);
            }
            String str = ((PrivacySetting) objAdmob).crashlytics.yandex;
            if (str == null) {
                str = "some";
            }
            Iterator it = EnumC7331l.f15198l.iterator();
            do {
                if (!it.hasNext()) {
                    enumC7331l = EnumC7331l.UNKNOWN;
                    break;
                }
                enumC7331l = (EnumC7331l) it.next();
            } while (!enumC7331l.f15200l.equals(str));
            c13695l.f26737l.setValue(enumC7331l);
            c13695l2.f26738l.setValue(enumC7331l);
            Unit unit = Unit.INSTANCE;
        } catch (Throwable unused) {
        }
        c10086l.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: abstract, reason: not valid java name */
    public final EnumC7331l m3663abstract() {
        return (EnumC7331l) this.f26738l.getValue();
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        c6956l.m2133new(1518870015);
        int i2 = i | (c6956l.admob(this) ? 4 : 2);
        int i3 = 0;
        if (c6956l.m2127for(i2 & 1, (i2 & 3) != 2)) {
            int iAdmob = AbstractC6363l.admob(0, 1, c6956l);
            C13072l c13072lYandex = AbstractC0831l.yandex(c6956l);
            Unit unit = Unit.INSTANCE;
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C16720l(this, null, i3);
                c6956l.m2147try(objM2132native);
            }
            AbstractC12311l.amazon(c6956l, unit, (Function2) objM2132native);
            AbstractC15497l.loadAd(null, AbstractC14566l.amazon(1084776891, new C14601l(c13072lYandex, this, 24), c6956l), null, null, AbstractC14566l.amazon(-899991528, new C9778l(this, iAdmob, i3), c6956l), 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(-847684528, new C0541l(this, c13072lYandex, 6), c6956l), c6956l, 805330992, 237);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C10747l(this, i);
        }
    }

    @Override // defpackage.InterfaceC2262l
    public final InterfaceC12932l vip() {
        return this.f26741l.f36440l;
    }
}
