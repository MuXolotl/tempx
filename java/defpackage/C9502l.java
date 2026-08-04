package defpackage;

import android.content.Context;
import android.provider.MediaStore;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lٍّؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9502l extends AbstractC11383l {

    /* JADX INFO: renamed from: lِؒؗ, reason: contains not printable characters */
    public final C10086l f19381l = AbstractC8020l.smaato(AbstractC0968l.purchase.yandex());

    /* JADX INFO: renamed from: lؚؕؖ, reason: contains not printable characters */
    public final C10086l f19382l = AbstractC8020l.smaato(Boolean.FALSE);

    @Override // defpackage.AbstractC11383l
    /* JADX INFO: renamed from: finally, reason: not valid java name */
    public final void mo2666finally(int i, int i2, C6956l c6956l) {
        Object c18435l;
        c6956l.m2133new(-2146215913);
        int i3 = (c6956l.amazon(i) ? 4 : 2) | i2 | (c6956l.admob(this) ? 32 : 16);
        if (c6956l.m2127for(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 14) == 4;
            Object objM2132native = c6956l.m2132native();
            if (z || objM2132native == C1867l.yandex) {
                Context context = this.f34617l;
                try {
                    c18435l = (context == null ? null : context.getResources()).getQuantityString(R.plurals.artists, i, Integer.valueOf(i));
                } catch (Throwable th) {
                    c18435l = new C18435l(th);
                }
                if (C1171l.yandex(c18435l) != null) {
                    c18435l = String.valueOf(i);
                }
                objM2132native = (String) c18435l;
                c6956l.m2147try(objM2132native);
            }
            AbstractC13010l.loadAd((String) objM2132native, null, ((C14370l) c6956l.isPro(AbstractC16964l.yandex)).yandex.subscription, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l, 0, 0, 262138);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C1674l(this, i, i2, 8);
        }
    }

    /* JADX INFO: renamed from: protected, reason: not valid java name */
    public final void m2667protected(final C13884l c13884l, C6956l c6956l, int i) {
        c6956l.m2133new(1012494775);
        int i2 = (c6956l.billing(c13884l) ? 4 : 2) | i | (c6956l.admob(this) ? 32 : 16);
        final int i3 = 0;
        final int i4 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            InterfaceC17242l interfaceC17242lAmazon = AbstractC0080l.amazon(C4346l.f8873l, 1.0f);
            int i5 = 14;
            boolean zAdmob = ((i2 & 14) == 4) | c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            if (zAdmob || objM2132native == C1867l.yandex) {
                objM2132native = new C9810l(this, c13884l, i5);
                c6956l.m2147try(objM2132native);
            }
            AbstractC13319l.yandex(AbstractC14566l.amazon(-740568299, new Function2() { // from class: lِؕٗ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i3;
                    C13884l c13884l2 = c13884l;
                    switch (i6) {
                        case 0:
                            C6956l c6956l2 = (C6956l) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                                AbstractC13010l.loadAd(c13884l2.loadAd, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                            } else {
                                c6956l2.m2124else();
                            }
                            break;
                        default:
                            C6956l c6956l3 = (C6956l) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                C10707l c10707l = AbstractC16964l.yandex;
                                AbstractC7741l.purchase(c13884l2.crashlytics, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(C4346l.f8873l, 48.0f), AbstractC7497l.yandex), new C18627l(((C14370l) c6956l3.isPro(c10707l)).yandex.signatures), new C18627l(((C14370l) c6956l3.isPro(c10707l)).yandex.signatures), C4176l.yandex, c6956l3, 36912, 6, 31712);
                            } else {
                                c6956l3.m2124else();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), AbstractC9151l.loadAd(interfaceC17242lAmazon, false, null, (Function0) objM2132native, 15), null, null, AbstractC14566l.amazon(256545305, new Function2() { // from class: lِؕٗ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i6 = i4;
                    C13884l c13884l2 = c13884l;
                    switch (i6) {
                        case 0:
                            C6956l c6956l2 = (C6956l) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (c6956l2.m2127for(iIntValue & 1, (iIntValue & 3) != 2)) {
                                AbstractC13010l.loadAd(c13884l2.loadAd, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c6956l2, 0, 0, 262142);
                            } else {
                                c6956l2.m2124else();
                            }
                            break;
                        default:
                            C6956l c6956l3 = (C6956l) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (c6956l3.m2127for(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                C10707l c10707l = AbstractC16964l.yandex;
                                AbstractC7741l.purchase(c13884l2.crashlytics, null, AbstractC0019l.crashlytics(AbstractC0080l.isPro(C4346l.f8873l, 48.0f), AbstractC7497l.yandex), new C18627l(((C14370l) c6956l3.isPro(c10707l)).yandex.signatures), new C18627l(((C14370l) c6956l3.isPro(c10707l)).yandex.signatures), C4176l.yandex, c6956l3, 36912, 6, 31712);
                            } else {
                                c6956l3.m2124else();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, c6956l), null, null, c6956l, 24582, 492);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3158l(this, c13884l, i, i4);
        }
    }

    @Override // defpackage.AbstractC11383l
    /* JADX INFO: renamed from: public, reason: not valid java name */
    public final void mo2668public(Function0 function0, C6956l c6956l, int i) {
        c6956l.m2133new(315421264);
        int i2 = i | (c6956l.admob(function0) ? 4 : 2) | (c6956l.admob(this) ? 32 : 16);
        final int i3 = 0;
        final int i4 = 1;
        if (c6956l.m2127for(i2 & 1, (i2 & 19) != 18)) {
            InterfaceC10835l interfaceC10835lAmazon = AbstractC9383l.amazon(C18450l.f36026l, false);
            long j = c6956l.f14595continue;
            int i5 = (int) ((j >>> 32) ^ j);
            InterfaceC18556l interfaceC18556lSmaato = c6956l.smaato();
            InterfaceC17242l interfaceC17242lBilling = AbstractC17541l.billing(c6956l, C4346l.f8873l);
            InterfaceC8801l.firebase.getClass();
            C16395l c16395l = C3438l.loadAd;
            c6956l.m2140super();
            if (c6956l.f14603switch) {
                c6956l.firebase(c16395l);
            } else {
                c6956l.m2136protected();
            }
            AbstractC8182l.billing(c6956l, interfaceC10835lAmazon, C3438l.mopub);
            AbstractC8182l.billing(c6956l, interfaceC18556lSmaato, C3438l.billing);
            AbstractC8182l.billing(c6956l, Integer.valueOf(i5), C3438l.isPro);
            AbstractC8182l.purchase(c6956l, C3438l.firebase);
            AbstractC8182l.billing(c6956l, interfaceC17242lBilling, C3438l.amazon);
            boolean zAdmob = c6956l.admob(this);
            Object objM2132native = c6956l.m2132native();
            C13863l c13863l = C1867l.yandex;
            if (zAdmob || objM2132native == c13863l) {
                objM2132native = new Function0(this) { // from class: lؘؗۨ

                    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                    public final /* synthetic */ C9502l f11434l;

                    {
                        this.f11434l = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i6 = i3;
                        C9502l c9502l = this.f11434l;
                        switch (i6) {
                            case 0:
                                c9502l.f19382l.setValue(Boolean.TRUE);
                                break;
                            default:
                                c9502l.f19382l.setValue(Boolean.FALSE);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                c6956l.m2147try(objM2132native);
            }
            AbstractC7470l.billing((Function0) objM2132native, null, false, null, null, null, AbstractC2296l.yandex, c6956l, 1572864, 62);
            boolean zBooleanValue = ((Boolean) this.f19382l.getValue()).booleanValue();
            boolean zAdmob2 = c6956l.admob(this);
            Object objM2132native2 = c6956l.m2132native();
            if (zAdmob2 || objM2132native2 == c13863l) {
                objM2132native2 = new Function0(this) { // from class: lؘؗۨ

                    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
                    public final /* synthetic */ C9502l f11434l;

                    {
                        this.f11434l = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i6 = i4;
                        C9502l c9502l = this.f11434l;
                        switch (i6) {
                            case 0:
                                c9502l.f19382l.setValue(Boolean.TRUE);
                                break;
                            default:
                                c9502l.f19382l.setValue(Boolean.FALSE);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                c6956l.m2147try(objM2132native2);
            }
            AbstractC16727l.yandex(zBooleanValue, (Function0) objM2132native2, null, 0L, null, null, null, 0L, 0.0f, AbstractC14566l.amazon(441805125, new C0541l(this, function0, 9), c6956l), c6956l, 0, 2044);
            c6956l.startapp(true);
        } else {
            c6956l.m2124else();
        }
        C4224l c4224lAds = c6956l.ads();
        if (c4224lAds != null) {
            c4224lAds.amazon = new C3158l(this, function0, i, 2);
        }
    }

    @Override // defpackage.AbstractC11383l
    /* JADX INFO: renamed from: this, reason: not valid java name */
    public final /* bridge */ /* synthetic */ void mo2669this(InterfaceC12360l interfaceC12360l, C6956l c6956l) {
        m2667protected((C13884l) interfaceC12360l, c6956l, 0);
    }

    @Override // defpackage.AbstractC11383l
    /* JADX INFO: renamed from: transient, reason: not valid java name */
    public final Object mo2670transient(String str) {
        if (C14965l.f29439l == null) {
            VKXApplication vKXApplication = VKXApplication.f36631l;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            C14965l.f29439l = new C14965l(vKXApplication.getApplicationContext().getContentResolver());
        }
        C14965l c14965l = C14965l.f29439l;
        return AbstractC10000l.ad(c14965l != null ? c14965l : null, new C0554l(new C8392l(AbstractC11173l.amazon(4) ? MediaStore.Audio.Artists.getContentUri("external") : MediaStore.Audio.Artists.EXTERNAL_CONTENT_URI, new String[]{"_id", "artist"}, new C9673l(12), 1), new C11318l("artist", ((Boolean) this.f19381l.getValue()).booleanValue()), new AbstractC1401l[]{new C2645l("artist != ''"), str.length() == 0 ? new C2616l() : new C2645l(AbstractC15560l.Signature("artist LIKE '%", str, "%'"))}));
    }
}
