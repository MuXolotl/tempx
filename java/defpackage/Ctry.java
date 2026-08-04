package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.car.app.navigation.model.Maneuver;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.vkapi2.objects.music.AudioSnippetEntry;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.cache.realm.CachedPlaylist;

/* JADX INFO: renamed from: try, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Ctry implements Function0 {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f36600l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f36601l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f36602l;

    public /* synthetic */ Ctry(Object obj, Object obj2, int i) {
        this.f36602l = i;
        this.f36601l = obj;
        this.f36600l = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:165:0x03de  */
    /* JADX WARN: Code duplicated, block: B:96:0x0223  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Catalog2Button catalog2Button;
        int i = 5;
        C16076l c16076l = 0;
        Object obj = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        switch (this.f36602l) {
            case 0:
                C7659l c7659l = (C7659l) this.f36601l;
                C15308l c15308l = (C15308l) this.f36600l;
                c15308l.subs(c15308l.admob() + 1);
                if (c15308l.admob() == 5) {
                    c15308l.subs(0);
                    if (((Boolean) ((C7549l) AbstractC16584l.yandex().billing.admob).f15551l.getValue()).booleanValue()) {
                        c7659l.m4125private(new C5310l(0));
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C0483l c0483l = (C0483l) this.f36601l;
                float fAdmob = ((C13765l) this.f36600l).admob();
                C9879l c9879l = c0483l.yandex;
                C16076l c16076l2 = VKXApplication.f36632l;
                c16076l = c16076l2 != null ? c16076l2 : 0;
                c16076l.getClass();
                C0217l c0217lSubs = c9879l.subs();
                int i2 = (int) fAdmob;
                int i3 = c9879l.subs().loadAd;
                if (i3 < 1) {
                    i3 = 1;
                }
                c9879l.subs.setValue(C0217l.yandex(c0217lSubs, i2, fAdmob / i3));
                c0483l.amazon.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 2:
                List list = C2580l.f5619l;
                InterfaceC2752l interfaceC2752l = (InterfaceC2752l) this.f36601l;
                String str = ((C14288l) ((C1774l) this.f36600l).f4197l.getValue()).loadAd;
                C3625l c3625l = new C3625l(str);
                ClipboardManager clipboardManagerYandex = ((C3633l) interfaceC2752l).yandex();
                String str2 = "plain text";
                ArrayList arrayList = c3625l.f7562l;
                CharSequence charSequence = str;
                if (!(arrayList == null ? list : arrayList).isEmpty()) {
                    SpannableString spannableString = new SpannableString(str);
                    C5501l c5501l = new C5501l(9, z ? 1 : 0);
                    c5501l.f11764l = Parcel.obtain();
                    if (arrayList != null) {
                        list = arrayList;
                    }
                    int size = list.size();
                    int i4 = 0;
                    while (i4 < size) {
                        C15012l c15012l = (C15012l) list.get(i4);
                        C14264l c14264l = (C14264l) c15012l.yandex;
                        int i5 = c15012l.loadAd;
                        int i6 = c15012l.crashlytics;
                        ((Parcel) c5501l.f11764l).recycle();
                        c5501l.f11764l = Parcel.obtain();
                        InterfaceC12750l interfaceC12750l = c14264l.yandex;
                        int i7 = size;
                        long j = c14264l.smaato;
                        int i8 = i4;
                        long j2 = c14264l.admob;
                        long j3 = c14264l.loadAd;
                        long jLoadAd = interfaceC12750l.loadAd();
                        String str3 = str2;
                        long j4 = C9735l.firebase;
                        if (!C9735l.crashlytics(jLoadAd, j4)) {
                            c5501l.m1824return((byte) 1);
                            ((Parcel) c5501l.f11764l).writeLong(AbstractC9168l.smaato(c14264l.yandex.loadAd()));
                        }
                        long j5 = C1794l.crashlytics;
                        byte b = 2;
                        if (!C1794l.yandex(j3, j5)) {
                            c5501l.m1824return((byte) 2);
                            c5501l.m1815l(j3);
                        }
                        C6886l c6886l = c14264l.crashlytics;
                        if (c6886l != null) {
                            c5501l.m1824return((byte) 3);
                            ((Parcel) c5501l.f11764l).writeInt(c6886l.f14426l);
                        }
                        C11617l c11617l = c14264l.amazon;
                        if (c11617l != null) {
                            int i9 = c11617l.yandex;
                            c5501l.m1824return((byte) 4);
                            c5501l.m1824return((i9 != 0 && i9 == 1) ? (byte) 1 : (byte) 0);
                        }
                        C8689l c8689l = c14264l.purchase;
                        if (c8689l != null) {
                            int i10 = c8689l.yandex;
                            c5501l.m1824return((byte) 5);
                            if (i10 == 0) {
                                b = 0;
                            } else if (i10 == 65535) {
                                b = 1;
                            } else if (i10 != 1) {
                                if (i10 == 2) {
                                    b = 3;
                                } else {
                                    b = 0;
                                }
                            }
                            c5501l.m1824return(b);
                        }
                        String str4 = c14264l.mopub;
                        if (str4 != null) {
                            c5501l.m1824return((byte) 6);
                            ((Parcel) c5501l.f11764l).writeString(str4);
                        }
                        if (!C1794l.yandex(j2, j5)) {
                            c5501l.m1824return((byte) 7);
                            c5501l.m1815l(j2);
                        }
                        C10524l c10524l = c14264l.subs;
                        if (c10524l != null) {
                            float f = c10524l.yandex;
                            c5501l.m1824return((byte) 8);
                            c5501l.m1822l(f);
                        }
                        C16810l c16810l = c14264l.isPro;
                        if (c16810l != null) {
                            c5501l.m1824return((byte) 9);
                            c5501l.m1822l(c16810l.yandex);
                            c5501l.m1822l(c16810l.loadAd);
                        }
                        if (!C9735l.crashlytics(j, j4)) {
                            c5501l.m1824return((byte) 10);
                            ((Parcel) c5501l.f11764l).writeLong(AbstractC9168l.smaato(j));
                        }
                        C9867l c9867l = c14264l.remoteconfig;
                        if (c9867l != null) {
                            c5501l.m1824return((byte) 11);
                            ((Parcel) c5501l.f11764l).writeInt(c9867l.yandex);
                        }
                        C0387l c0387l = c14264l.vip;
                        if (c0387l != null) {
                            c5501l.m1824return((byte) 12);
                            ((Parcel) c5501l.f11764l).writeLong(AbstractC9168l.smaato(c0387l.yandex));
                            long j6 = c0387l.loadAd;
                            c5501l.m1822l(Float.intBitsToFloat((int) (j6 >> 32)));
                            c5501l.m1822l(Float.intBitsToFloat((int) (j6 & 4294967295L)));
                            c5501l.m1822l(c0387l.crashlytics);
                        }
                        spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(((Parcel) c5501l.f11764l).marshall(), 0)), i5, i6, 33);
                        i4 = i8 + 1;
                        size = i7;
                        str2 = str3;
                        list = list;
                    }
                    charSequence = spannableString;
                }
                clipboardManagerYandex.setPrimaryClip(ClipData.newPlainText(str2, charSequence));
                return Unit.INSTANCE;
            case 3:
                ((C8250l) this.f36601l).invoke((C12151l) this.f36600l);
                return Unit.INSTANCE;
            case 4:
                Context context = (Context) this.f36601l;
                C10734l c10734l = (C10734l) this.f36600l;
                if (context instanceof AppActivity) {
                    C6666l.yandex((AppActivity) context, c10734l);
                } else {
                    Toast.makeText(context, c10734l.loadAd, 1).show();
                }
                return Unit.INSTANCE;
            case 5:
                ((C10700l) this.f36601l).f21708l = ((Function0) this.f36600l).invoke();
                return Unit.INSTANCE;
            case 6:
                ((InterfaceC14592l) this.f36601l).amazon(this.f36600l);
                return Unit.INSTANCE;
            case 7:
                return C5483l.loadAd((C5483l) this.f36601l, (C9122l) this.f36600l);
            case 8:
                C18159l c18159l = (C18159l) this.f36601l;
                if (((Boolean) ((InterfaceC12244l) this.f36600l).getValue()).booleanValue()) {
                    c18159l.m4125private(new C0072l(0));
                } else {
                    new C14107l().Signature(c18159l.isVip());
                }
                return Unit.INSTANCE;
            case 9:
                AbstractC10999l.mopub((InterfaceC2262l) this.f36601l, null, 0, new C16802l((InterfaceC8714l) this.f36600l, c16076l, z2 ? 1 : 0), 3);
                return Unit.INSTANCE;
            case 10:
                CatalogArtist catalogArtist = (CatalogArtist) this.f36601l;
                Function0 function0 = (Function0) this.f36600l;
                boolean z5 = catalogArtist.admob;
                String str5 = catalogArtist.loadAd;
                if (z5) {
                    ((InterfaceC1982l) function0.invoke()).crashlytics(str5);
                } else {
                    ((InterfaceC1982l) function0.invoke()).admob(str5);
                }
                return Unit.INSTANCE;
            case 11:
                C13157l c13157l = (C13157l) this.f36601l;
                InterfaceC8714l interfaceC8714l = (InterfaceC8714l) this.f36600l;
                c13157l.f25768l.setValue(Boolean.FALSE);
                C18454l c18454l = C18454l.f36052l;
                interfaceC8714l.setValue(C18454l.purchase());
                return Unit.INSTANCE;
            case 12:
                C4599l c4599l = (C4599l) this.f36601l;
                Context context2 = ((C1101l) this.f36600l).f3038l.getContext();
                InterfaceC1982l interfaceC1982l = c4599l.f9338l;
                List crashlytics = c4599l.f9339l.getCrashlytics();
                if (crashlytics == null) {
                    crashlytics = C2580l.f5619l;
                }
                for (Object obj2 : crashlytics) {
                    if (((Catalog2Button) obj2).yandex instanceof C9588l) {
                        obj = obj2;
                        catalog2Button = (Catalog2Button) obj;
                        if (catalog2Button != null) {
                            AbstractC10774l.ads(context2, interfaceC1982l, catalog2Button);
                        }
                        return Unit.INSTANCE;
                    }
                }
                catalog2Button = (Catalog2Button) obj;
                if (catalog2Button != null) {
                    AbstractC10774l.ads(context2, interfaceC1982l, catalog2Button);
                }
                return Unit.INSTANCE;
            case 13:
                AudioSnippetEntry audioSnippetEntry = (AudioSnippetEntry) this.f36601l;
                C7721l c7721l = (C7721l) this.f36600l;
                C8183l.yandex.loadAd(audioSnippetEntry.amazon);
                c7721l.m2205finally();
                return Unit.INSTANCE;
            case 14:
                AbstractC10999l.mopub((InterfaceC2262l) this.f36601l, null, 0, new C5003l((Context) this.f36600l, c16076l, z3 ? 1 : 0), 3);
                return Unit.INSTANCE;
            case 15:
                ((C10968l) this.f36601l).f22101l = (Function0) this.f36600l;
                return Unit.INSTANCE;
            case 16:
                C7600l c7600l = (C7600l) this.f36601l;
                C6742l c6742l = (C6742l) this.f36600l;
                c7600l.f15646l = c7600l.f15645l.yandex(c6742l.f14144l.f26629l.m4551private(), c6742l.getLayoutDirection(), c6742l);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                AbstractC12432l abstractC12432l = (AbstractC12432l) this.f36601l;
                C8279l c8279l = (C8279l) this.f36600l;
                AbstractC13851l abstractC13851l = abstractC12432l.yandex;
                synchronized (abstractC13851l.crashlytics) {
                    if (abstractC13851l.amazon.remove(c8279l) && abstractC13851l.amazon.isEmpty()) {
                        abstractC13851l.amazon();
                    }
                    break;
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return Boolean.valueOf(((Boolean) ((InterfaceC12244l) this.f36600l).getValue()).booleanValue() && ((C12771l) ((InterfaceC2229l) this.f36601l)).loadAd());
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C0639l c0639l = (C0639l) this.f36601l;
                InterfaceC8714l interfaceC8714l2 = (InterfaceC8714l) this.f36600l;
                if (!C12814l.crashlytics(c0639l.loadAd, ((C0639l) interfaceC8714l2.getValue()).loadAd) || !AbstractC8576l.yandex(c0639l.crashlytics, ((C0639l) interfaceC8714l2.getValue()).crashlytics)) {
                    interfaceC8714l2.setValue(c0639l);
                }
                return Unit.INSTANCE;
            case 20:
                C4487l c4487l = (C4487l) this.f36601l;
                C3625l c3625l2 = (C3625l) this.f36600l;
                if (c4487l == null) {
                    return c3625l2;
                }
                C11362l c11362l = c4487l.crashlytics;
                boolean zIsEmpty = c11362l.isEmpty();
                C3625l c3625l3 = c4487l.loadAd;
                if (!zIsEmpty) {
                    C0293l c0293l = new C0293l(c3625l3);
                    int size2 = c11362l.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((Function1) c11362l.get(i11)).invoke(c0293l);
                    }
                    c3625l3 = c0293l.loadAd;
                }
                c4487l.loadAd = c3625l3;
                return c3625l3 == null ? c3625l2 : c3625l3;
            case 21:
                AbstractC10999l.mopub((InterfaceC2262l) this.f36601l, null, 0, new C6100l((C15178l) this.f36600l, c16076l, z4 ? 1 : 0), 3);
                return Boolean.TRUE;
            case 22:
                try {
                    ((FrameLayout) ((C2814l) this.f36601l).yandex.f36640l.f15740l).removeView((View) this.f36600l);
                    Unit unit = Unit.INSTANCE;
                    break;
                } catch (Throwable unused) {
                }
                return Unit.INSTANCE;
            case 23:
                C8954l c8954l = (C8954l) this.f36601l;
                InterfaceC2262l interfaceC2262l = (InterfaceC2262l) this.f36600l;
                if (((Boolean) c8954l.amazon.invoke(EnumC9129l.f18763l)).booleanValue()) {
                    AbstractC10999l.mopub(interfaceC2262l, null, 0, new C12328l(c8954l, c16076l, i), 3);
                }
                return Boolean.TRUE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return AbstractC14289l.vip((InterfaceC16588l) this.f36600l, (C7695l) this.f36601l);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C9430l c9430l = (C9430l) this.f36601l;
                CachedPlaylist cachedPlaylist = (CachedPlaylist) this.f36600l;
                c9430l.m4125private(new C18306l(cachedPlaylist.crashlytics(), new VKProfile(cachedPlaylist.pro(), null, null, null, cachedPlaylist.isVip(), null, null, 110)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((CameraManager) this.f36601l).unregisterAvailabilityCallback((C18290l) this.f36600l);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((C11751l) this.f36601l).f23532l.unregisterAvailabilityCallback((C10698l) this.f36600l);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((CameraManager) this.f36601l).unregisterAvailabilityCallback((C10698l) this.f36600l);
                return Unit.INSTANCE;
            default:
                C13432l c13432l = (C13432l) this.f36601l;
                UUID uuid = (UUID) this.f36600l;
                WorkDatabase workDatabase = c13432l.crashlytics;
                workDatabase.loadAd();
                try {
                    AbstractC1497l.crashlytics(c13432l, uuid.toString());
                    workDatabase.vip();
                    workDatabase.firebase();
                    AbstractC3387l.loadAd(c13432l.loadAd, c13432l.crashlytics, c13432l.purchase);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    workDatabase.firebase();
                    throw th;
                }
        }
    }
}
