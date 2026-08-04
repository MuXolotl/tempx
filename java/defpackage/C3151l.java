package defpackage;

import android.app.Activity;
import android.view.KeyEvent;
import android.widget.Toast;
import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.dynamic.DynamicMutableRealmObject;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkx.activity.ShortcutBridgeActivity;

/* JADX INFO: renamed from: lؕؓۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3151l extends C1538l implements Function1 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f6773l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3151l(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f6773l = i4;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x05ab  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fAdmob;
        Integer numYandex;
        EnumC14173l enumC14173lLoadAd;
        boolean z;
        int i = this.f6773l;
        String str = "CachedPlaylist";
        String str2 = "uid";
        int i2 = 12;
        int i3 = 19;
        int i4 = 18;
        int i5 = 25;
        int i6 = 0;
        Object obj2 = this.f26698l;
        switch (i) {
            case 0:
                float fFloatValue = ((Number) obj).floatValue();
                C7473l c7473l = (C7473l) obj2;
                boolean zLoadAd = c7473l.loadAd();
                C13765l c13765l = c7473l.billing;
                C13765l c13765l2 = c7473l.mopub;
                float f = 0.0f;
                if (!zLoadAd) {
                    float fAdmob2 = c13765l.admob() + fFloatValue;
                    if (fAdmob2 < 0.0f) {
                        fAdmob2 = 0.0f;
                    }
                    float fAdmob3 = fAdmob2 - c13765l.admob();
                    c13765l.subs(fAdmob2);
                    if (c7473l.yandex() <= c13765l2.admob()) {
                        fAdmob = c7473l.yandex();
                    } else {
                        float fAbs = Math.abs(c7473l.yandex() / c13765l2.admob()) - 1.0f;
                        f = fAbs >= 0.0f ? fAbs : 0.0f;
                        if (f > 2.0f) {
                            f = 2.0f;
                        }
                        fAdmob = (c13765l2.admob() * (f - (((float) Math.pow(f, 2.0d)) / 4.0f))) + c13765l2.admob();
                    }
                    c7473l.purchase.subs(fAdmob);
                    f = fAdmob3;
                }
                return Float.valueOf(f);
            case 1:
                ((C11279l) obj2).yandex(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            case 2:
                ((C11279l) obj2).yandex(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            case 3:
                ((C11279l) obj2).yandex(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            case 4:
                C2157l c2157l = (C2157l) obj2;
                InterfaceC9069l interfaceC9069l = c2157l.f4793l;
                int iOrdinal = ((EnumC0756l) obj).ordinal();
                if (iOrdinal == 0) {
                    new C9583l(interfaceC9069l).Signature(c2157l.f5081l);
                } else if (iOrdinal == 1) {
                    String strAdvert = c2157l.advert();
                    DecimalFormat decimalFormat = C15638l.yandex;
                    C15638l.yandex(strAdvert);
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        C18725l.billing();
                        return null;
                    }
                    new C15748l(c2157l.advert()).Signature(c2157l.f5081l);
                } else if (interfaceC9069l instanceof C9080l) {
                    C16499l c16499l = C16499l.f32230l;
                    Activity activity = c2157l.f5081l;
                    AudioPlaylist audioPlaylist = ((C9080l) interfaceC9069l).yandex;
                    c16499l.getClass();
                    C16499l.loadAd(activity, "https://" + AbstractC9549l.purchase + "/music/playlist/" + AbstractC14770l.remoteconfig(audioPlaylist), audioPlaylist.mopub, AbstractC14770l.amazon(audioPlaylist));
                } else if (interfaceC9069l instanceof C0399l) {
                    C16499l c16499l2 = C16499l.f32230l;
                    Activity activity2 = c2157l.f5081l;
                    AudioTrack audioTrack = ((C0399l) interfaceC9069l).yandex;
                    c16499l2.getClass();
                    C16499l.loadAd(activity2, "https://" + AbstractC9549l.purchase + "/audio" + AbstractC16676l.billing(audioTrack), audioTrack.yandex + " - " + audioTrack.amazon, audioTrack.getAmazon());
                } else {
                    if (!(interfaceC9069l instanceof C15268l)) {
                        C18725l.billing();
                        return null;
                    }
                    C16499l c16499l3 = C16499l.f32230l;
                    Activity activity3 = c2157l.f5081l;
                    CatalogArtist catalogArtist = ((C15268l) interfaceC9069l).yandex;
                    c16499l3.getClass();
                    C16499l.loadAd(activity3, C16499l.amazon(catalogArtist), catalogArtist.yandex, catalogArtist.yandex());
                }
                c2157l.purchase();
                return Unit.INSTANCE;
            case 5:
                ((C6922l) obj2).mopub.subscription((String) obj);
                return Unit.INSTANCE;
            case 6:
                C9583l c9583l = (C9583l) obj2;
                AbstractC9033l.crashlytics((AppActivity) c9583l.f5081l, new C7226l(c9583l, (C16895l) obj, null, i5));
                return Unit.INSTANCE;
            case 7:
                ShortcutBridgeActivity shortcutBridgeActivity = (ShortcutBridgeActivity) obj2;
                int i7 = ShortcutBridgeActivity.f36646l;
                shortcutBridgeActivity.getClass();
                ((Throwable) obj).printStackTrace();
                Toast.makeText(shortcutBridgeActivity, R.string.shortcut_load_err, 1).show();
                return Unit.INSTANCE;
            case 8:
                ((C8748l) obj2).f18011l.smaato((String) obj);
                return Unit.INSTANCE;
            case 9:
                ((C8748l) obj2).f18011l.smaato((String) obj);
                return Unit.INSTANCE;
            case 10:
                long j = ((C1187l) obj).yandex;
                C7292l c7292l = (C7292l) obj2;
                c7292l.getClass();
                InterfaceC6474l interfaceC6474l = (InterfaceC6474l) AbstractC13402l.loadAd(c7292l, AbstractC8574l.yandex);
                if (interfaceC6474l != null) {
                    AbstractC10999l.mopub(c7292l.m3914l(), null, 0, new C11287l(c7292l, j, interfaceC6474l, new C17233l(c7292l, j), (InterfaceC14029l) null), 3);
                }
                return Unit.INSTANCE;
            case 11:
                ((C18624l) obj2).loadAd.yandex((Function1) obj);
                return Unit.INSTANCE;
            case 12:
                KeyEvent keyEvent = ((C18583l) obj).yandex;
                C10167l c10167l = (C10167l) obj2;
                C4397l c4397l = c10167l.billing;
                boolean z2 = c10167l.amazon;
                C0597l c0597l = (AbstractC14775l.mopub(keyEvent) && (numYandex = c10167l.subs.yandex(keyEvent)) != null) ? new C0597l(new StringBuilder().appendCodePoint(numYandex.intValue()).toString(), 1) : null;
                if (c0597l != null) {
                    if (z2) {
                        c10167l.yandex(Collections.singletonList(c0597l));
                        c4397l.yandex = null;
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (AbstractC16422l.purchase(keyEvent) != 2 || (enumC14173lLoadAd = c10167l.isPro.loadAd(keyEvent)) == null || (enumC14173lLoadAd.f27756l && !z2)) {
                    z = false;
                } else {
                    C9122l c9122l = new C9122l();
                    c9122l.f18750l = true;
                    C6411l c6411l = new C6411l(enumC14173lLoadAd, c10167l, c9122l, i2);
                    C0639l c0639l = c10167l.crashlytics;
                    C14078l c14078l = new C14078l(c0639l, c10167l.mopub, c10167l.yandex.amazon(), c4397l);
                    c6411l.invoke(c14078l);
                    boolean zCrashlytics = C12814l.crashlytics(c14078l.billing, c0639l.loadAd);
                    C3625l c3625l = c14078l.mopub;
                    if (!zCrashlytics || !AbstractC8576l.yandex(c3625l, c0639l.yandex)) {
                        c10167l.firebase.invoke(C0639l.yandex(c0639l, c3625l, c14078l.billing, 4));
                    }
                    C16399l c16399l = c10167l.admob;
                    if (c16399l != null) {
                        c16399l.purchase = true;
                    }
                    z = c9122l.f18750l;
                }
                return Boolean.valueOf(z);
            case 13:
                return ((AbstractC5921l) obj2).mo694private((C14025l) obj);
            case 14:
                ((C10610l) obj2).yandex((C7933l) obj);
                return Unit.INSTANCE;
            case 15:
                ((C10610l) obj2).yandex((C7933l) obj);
                return Unit.INSTANCE;
            case 16:
                C9529l c9529l = (C9529l) obj;
                ((C7085l) obj2).getClass();
                C6659l c6659l = c9529l.yandex;
                C6659l c6659l2 = c9529l.loadAd;
                ArrayList arrayList = new ArrayList();
                c9529l.yandex("CachedAlbum", new C10848l(arrayList, c6659l2, c6659l));
                String str3 = "CachedTrack";
                c9529l.yandex("CachedTrack", new C8163l(i2));
                c9529l.yandex("CachedArtist", new C8163l(13));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    InterfaceC11343l interfaceC11343l = (InterfaceC11343l) it.next();
                    C2336l c2336l = AbstractC18202l.yandex;
                    int i8 = i6;
                    long jLongValue = ((Number) interfaceC11343l.smaato(c2336l.loadAd(Long.class), "id")).longValue();
                    int i9 = i2;
                    long jLongValue2 = ((Number) interfaceC11343l.smaato(c2336l.loadAd(Long.class), "ownerId")).longValue();
                    String str4 = (String) interfaceC11343l.tapsense(c2336l.loadAd(String.class), "title");
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = "audios";
                    InterfaceC11334l interfaceC11334lFirebase = interfaceC11343l.firebase("audios");
                    Iterator it2 = it;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<E> it3 = interfaceC11334lFirebase.iterator();
                    while (it3.hasNext()) {
                        String str6 = str;
                        String str7 = str5;
                        String str8 = (String) ((InterfaceC11343l) it3.next()).tapsense(AbstractC18202l.yandex.loadAd(String.class), str2);
                        if (str8 != null) {
                            arrayList2.add(str8);
                        }
                        str5 = str7;
                        str = str6;
                    }
                    String str9 = str;
                    String str10 = str5;
                    Object[] objArr = new Object[1];
                    objArr[i8] = arrayList2;
                    C11033l c11033lMopub = AbstractC13702l.mopub(c6659l2.m2063l(str3, "uid IN $0", objArr).crashlytics());
                    InterfaceC11343l interfaceC11343lMopub = interfaceC11343l.mopub("photo");
                    C12555l c12555lYandex = interfaceC11343lMopub != null ? C7085l.yandex(interfaceC11343lMopub) : null;
                    DynamicMutableRealmObject.Companion companion = DynamicMutableRealmObject.INSTANCE;
                    String str11 = str3;
                    StringBuilder sb = new StringBuilder();
                    sb.append(jLongValue2);
                    sb.append('_');
                    sb.append(jLongValue);
                    C8195l c8195l = new C8195l(str2, sb.toString());
                    C8195l c8195l2 = new C8195l("id", Long.valueOf(jLongValue));
                    C8195l c8195l3 = new C8195l("ownerId", Long.valueOf(jLongValue2));
                    C2336l c2336l2 = AbstractC18202l.yandex;
                    String str12 = str2;
                    C8195l c8195l4 = new C8195l("origOwnerId", interfaceC11343l.smaato(c2336l2.loadAd(Long.class), "origOwnerId"));
                    C8195l c8195l5 = new C8195l("origPlaylistId", interfaceC11343l.smaato(c2336l2.loadAd(Long.class), "origPlaylistOwnerId"));
                    C8195l c8195l6 = new C8195l("folOwnerId", interfaceC11343l.smaato(c2336l2.loadAd(Long.class), "folOwnerId"));
                    C8195l c8195l7 = new C8195l("folPlaylistId", interfaceC11343l.smaato(c2336l2.loadAd(Long.class), "folPlaylistId"));
                    C8195l c8195l8 = new C8195l("type", interfaceC11343l.smaato(c2336l2.loadAd(Long.class), "type"));
                    C8195l c8195l9 = new C8195l("count", interfaceC11343l.smaato(c2336l2.loadAd(Long.class), "count"));
                    C8195l c8195l10 = new C8195l("followers", interfaceC11343l.smaato(c2336l2.loadAd(Long.class), "followers"));
                    C8195l c8195l11 = new C8195l("plays", interfaceC11343l.smaato(c2336l2.loadAd(Long.class), "plays"));
                    C8195l c8195l12 = new C8195l("year", interfaceC11343l.smaato(c2336l2.loadAd(Long.class), "year"));
                    C8195l c8195l13 = new C8195l("accessKey", interfaceC11343l.tapsense(c2336l2.loadAd(String.class), "accessKey"));
                    C8195l c8195l14 = new C8195l("origAccessKey", interfaceC11343l.tapsense(c2336l2.loadAd(String.class), "origAccessKey"));
                    C8195l c8195l15 = new C8195l("title", str4);
                    C8195l c8195l16 = new C8195l("localizedSearchTitle", str4.toLowerCase(Locale.ROOT));
                    C8195l c8195l17 = new C8195l("ownerTitle", interfaceC11343l.tapsense(c2336l2.loadAd(String.class), "ownerTitle"));
                    C8195l c8195l18 = new C8195l("subtitle", interfaceC11343l.tapsense(c2336l2.loadAd(String.class), "subtitle"));
                    String str13 = (String) interfaceC11343l.tapsense(c2336l2.loadAd(String.class), "albumType");
                    if (str13 == null) {
                        str13 = "playlist";
                    }
                    C8195l c8195l19 = new C8195l("albumType", str13);
                    C8195l c8195l20 = new C8195l("description", interfaceC11343l.tapsense(c2336l2.loadAd(String.class), "description"));
                    C8195l c8195l21 = new C8195l("createTime", interfaceC11343l.smaato(c2336l2.loadAd(Long.class), "createTime"));
                    C8195l c8195l22 = new C8195l("updateTime", interfaceC11343l.smaato(c2336l2.loadAd(Long.class), "updateTime"));
                    C8195l c8195l23 = new C8195l("isExplicit", interfaceC11343l.smaato(c2336l2.loadAd(Boolean.class), "isExplicit"));
                    C8195l c8195l24 = new C8195l("isFollowing", interfaceC11343l.smaato(c2336l2.loadAd(Boolean.class), "isFollowing"));
                    Boolean bool = Boolean.TRUE;
                    C8195l c8195l25 = new C8195l("isAvailableOffline", bool);
                    C8195l c8195l26 = new C8195l("isLegacyCachedArtwork", bool);
                    C8195l c8195l27 = new C8195l(str10, c11033lMopub);
                    InterfaceC11334l interfaceC11334lFirebase2 = interfaceC11343l.firebase("thumbs");
                    C11033l c11033lPurchase = AbstractC15684l.purchase(new Object[i8]);
                    for (Iterator it4 = interfaceC11334lFirebase2.iterator(); it4.hasNext(); it4 = it4) {
                        c11033lPurchase.add(C7085l.yandex((InterfaceC11343l) it4.next()));
                    }
                    C8195l c8195l28 = new C8195l("thumbs", c11033lPurchase);
                    InterfaceC11334l interfaceC11334lFirebase3 = interfaceC11343l.firebase("genres");
                    C11033l c11033lPurchase2 = AbstractC15684l.purchase(new Object[0]);
                    Iterator it5 = interfaceC11334lFirebase3.iterator();
                    while (it5.hasNext()) {
                        Iterator it6 = it5;
                        InterfaceC11343l interfaceC11343l2 = (InterfaceC11343l) it5.next();
                        DynamicMutableRealmObject.Companion companion2 = DynamicMutableRealmObject.INSTANCE;
                        C8195l c8195l29 = c8195l24;
                        C2336l c2336l3 = AbstractC18202l.yandex;
                        C8195l c8195l30 = c8195l23;
                        C8195l c8195l31 = c8195l14;
                        C8195l c8195l32 = new C8195l("id", interfaceC11343l2.smaato(c2336l3.loadAd(Long.class), "id"));
                        String str14 = (String) interfaceC11343l2.tapsense(c2336l3.loadAd(String.class), "name");
                        if (str14 == null) {
                            str14 = "";
                        }
                        Map mapRemoteconfig = AbstractC8676l.remoteconfig(c8195l32, new C8195l("name", str14));
                        companion2.getClass();
                        c11033lPurchase2.add(new C12555l("CachedVkGenre", mapRemoteconfig));
                        it5 = it6;
                        c8195l24 = c8195l29;
                        c8195l23 = c8195l30;
                        c8195l14 = c8195l31;
                    }
                    C8195l c8195l33 = c8195l24;
                    C8195l c8195l34 = c8195l23;
                    C8195l c8195l35 = c8195l14;
                    C8195l c8195l36 = new C8195l("genres", c11033lPurchase2);
                    InterfaceC11334l interfaceC11334lFirebase4 = interfaceC11343l.firebase("mainArtists");
                    C11033l c11033lPurchase3 = AbstractC15684l.purchase(new Object[0]);
                    Iterator<E> it7 = interfaceC11334lFirebase4.iterator();
                    while (it7.hasNext()) {
                        c11033lPurchase3.add(c6659l2.m2062l((InterfaceC11343l) it7.next()));
                    }
                    C8195l c8195l37 = new C8195l("mainArtists", c11033lPurchase3);
                    C8195l c8195l38 = new C8195l("photo", c12555lYandex);
                    C8195l[] c8195lArr = new C8195l[31];
                    c8195lArr[0] = c8195l;
                    c8195lArr[1] = c8195l2;
                    c8195lArr[2] = c8195l3;
                    c8195lArr[3] = c8195l4;
                    c8195lArr[4] = c8195l5;
                    c8195lArr[5] = c8195l6;
                    c8195lArr[6] = c8195l7;
                    c8195lArr[7] = c8195l8;
                    c8195lArr[8] = c8195l9;
                    c8195lArr[9] = c8195l10;
                    c8195lArr[10] = c8195l11;
                    c8195lArr[11] = c8195l12;
                    c8195lArr[i9] = c8195l13;
                    c8195lArr[13] = c8195l35;
                    c8195lArr[14] = c8195l15;
                    c8195lArr[15] = c8195l16;
                    c8195lArr[16] = c8195l17;
                    c8195lArr[17] = c8195l18;
                    c8195lArr[18] = c8195l19;
                    c8195lArr[19] = c8195l20;
                    c8195lArr[20] = c8195l21;
                    c8195lArr[21] = c8195l22;
                    c8195lArr[22] = c8195l34;
                    c8195lArr[23] = c8195l33;
                    c8195lArr[24] = c8195l25;
                    c8195lArr[25] = c8195l26;
                    c8195lArr[26] = c8195l27;
                    c8195lArr[27] = c8195l28;
                    c8195lArr[28] = c8195l36;
                    c8195lArr[29] = c8195l37;
                    c8195lArr[30] = c8195l38;
                    Map mapRemoteconfig2 = AbstractC8676l.remoteconfig(c8195lArr);
                    companion.getClass();
                    str = str9;
                    i2 = i9;
                    it = it2;
                    str3 = str11;
                    str2 = str12;
                    i6 = 0;
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C17416l) obj2).getClass();
                C6659l c6659l3 = ((C9529l) obj).loadAd;
                DynamicMutableRealmObject.Companion companion3 = DynamicMutableRealmObject.INSTANCE;
                C8195l c8195l39 = new C8195l("uid", 1L);
                C15825l c15825lCrashlytics = c6659l3.m2063l("CachedPlaylist", "TRUEPREDICATE", new Object[0]).loadAd("uid", new String[0]).crashlytics();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : c15825lCrashlytics) {
                    if (!AbstractC16648l.Signature((String) ((DynamicMutableRealmObject) obj3).smaato(AbstractC18202l.yandex.loadAd(String.class), "uid"), "_-1337", false)) {
                        arrayList3.add(obj3);
                    }
                }
                Map mapRemoteconfig3 = AbstractC8676l.remoteconfig(c8195l39, new C8195l("playlists", AbstractC13702l.mopub(AbstractC16901l.m4240super(arrayList3))));
                companion3.getClass();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C3095l) obj2).amazon.yandex(new C17330l(i3, new C5017l((C0523l) obj)), new C16419l(9));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C3095l) obj2).amazon.yandex(new C17330l(i4, new C18046l((String) obj)), new C16419l(8));
                return Unit.INSTANCE;
            case 20:
                ((C3095l) obj2).amazon.yandex(new C17330l(i3, new C5017l((C0523l) obj)), new C16419l(9));
                return Unit.INSTANCE;
            default:
                ((C3095l) obj2).amazon.yandex(new C17330l(i4, new C18046l((String) obj)), new C16419l(8));
                return Unit.INSTANCE;
        }
    }
}
