package defpackage;

import android.content.Intent;
import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lُٟ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC11383l extends AbstractC10581l implements InterfaceC0605l {

    /* JADX INFO: renamed from: lْؗۚ, reason: contains not printable characters */
    public final C11446l f22964l;

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public final C10086l f22961l = AbstractC8020l.smaato(Boolean.TRUE);

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C10086l f22965l = AbstractC8020l.smaato("");

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public final C4910l f22962l = AbstractC8618l.yandex();

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public final C10086l f22963l = AbstractC8020l.smaato(C11507l.f23131l);

    public AbstractC11383l() {
        int i = 1;
        this.f22964l = new C11446l(new C14350l(this, i), new C14350l(this, 2), null, new C11978l(this, i), false, false, null, 68);
    }

    /* JADX INFO: renamed from: break, reason: not valid java name */
    public static final Object m3075break(AbstractC11383l abstractC11383l, String str, AbstractC5563l abstractC5563l) {
        C16552l c16552l = AbstractC11463l.yandex;
        Object objFirebase = AbstractC10999l.firebase(ExecutorC6708l.f14063l, new C12393l(abstractC11383l, str, (InterfaceC14029l) null, 0), abstractC5563l);
        return objFirebase == EnumC9342l.f19165l ? objFirebase : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: finally */
    public abstract void mo2666finally(int i, int i2, C6956l c6956l);

    @Override // defpackage.InterfaceC0605l
    public final void mopub(String str) {
        this.f22965l.setValue(str);
    }

    @Override // defpackage.AbstractC11801l
    /* JADX INFO: renamed from: new */
    public final void mo271new(C6956l c6956l, int i) {
        InterfaceC4138l interfaceC4138lLoadAd;
        c6956l.m2123default(-1822935307);
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 33) {
            c6956l.m2123default(-1499067944);
            interfaceC4138lLoadAd = AbstractC12027l.loadAd("android.permission.READ_MEDIA_AUDIO", c6956l);
            c6956l.startapp(false);
        } else {
            c6956l.m2123default(-1498977517);
            interfaceC4138lLoadAd = AbstractC12027l.loadAd("android.permission.READ_EXTERNAL_STORAGE", c6956l);
            c6956l.startapp(false);
        }
        String str = (String) this.f22965l.getValue();
        InterfaceC12152l interfaceC12152lAmazon = interfaceC4138lLoadAd.amazon();
        boolean zBilling = c6956l.billing(interfaceC4138lLoadAd) | c6956l.admob(this);
        Object objM2132native = c6956l.m2132native();
        if (zBilling || objM2132native == C1867l.yandex) {
            objM2132native = new C18731l(interfaceC4138lLoadAd, this, null, 28);
            c6956l.m2147try(objM2132native);
        }
        AbstractC12311l.purchase(str, interfaceC12152lAmazon, (Function2) objM2132native, c6956l);
        AbstractC15497l.loadAd(null, AbstractC14566l.amazon(-1836938311, new C14233l(this, i2), c6956l), null, null, null, 0, 0L, 0L, ((C15700l) c6956l.isPro(AbstractC18678l.yandex)).amazon(c6956l), AbstractC14566l.amazon(-1760728444, new C0541l(interfaceC4138lLoadAd, this, 1), c6956l), c6956l, 805306416, 253);
        c6956l.startapp(false);
    }

    /* JADX INFO: renamed from: public */
    public abstract void mo2668public(Function0 function0, C6956l c6956l, int i);

    @Override // defpackage.InterfaceC0605l
    public final void remoteconfig(int i, int i2, Intent intent) {
        AbstractC9029l.yandex(this, i, i2, intent);
    }

    /* JADX INFO: renamed from: this */
    public abstract void mo2669this(InterfaceC12360l interfaceC12360l, C6956l c6956l);

    /* JADX INFO: renamed from: transient */
    public abstract Object mo2670transient(String str);

    /* JADX INFO: renamed from: try, reason: not valid java name */
    public void mo3076try(C6956l c6956l, int i) {
        c6956l.m2123default(-343070938);
        c6956l.startapp(false);
    }
}
