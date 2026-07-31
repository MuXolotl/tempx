package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Region;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.Size;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* JADX INFO: renamed from: lُُۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10975l implements InterfaceC5457l, InterfaceC9746l, InterfaceC15600l, InterfaceC8145l, InterfaceC10466l, InterfaceC16228l, InterfaceC17020l, InterfaceC5688l, InterfaceC3538l, InterfaceC6848l, InterfaceC15853l, InterfaceC16651l, InterfaceC15838l, InterfaceC6684l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static volatile C10975l f22119l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final C15133l f22120l = new C15133l(1);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f22121l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22122l;

    public C10975l(int i) {
        InterfaceC4282l interfaceC4282l;
        this.f22122l = i;
        int i2 = 5;
        boolean z = false;
        byte b = 0;
        switch (i) {
            case 1:
                C17073l c17073l = C17073l.crashlytics;
                try {
                    interfaceC4282l = (InterfaceC4282l) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    interfaceC4282l = f22120l;
                }
                InterfaceC4282l[] interfaceC4282lArr = {C15133l.loadAd, interfaceC4282l};
                C17757l c17757l = new C17757l();
                c17757l.yandex = interfaceC4282lArr;
                Charset charset = AbstractC6061l.yandex;
                this.f22121l = c17757l;
                break;
            case 12:
                this.f22121l = new C14558l(i2, 1.0f, z, b == true ? 1 : 0);
                break;
            case 14:
                this.f22121l = new LinkedHashSet();
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                this.f22121l = new Bundle();
                break;
            case 22:
                this.f22121l = new C8336l();
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                this.f22121l = new Region();
                break;
            default:
                this.f22121l = new String[]{"Other", "32x32 pixels 'file icon' (PNG only)", "Other file icon", "Cover (front)", "Cover (back)", "Leaflet page", "Media (e.g. label side of CD)", "Lead artist/lead performer/soloist", "Artist/performer", "Conductor", "Band/Orchestra", "Composer", "Lyricist/text writer", "Recording Location", "During recording", "During performance", "Movie/video screen capture", "A bright coloured fish", "Illustration", "Band/artist logotype", "Publisher/Studio logotype"};
                break;
        }
    }

    public static void applovin(Intent intent) {
        if (intent == null || !AbstractC8576l.yandex(intent.getAction(), "android.intent.action.VIEW") || intent.getData() == null) {
            return;
        }
        C8183l c8183l = C8183l.yandex;
        if (AbstractC8576l.yandex(intent.getAction(), "android.intent.action.VIEW") && !AbstractC16648l.isVip(String.valueOf(intent.getData()), "vkx://", false)) {
            C8183l.crashlytics(c8183l, intent.getData(), intent.getBooleanExtra("vkx_autoplay", false), 4);
        }
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public static C10975l m3010package(boolean z, int i, int i2, int i3, int i4) {
        return new C10975l(2, AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }

    public static C10975l premium() {
        if (f22119l == null) {
            synchronized (C10975l.class) {
                try {
                    if (f22119l == null) {
                        f22119l = new C10975l(0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f22119l;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9241. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: strictfp, reason: not valid java name */
    public static java.util.ArrayList m3011strictfp(defpackage.C10975l r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10975l.m3011strictfp(lُُۛ, java.lang.String):java.util.ArrayList");
    }

    @Override // defpackage.InterfaceC16651l
    public InterfaceC0048l Signature() {
        return new C5307l(C7420l.yandex((C5104l) this.f22121l));
    }

    @Override // defpackage.InterfaceC15600l
    public Object ad(AbstractC3740l abstractC3740l, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        C10822l c10822l = (C10822l) this.f22121l;
        c10822l.getClass();
        C2312l c2312l = abstractC3740l.f7826l;
        sb.append(c10822l.m3006synchronized("package-fragment"));
        String strMetrica = c10822l.metrica(AbstractC3324l.admob(C16781l.billing(c2312l.yandex)));
        if (strMetrica.length() > 0) {
            sb.append(" ");
            sb.append(strMetrica);
        }
        if (c10822l.yandex.vip()) {
            sb.append(" in ");
            c10822l.m3007throw(abstractC3740l.m1422l(), sb, false);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC5479l
    public C5104l adcel() {
        return (C5104l) this.f22121l;
    }

    @Override // defpackage.InterfaceC6848l
    public C9902l admob(C9902l c9902l, float f, C4565l c4565l) {
        ((C8336l) this.f22121l).admob(c9902l, f, c4565l);
        return c9902l;
    }

    @Override // defpackage.InterfaceC6684l
    public C10227l ads() {
        C10227l c10227lAdmob = AbstractC14055l.admob();
        AudioTrack audioTrack = (AudioTrack) this.f22121l;
        c10227lAdmob.add(new C12885l(audioTrack.amazon, 3, AbstractC16676l.mopub(audioTrack)));
        AudioAlbum audioAlbum = audioTrack.vip;
        if (audioAlbum != null) {
            String str = audioAlbum.amazon;
            StringBuilder sb = new StringBuilder();
            sb.append(audioAlbum.loadAd);
            sb.append('_');
            sb.append(audioAlbum.yandex);
            c10227lAdmob.add(new C12885l(str, 1, sb.toString()));
        }
        for (MainArtist mainArtist : AbstractC16676l.loadAd(audioTrack)) {
            String str2 = mainArtist.crashlytics;
            String str3 = mainArtist.yandex;
            if (str3 != null) {
                c10227lAdmob.add(new C12885l(str2, 4, str3));
            }
        }
        return AbstractC14055l.purchase(c10227lAdmob);
    }

    @Override // defpackage.InterfaceC15600l
    public Object advert(C5786l c5786l, Object obj) {
        C5786l c5786lMo751final;
        boolean z = c5786l.f12195l;
        StringBuilder sb = (StringBuilder) obj;
        C10822l c10822l = (C10822l) this.f22121l;
        c10822l.getClass();
        c10822l.ad(sb, c5786l, null);
        C9911l c9911l = c10822l.yandex;
        C17838l c17838l = c9911l.metrica;
        InterfaceC13922l[] interfaceC13922lArr = C9911l.f20154final;
        InterfaceC13922l interfaceC13922l = interfaceC13922lArr[13];
        boolean z2 = (((Boolean) c17838l.yandex).booleanValue() || c5786l.m1857l().startapp() != 2) && c10822l.m2995instanceof(c5786l.admob(), sb);
        c10822l.m3003strictfp(c5786l, sb);
        C17838l c17838l2 = c9911l.f20156catch;
        InterfaceC13922l interfaceC13922l2 = interfaceC13922lArr[40];
        boolean z3 = ((Boolean) c17838l2.yandex).booleanValue() || !z || z2;
        if (z3) {
            sb.append(c10822l.m3006synchronized("constructor"));
        }
        InterfaceC17477l interfaceC17477lM1861l = c5786l.Signature();
        C17838l c17838l3 = c9911l.signatures;
        InterfaceC13922l interfaceC13922l3 = interfaceC13922lArr[25];
        if (((Boolean) c17838l3.yandex).booleanValue()) {
            if (z3) {
                sb.append(" ");
            }
            c10822l.m3007throw(interfaceC17477lM1861l, sb, true);
            c10822l.m2993goto(sb, c5786l.getTypeParameters(), false);
        }
        c10822l.m2984abstract(sb, c5786l.mo1007finally(), c5786l.mo1473for());
        C17838l c17838l4 = c9911l.adcel;
        InterfaceC13922l interfaceC13922l4 = interfaceC13922lArr[15];
        if (((Boolean) c17838l4.yandex).booleanValue() && !z && (c5786lMo751final = interfaceC17477lM1861l.mo751final()) != null) {
            List listMo1007finally = c5786lMo751final.mo1007finally();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listMo1007finally) {
                C17538l c17538l = (C17538l) obj2;
                if (!c17538l.m4403l() && c17538l.f34151l == null) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                sb.append(" : ");
                sb.append(c10822l.m3006synchronized("this"));
                sb.append(AbstractC16901l.m4210case(arrayList, ", ", "(", ")", C2100l.f4705l, 24));
            }
        }
        C17838l c17838l5 = c9911l.signatures;
        InterfaceC13922l interfaceC13922l5 = C9911l.f20154final[25];
        if (((Boolean) c17838l5.yandex).booleanValue()) {
            c10822l.m3001public(sb, c5786l.getTypeParameters());
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC15600l
    public Object amazon(AbstractC15719l abstractC15719l, Object obj) {
        ((C10822l) this.f22121l).m2991final(abstractC15719l, (StringBuilder) obj, true);
        return Unit.INSTANCE;
    }

    public void appmetrica() {
        int i = 0;
        while (true) {
            C10111l[] c10111lArr = (C10111l[]) this.f22121l;
            if (i >= c10111lArr.length) {
                return;
            }
            c10111lArr[i].Signature();
            i++;
        }
    }

    @Override // defpackage.InterfaceC15600l
    public Object billing(C7073l c7073l, Object obj) {
        ((StringBuilder) obj).append(c7073l.getName());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: case, reason: not valid java name */
    public void m3012case() {
        int i = 0;
        while (true) {
            C10111l[] c10111lArr = (C10111l[]) this.f22121l;
            if (i >= c10111lArr.length) {
                return;
            }
            c10111lArr[i].inmobi();
            i++;
        }
    }

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public void m3013catch(String str, String str2) {
        Integer num = (Integer) C8937l.f18407l.get(str);
        if (num == null || num.intValue() == 1) {
            ((Bundle) this.f22121l).putCharSequence(str, str2);
        } else {
            C8339l.metrica(AbstractC15560l.Signature("The ", str, " key cannot be used to put a String"));
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00db  */
    /* JADX WARN: Code duplicated, block: B:59:0x0199  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a3  */
    /* JADX INFO: renamed from: class, reason: not valid java name */
    public void m3014class(InterfaceC4884l interfaceC4884l, StringBuilder sb) {
        String strM2996interface;
        boolean z;
        boolean z2;
        C10822l c10822l = (C10822l) this.f22121l;
        C9911l c9911l = c10822l.yandex;
        C9911l c9911l2 = c10822l.yandex;
        if (!c10822l.adcel()) {
            C17838l c17838l = c9911l2.mopub;
            InterfaceC13922l[] interfaceC13922lArr = C9911l.f20154final;
            InterfaceC13922l interfaceC13922l = interfaceC13922lArr[5];
            if (!((Boolean) c17838l.yandex).booleanValue()) {
                c10822l.premium(sb, interfaceC4884l.mo1478l());
                c10822l.ad(sb, interfaceC4884l, null);
                c10822l.m2995instanceof(interfaceC4884l.admob(), sb);
                c10822l.m3000private(interfaceC4884l, sb);
                C17838l c17838l2 = c9911l2.f20158continue;
                InterfaceC13922l interfaceC13922l2 = interfaceC13922lArr[44];
                if (((Boolean) c17838l2.yandex).booleanValue()) {
                    c10822l.m3009volatile(interfaceC4884l, sb);
                }
                c10822l.m2985case(interfaceC4884l, sb);
                C17838l c17838l3 = c9911l2.f20158continue;
                InterfaceC13922l interfaceC13922l3 = interfaceC13922lArr[44];
                if (((Boolean) c17838l3.yandex).booleanValue()) {
                    if (interfaceC4884l.tapsense()) {
                        Collection collectionLicense = interfaceC4884l.license();
                        if (!collectionLicense.isEmpty()) {
                            Iterator it = collectionLicense.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((InterfaceC4884l) it.next()).tapsense()) {
                                        C17838l c17838l4 = c9911l2.f20171throw;
                                        InterfaceC13922l interfaceC13922l4 = C9911l.f20154final[39];
                                        if (!((Boolean) c17838l4.yandex).booleanValue()) {
                                            z = false;
                                        }
                                    }
                                }
                            }
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                    if (interfaceC4884l.signatures()) {
                        Collection collectionLicense2 = interfaceC4884l.license();
                        if (!collectionLicense2.isEmpty()) {
                            Iterator it2 = collectionLicense2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (((InterfaceC4884l) it2.next()).signatures()) {
                                        C17838l c17838l5 = c9911l2.f20171throw;
                                        InterfaceC13922l interfaceC13922l5 = C9911l.f20154final[39];
                                        if (!((Boolean) c17838l5.yandex).booleanValue()) {
                                            z2 = false;
                                        }
                                    }
                                }
                            }
                        }
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c10822l.m2990extends(sb, interfaceC4884l.mo679interface(), "tailrec");
                    c10822l.m2990extends(sb, interfaceC4884l.firebase(), "suspend");
                    c10822l.m2990extends(sb, interfaceC4884l.purchase(), "inline");
                    c10822l.m2990extends(sb, z2, "infix");
                    c10822l.m2990extends(sb, z, "operator");
                } else {
                    c10822l.m2990extends(sb, interfaceC4884l.firebase(), "suspend");
                }
                c10822l.m3003strictfp(interfaceC4884l, sb);
                if (c10822l.tapsense()) {
                    if (interfaceC4884l.mo1474l()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (interfaceC4884l.mo1475l()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(c10822l.m3006synchronized("fun"));
            sb.append(" ");
            c10822l.m2993goto(sb, interfaceC4884l.getTypeParameters(), true);
            C7073l c7073lMo1479return = interfaceC4884l.mo1479return();
            if (c7073lMo1479return != null) {
                c10822l.ad(sb, c7073lMo1479return, EnumC7936l.RECEIVER);
                sb.append(c10822l.m3008throws(c7073lMo1479return.yandex(), false));
                sb.append(".");
            }
        }
        c10822l.m3007throw(interfaceC4884l, sb, true);
        c10822l.m2984abstract(sb, interfaceC4884l.mo1007finally(), interfaceC4884l.mo1473for());
        c10822l.m2987continue(interfaceC4884l, sb);
        AbstractC18041l abstractC18041lSmaato = interfaceC4884l.smaato();
        C17838l c17838l6 = c9911l.smaato;
        InterfaceC13922l[] interfaceC13922lArr2 = C9911l.f20154final;
        InterfaceC13922l interfaceC13922l6 = interfaceC13922lArr2[10];
        if (!((Boolean) c17838l6.yandex).booleanValue()) {
            C17838l c17838l7 = c9911l.firebase;
            InterfaceC13922l interfaceC13922l7 = interfaceC13922lArr2[9];
            if (((Boolean) c17838l7.yandex).booleanValue() || abstractC18041lSmaato == null) {
                sb.append(": ");
                if (abstractC18041lSmaato == null) {
                    strM2996interface = "[NULL]";
                } else {
                    strM2996interface = c10822l.m2996interface(abstractC18041lSmaato);
                }
                sb.append(strM2996interface);
            } else {
                C3498l c3498l = AbstractC16860l.purchase;
                if (!AbstractC16860l.appmetrica(abstractC18041lSmaato, AbstractC3333l.amazon)) {
                    sb.append(": ");
                    if (abstractC18041lSmaato == null) {
                        strM2996interface = "[NULL]";
                    } else {
                        strM2996interface = c10822l.m2996interface(abstractC18041lSmaato);
                    }
                    sb.append(strM2996interface);
                }
            }
        }
        c10822l.m3001public(sb, interfaceC4884l.getTypeParameters());
    }

    @Override // defpackage.InterfaceC16228l
    public void close() {
        ((C2325l) this.f22121l).close();
    }

    /* JADX INFO: renamed from: continue, reason: not valid java name */
    public void m3015continue(C10975l c10975l) {
        int i = 0;
        while (true) {
            C10111l[] c10111lArr = (C10111l[]) this.f22121l;
            if (i >= c10111lArr.length) {
                return;
            }
            C10111l c10111l = c10111lArr[i];
            C10111l c10111l2 = ((C10111l[]) c10975l.f22121l)[i];
            for (int i2 = 0; i2 < 256; i2++) {
                int[] iArr = (int[]) c10111l.f20587l;
                iArr[i2] = iArr[i2] - ((int[]) c10111l2.f20587l)[i2];
            }
            c10111l.getClass();
            i++;
        }
    }

    @Override // defpackage.InterfaceC15600l
    public Object crashlytics(C17538l c17538l, Object obj) {
        ((C10822l) this.f22121l).m2994import(c17538l, true, (StringBuilder) obj, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: else, reason: not valid java name */
    public void m3016else(CharSequence charSequence, String str) {
        Integer num = (Integer) C8937l.f18407l.get(str);
        if (num == null || num.intValue() == 1) {
            ((Bundle) this.f22121l).putCharSequence(str, charSequence);
        } else {
            C8339l.metrica(AbstractC15560l.Signature("The ", str, " key cannot be used to put a CharSequence"));
        }
    }

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    public void m3017extends(String str, Bitmap bitmap) {
        Integer num = (Integer) C8937l.f18407l.get(str);
        if (num == null || num.intValue() == 2) {
            ((Bundle) this.f22121l).putParcelable(str, bitmap);
        } else {
            C8339l.metrica(AbstractC15560l.Signature("The ", str, " key cannot be used to put a Bitmap"));
        }
    }

    @Override // defpackage.InterfaceC15600l
    public Object firebase(C10486l c10486l, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        C10822l c10822l = (C10822l) this.f22121l;
        c10822l.getClass();
        C2312l c2312l = c10486l.f21348l;
        sb.append(c10822l.m3006synchronized("package"));
        String strMetrica = c10822l.metrica(AbstractC3324l.admob(C16781l.billing(c2312l.yandex)));
        if (strMetrica.length() > 0) {
            sb.append(" ");
            sb.append(strMetrica);
        }
        if (c10822l.yandex.vip()) {
            sb.append(" in context of ");
            c10822l.m3007throw(c10486l.f21349l, sb, false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: for, reason: not valid java name */
    public void m3018for(long j, String str) {
        Integer num = (Integer) C8937l.f18407l.get(str);
        if (num == null || num.intValue() == 0) {
            ((Bundle) this.f22121l).putLong(str, j);
        } else {
            C8339l.metrica(AbstractC15560l.Signature("The ", str, " key cannot be used to put a long"));
        }
    }

    @Override // defpackage.InterfaceC15897l
    public Object get() {
        return new C10287l((InterfaceC15189l) ((C14461l) this.f22121l).f28328l);
    }

    @Override // defpackage.InterfaceC5457l
    public String getValue(int i) {
        String str;
        return (mo1044goto(i) && (str = ((String[]) this.f22121l)[i]) != null) ? str : "";
    }

    @Override // defpackage.InterfaceC5457l
    /* JADX INFO: renamed from: goto */
    public boolean mo1044goto(int i) {
        return i >= 0 && i <= 20;
    }

    public boolean inmobi(int i) {
        if (i < 0) {
            return false;
        }
        C13698l c13698l = (C13698l) this.f22121l;
        if (i >= c13698l.f26744l) {
            return false;
        }
        C2443l c2443lAdvert = c13698l.advert(i);
        Function1 function1 = ((C8609l) c2443lAdvert.crashlytics).crashlytics;
        return function1 != null && function1.invoke(Integer.valueOf(i - c2443lAdvert.yandex)) == C2782l.f6065l;
    }

    /* JADX INFO: renamed from: interface, reason: not valid java name */
    public void m3019interface(AbstractC4042l abstractC4042l, StringBuilder sb, String str) {
        C10822l c10822l = (C10822l) this.f22121l;
        C17838l c17838l = c10822l.yandex.f20170synchronized;
        InterfaceC13922l interfaceC13922l = C9911l.f20154final[32];
        int iOrdinal = ((EnumC3401l) c17838l.yandex).ordinal();
        if (iOrdinal == 0) {
            c10822l.m3009volatile(abstractC4042l, sb);
            sb.append(str.concat(" for "));
            C10822l.vip(c10822l, abstractC4042l.m1477l(), sb);
        } else if (iOrdinal == 1) {
            m3014class(abstractC4042l, sb);
        } else {
            if (iOrdinal == 2) {
                return;
            }
            C18725l.billing();
        }
    }

    @Override // defpackage.InterfaceC15600l
    public Object isPro(C1710l c1710l, Object obj) {
        m3019interface(c1710l, (StringBuilder) obj, "setter");
        return Unit.INSTANCE;
    }

    public void isVip(C10975l c10975l) {
        int i = 0;
        while (true) {
            C10111l[] c10111lArr = (C10111l[]) this.f22121l;
            if (i >= c10111lArr.length) {
                return;
            }
            C10111l c10111l = c10111lArr[i];
            C10111l c10111l2 = ((C10111l[]) c10975l.f22121l)[i];
            for (int i2 = 0; i2 < 256; i2++) {
                int[] iArr = (int[]) c10111l.f20587l;
                iArr[i2] = iArr[i2] + ((int[]) c10111l2.f20587l)[i2];
            }
            c10111l.getClass();
            i++;
        }
    }

    @Override // defpackage.InterfaceC15600l
    public Object license(AbstractC11832l abstractC11832l, Object obj) throws IOException {
        C5786l c5786lMo751final;
        String str;
        StringBuilder sb = (StringBuilder) obj;
        C10822l c10822l = (C10822l) this.f22121l;
        C9911l c9911l = c10822l.yandex;
        int i = 1;
        boolean z = abstractC11832l.mo752l() == 4;
        if (!c10822l.adcel()) {
            c10822l.premium(sb, abstractC11832l.mo2891l());
            c10822l.ad(sb, abstractC11832l, null);
            if (!z) {
                c10822l.m2995instanceof(abstractC11832l.admob(), sb);
            }
            if ((abstractC11832l.mo752l() != 2 || abstractC11832l.startapp() != 4) && (!AbstractC14814l.loadAd(abstractC11832l.mo752l()) || abstractC11832l.startapp() != 1)) {
                c10822l.m2997native(abstractC11832l.startapp(), C10822l.Signature(abstractC11832l), sb);
            }
            c10822l.m3009volatile(abstractC11832l, sb);
            c10822l.m2990extends(sb, c10822l.startapp().contains(EnumC1382l.INNER) && abstractC11832l.subscription(), "inner");
            c10822l.m2990extends(sb, c10822l.startapp().contains(EnumC1382l.DATA) && abstractC11832l.mo755l(), "data");
            c10822l.m2990extends(sb, c10822l.startapp().contains(EnumC1382l.INLINE) && abstractC11832l.purchase(), "inline");
            c10822l.m2990extends(sb, c10822l.startapp().contains(EnumC1382l.VALUE) && abstractC11832l.ads(), "value");
            c10822l.m2990extends(sb, c10822l.startapp().contains(EnumC1382l.FUN) && abstractC11832l.mo758volatile(), "fun");
            if (abstractC11832l.mo757throws()) {
                str = "companion object";
            } else {
                int iInmobi = AbstractC5020l.inmobi(abstractC11832l.mo752l());
                if (iInmobi == 0) {
                    str = "class";
                } else if (iInmobi == 1) {
                    str = "interface";
                } else if (iInmobi == 2) {
                    str = "enum class";
                } else if (iInmobi == 3) {
                    str = "enum entry";
                } else if (iInmobi == 4) {
                    str = "annotation class";
                } else {
                    if (iInmobi != 5) {
                        C18725l.billing();
                        return null;
                    }
                    str = "object";
                }
            }
            sb.append(c10822l.m3006synchronized(str));
        }
        if (AbstractC11125l.firebase(abstractC11832l)) {
            C17838l c17838l = c9911l.f20165package;
            InterfaceC13922l interfaceC13922l = C9911l.f20154final[31];
            if (((Boolean) c17838l.yandex).booleanValue()) {
                if (c10822l.adcel()) {
                    sb.append("companion object");
                }
                C10822l.m2982class(sb);
                InterfaceC8371l interfaceC8371lSignature = abstractC11832l.Signature();
                if (interfaceC8371lSignature != null) {
                    sb.append("of ");
                    sb.append(c10822l.m2992for(interfaceC8371lSignature.getName(), false));
                }
            }
            if (c10822l.tapsense() || !AbstractC8576l.yandex(abstractC11832l.getName(), AbstractC13589l.loadAd)) {
                if (!c10822l.adcel()) {
                    C10822l.m2982class(sb);
                }
                sb.append(c10822l.m2992for(abstractC11832l.getName(), true));
            }
        } else {
            if (!c10822l.adcel()) {
                C10822l.m2982class(sb);
            }
            c10822l.m3007throw(abstractC11832l, sb, true);
        }
        if (!z) {
            List listIsVip = abstractC11832l.isVip();
            c10822l.m2993goto(sb, listIsVip, false);
            c10822l.isVip(abstractC11832l, sb);
            if (!AbstractC14814l.loadAd(abstractC11832l.mo752l())) {
                C17838l c17838l2 = c9911l.subs;
                InterfaceC13922l interfaceC13922l2 = C9911l.f20154final[7];
                if (((Boolean) c17838l2.yandex).booleanValue() && (c5786lMo751final = abstractC11832l.mo751final()) != null) {
                    sb.append(" ");
                    c10822l.ad(sb, c5786lMo751final, null);
                    C5786l c5786l = c5786lMo751final;
                    c10822l.m2995instanceof(c5786l.admob(), sb);
                    sb.append(c10822l.m3006synchronized("constructor"));
                    c10822l.m2984abstract(sb, c5786l.mo1007finally(), c5786lMo751final.mo1473for());
                }
            }
            C17838l c17838l3 = c9911l.ad;
            InterfaceC13922l interfaceC13922l3 = C9911l.f20154final[22];
            if (!((Boolean) c17838l3.yandex).booleanValue() && !AbstractC16860l.inmobi(abstractC11832l.ad())) {
                Collection collectionYandex = abstractC11832l.metrica().yandex();
                if (!collectionYandex.isEmpty() && (collectionYandex.size() != 1 || !AbstractC16860l.ad((AbstractC18041l) collectionYandex.iterator().next()))) {
                    C10822l.m2982class(sb);
                    sb.append(": ");
                    AbstractC16901l.m4216else(collectionYandex, sb, ", ", null, null, new C14474l(c10822l, i), 60);
                }
            }
            c10822l.m3001public(sb, listIsVip);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC17020l
    public ByteBuffer loadAd() {
        return (ByteBuffer) this.f22121l;
    }

    @Override // defpackage.InterfaceC16228l
    /* JADX INFO: renamed from: lٜؓ۠ */
    public AbstractC1872l mo1176l() {
        return (C2325l) this.f22121l;
    }

    @Override // defpackage.InterfaceC15853l
    public Size metrica(C18680l c18680l, C15421l c15421l) {
        C5680l c5680lLoadAd;
        C4805l c4805lYandex = ((C5012l) this.f22121l).yandex(c15421l);
        if (c4805lYandex == null || (c5680lLoadAd = c4805lYandex.loadAd(c18680l)) == null) {
            return null;
        }
        return c5680lLoadAd.billing.yandex();
    }

    @Override // defpackage.InterfaceC5688l
    public Object mopub(SharedPreferences sharedPreferences, String str, Object obj) {
        return ((Enum[]) this.f22121l)[sharedPreferences.getInt(str, ((Enum) obj).ordinal())];
    }

    /* JADX INFO: renamed from: native, reason: not valid java name */
    public void m3020native() {
        int i = 0;
        while (true) {
            C10111l[] c10111lArr = (C10111l[]) this.f22121l;
            if (i >= c10111lArr.length) {
                return;
            }
            c10111lArr[i].signatures();
            i++;
        }
    }

    /* JADX INFO: renamed from: private, reason: not valid java name */
    public void m3021private(C10975l c10975l) {
        int i = 0;
        while (true) {
            C10111l[] c10111lArr = (C10111l[]) this.f22121l;
            if (i >= c10111lArr.length) {
                return;
            }
            C10111l c10111l = c10111lArr[i];
            C10111l c10111l2 = ((C10111l[]) c10975l.f22121l)[i];
            int[] iArr = (int[]) c10111l.f20587l;
            int[] iArr2 = (int[]) c10111l2.f20587l;
            for (int i2 = 0; i2 < 256; i2++) {
                int i3 = iArr[i2];
                int i4 = i3 + 4095;
                iArr[i2] = i4 >> 13;
                iArr2[i2] = i3 - (i4 & (-8192));
            }
            i++;
        }
    }

    @Override // defpackage.InterfaceC15853l
    public List pro(C15421l c15421l) {
        C4805l c4805lYandex = ((C5012l) this.f22121l).yandex(c15421l);
        return c4805lYandex != null ? new ArrayList(c4805lYandex.yandex.keySet()) : C2580l.f5619l;
    }

    @Override // defpackage.InterfaceC8145l
    public C18595l purchase() {
        C9298l c9298l = new C9298l((SecureRandom) this.f22121l);
        return new C18595l(c9298l.yandex(), c9298l, 7);
    }

    @Override // defpackage.InterfaceC15838l
    public Object remoteconfig(InterfaceC1555l interfaceC1555l, Float f, Float f2, Function1 function1, C13597l c13597l) {
        float fFloatValue = f.floatValue();
        float fFloatValue2 = f2.floatValue();
        Object objCrashlytics = AbstractC12811l.crashlytics(interfaceC1555l, Math.signum(fFloatValue2) * Math.abs(fFloatValue), fFloatValue, AbstractC15042l.yandex(0.0f, fFloatValue2, 28), (InterfaceC1489l) this.f22121l, function1, c13597l);
        return objCrashlytics == EnumC9342l.f19165l ? objCrashlytics : (C16483l) objCrashlytics;
    }

    public void signatures() {
        int i = 0;
        while (true) {
            C10111l[] c10111lArr = (C10111l[]) this.f22121l;
            if (i >= c10111lArr.length) {
                return;
            }
            C10111l c10111l = c10111lArr[i];
            for (int i2 = 0; i2 < 256; i2++) {
                int[] iArr = (int[]) c10111l.f20587l;
                int i3 = iArr[i2];
                iArr[i2] = i3 + ((i3 >> 31) & 8380417);
            }
            c10111l.getClass();
            i++;
        }
    }

    @Override // defpackage.InterfaceC15600l
    public Object smaato(C9522l c9522l, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        C10822l c10822l = (C10822l) this.f22121l;
        c10822l.getClass();
        c10822l.ad(sb, c9522l, null);
        c10822l.m2995instanceof(c9522l.f19408l, sb);
        c10822l.m3009volatile(c9522l, sb);
        sb.append(c10822l.m3006synchronized("typealias"));
        sb.append(" ");
        c10822l.m3007throw(c9522l, sb, true);
        List list = c9522l.f19409l;
        if (list == null) {
            list = null;
        }
        c10822l.m2993goto(sb, list, false);
        c10822l.isVip(c9522l, sb);
        sb.append(" = ");
        AbstractC15211l abstractC15211l = c9522l.f19413l;
        sb.append(c10822l.m2996interface(abstractC15211l != null ? abstractC15211l : null));
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC15600l
    public Object startapp(C10202l c10202l, Object obj) {
        ((C10822l) this.f22121l).m3007throw(c10202l, (StringBuilder) obj, true);
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC5688l
    public void subs(SharedPreferences sharedPreferences, String str, Object obj) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putInt(str, ((Enum) obj).ordinal());
        editorEdit.apply();
    }

    @Override // defpackage.InterfaceC15600l
    public Object subscription(C13437l c13437l, Object obj) {
        C10822l.vip((C10822l) this.f22121l, c13437l, (StringBuilder) obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public void m3022switch(C16918l c16918l) {
        ((Region) this.f22121l).set(c16918l.yandex, c16918l.loadAd, c16918l.crashlytics, c16918l.amazon);
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public void m3023synchronized(C5775l c5775l, byte[] bArr, int i) {
        int i2 = 0;
        while (true) {
            C10111l[] c10111lArr = (C10111l[]) this.f22121l;
            if (i2 >= c10111lArr.length) {
                return;
            }
            C10111l c10111l = c10111lArr[i2];
            int i3 = (c5775l.amazon * i2) + i;
            int i4 = ((C5775l) c10111l.f20586l).smaato;
            if (i4 == 95232) {
                for (int i5 = 0; i5 < 64; i5++) {
                    int i6 = (i5 * 3) + i3;
                    int i7 = i5 * 4;
                    int[] iArr = (int[]) c10111l.f20587l;
                    byte b = (byte) iArr[i7];
                    int i8 = iArr[i7 + 1];
                    bArr[i6] = (byte) (b | (i8 << 6));
                    int i9 = iArr[i7 + 2];
                    bArr[i6 + 1] = (byte) (((byte) (i8 >> 2)) | (i9 << 4));
                    bArr[i6 + 2] = (byte) ((iArr[i7 + 3] << 2) | ((byte) (i9 >> 4)));
                }
            } else if (i4 == 261888) {
                for (int i10 = 0; i10 < 128; i10++) {
                    int i11 = i10 * 2;
                    int[] iArr2 = (int[]) c10111l.f20587l;
                    bArr[i3 + i10] = (byte) ((iArr2[i11 + 1] << 4) | iArr2[i11]);
                }
            }
            i2++;
        }
    }

    @Override // defpackage.InterfaceC15600l
    public /* bridge */ /* synthetic */ Object tapsense(InterfaceC4884l interfaceC4884l, Object obj) {
        m3014class(interfaceC4884l, (StringBuilder) obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public void m3024throw(String str, C10388l c10388l) {
        Integer num = (Integer) C8937l.f18407l.get(str);
        if (num == null || num.intValue() == 3) {
            ((Bundle) this.f22121l).putParcelable(str, (Parcelable) c10388l.loadAd());
        } else {
            C8339l.metrica(AbstractC15560l.Signature("The ", str, " key cannot be used to put a Rating"));
        }
    }

    @Override // defpackage.InterfaceC8145l
    /* JADX INFO: renamed from: throws */
    public void mo274throws(C14785l c14785l) {
        this.f22121l = (SecureRandom) c14785l.f28907l;
        ((C5911l) AbstractC8776l.purchase.get()).getClass();
    }

    public String toString() {
        switch (this.f22122l) {
            case 21:
                C10111l[] c10111lArr = (C10111l[]) this.f22121l;
                String strConcat = "[";
                for (int i = 0; i < c10111lArr.length; i++) {
                    strConcat = strConcat + i + " " + c10111lArr[i].toString();
                    if (i != c10111lArr.length - 1) {
                        strConcat = strConcat.concat(",\n");
                    }
                }
                return strConcat.concat("]");
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC9746l
    public C3823l vip(Object obj) {
        C6871l c6871l = (C6871l) obj;
        C17503l c17503l = ((CallableC12781l) this.f22121l).purchase;
        if (c6871l != null) {
            return AbstractC4311l.ads(Arrays.asList(C17503l.yandex(c17503l), c17503l.remoteconfig.adcel(null, (ExecutorC4850l) c17503l.purchase.f1958l)));
        }
        Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
        return AbstractC4311l.mopub(null);
    }

    /* JADX INFO: renamed from: volatile, reason: not valid java name */
    public void m3025volatile(C10111l c10111l, C10975l c10975l) {
        int i = 0;
        while (true) {
            C10111l[] c10111lArr = (C10111l[]) this.f22121l;
            if (i >= c10111lArr.length) {
                return;
            }
            c10111lArr[i].ad(c10111l, ((C10111l[]) c10975l.f22121l)[i]);
            i++;
        }
    }

    @Override // defpackage.InterfaceC15600l
    public Object yandex(C11425l c11425l, Object obj) {
        m3019interface(c11425l, (StringBuilder) obj, "getter");
        return Unit.INSTANCE;
    }

    public /* synthetic */ C10975l(int i, boolean z) {
        this.f22122l = i;
    }

    public C10975l(C5775l c5775l) {
        this.f22122l = 21;
        int i = c5775l.billing;
        this.f22121l = new C10111l[i];
        for (int i2 = 0; i2 < i; i2++) {
            ((C10111l[]) this.f22121l)[i2] = new C10111l(c5775l);
        }
    }

    public C10975l(C5012l c5012l, InterfaceC15879l interfaceC15879l) {
        this.f22122l = 23;
        this.f22121l = c5012l;
        interfaceC15879l.purchase();
    }

    public /* synthetic */ C10975l(int i, Object obj) {
        this.f22122l = i;
        this.f22121l = obj;
    }

    public C10975l(C5104l c5104l) {
        this.f22122l = 26;
        this.f22121l = c5104l;
        C6916l c6916l = InterfaceC15273l.f29872l;
        Class cls = (Class) c5104l.smaato(c6916l, null);
        if (cls != null && !cls.equals(C10245l.class)) {
            C1759l.smaato("Invalid target class configuration for ", this, ": ", cls);
            throw null;
        }
        c5104l.mopub(InterfaceC0048l.f919l, EnumC11949l.f23818l);
        c5104l.mopub(c6916l, C10245l.class);
        C6916l c6916l2 = InterfaceC15273l.f29871l;
        if (c5104l.smaato(c6916l2, null) == null) {
            c5104l.mopub(c6916l2, C10245l.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    public C10975l(long[] jArr) {
        C9571l c9571l;
        this.f22122l = 25;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            c9571l = new C9571l(jArrCopyOf.length);
            int i = c9571l.loadAd;
            if (i >= 0) {
                if (jArrCopyOf.length != 0) {
                    c9571l.crashlytics(jArrCopyOf.length + i);
                    long[] jArr2 = c9571l.yandex;
                    int i2 = c9571l.loadAd;
                    if (i != i2) {
                        AbstractC8669l.license(jArrCopyOf.length + i, i, i2, jArr2, jArr2);
                    }
                    System.arraycopy(jArrCopyOf, 0, jArr2, i, jArrCopyOf.length);
                    c9571l.loadAd += jArrCopyOf.length;
                }
            } else {
                AbstractC13082l.amazon("");
                throw null;
            }
        } else {
            c9571l = new C9571l();
        }
        this.f22121l = c9571l;
    }

    public C10975l(CallableC12781l callableC12781l, String str) {
        this.f22122l = 7;
        this.f22121l = callableC12781l;
    }
}
