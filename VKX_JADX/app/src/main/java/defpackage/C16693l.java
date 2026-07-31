package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioSnippetEntry;

/* JADX INFO: renamed from: lٖۡٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C16693l implements Function2 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f32711l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ boolean f32712l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32713l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f32714l;

    public /* synthetic */ C16693l(C0483l c0483l, boolean z, C14267l c14267l) {
        this.f32713l = 0;
        this.f32711l = c0483l;
        this.f32712l = z;
        this.f32714l = c14267l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f32713l;
        int i2 = 1;
        boolean z = this.f32712l;
        Object obj3 = this.f32714l;
        Object obj4 = this.f32711l;
        switch (i) {
            case 0:
                C0483l c0483l = (C0483l) obj4;
                C14267l c14267l = (C14267l) obj3;
                C6956l c6956l = (C6956l) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c6956l.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0483l.loadAd(this.f32712l, AbstractC3605l.smaato(C4346l.f8873l, 16.0f), AbstractC14566l.amazon(-1656659094, new C16270l(c0483l, c14267l, i2), c6956l), c6956l, 432);
                } else {
                    c6956l.m2124else();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((C7721l) obj4).m2206import(z, (AudioSnippetEntry) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC13402l.yandex(z, (Function1) obj4, (InterfaceC17242l) obj3, (C6956l) obj, AbstractC0545l.purchase(385));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((C7069l) obj4).loadAd(z, (Function2) obj3, (C6956l) obj, AbstractC0545l.purchase(3073));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((C0956l) obj4).mopub((String) obj3, z, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC13693l.loadAd(z, (C17004l) obj4, (Function0) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC12953l.isPro((C12097l) obj4, z, (Function0) obj3, (C6956l) obj, AbstractC0545l.purchase(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ C16693l(C0956l c0956l, String str, boolean z, int i) {
        this.f32713l = 4;
        this.f32711l = c0956l;
        this.f32714l = str;
        this.f32712l = z;
    }

    public /* synthetic */ C16693l(Object obj, boolean z, Object obj2, int i, int i2) {
        this.f32713l = i2;
        this.f32711l = obj;
        this.f32712l = z;
        this.f32714l = obj2;
    }

    public /* synthetic */ C16693l(boolean z, Object obj, Object obj2, int i, int i2) {
        this.f32713l = i2;
        this.f32712l = z;
        this.f32711l = obj;
        this.f32714l = obj2;
    }
}
