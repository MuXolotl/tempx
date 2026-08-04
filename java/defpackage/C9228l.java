package defpackage;

import android.util.Base64;
import android.util.JsonReader;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lٌۨٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9228l {
    public static final C14965l yandex;

    static {
        C9309l c9309l = new C9309l();
        C17912l c17912l = C17912l.yandex;
        c9309l.subs(AbstractC2236l.class, c17912l);
        c9309l.subs(C11091l.class, c17912l);
        C5696l c5696l = C5696l.yandex;
        c9309l.subs(AbstractC5638l.class, c5696l);
        c9309l.subs(C9428l.class, c5696l);
        C10309l c10309l = C10309l.yandex;
        c9309l.subs(AbstractC9034l.class, c10309l);
        c9309l.subs(C4463l.class, c10309l);
        C3257l c3257l = C3257l.yandex;
        c9309l.subs(AbstractC3105l.class, c3257l);
        c9309l.subs(AbstractC10254l.class, c3257l);
        C7157l c7157l = C7157l.yandex;
        c9309l.subs(AbstractC11657l.class, c7157l);
        c9309l.subs(C13482l.class, c7157l);
        C0989l c0989l = C0989l.yandex;
        c9309l.subs(AbstractC17613l.class, c0989l);
        c9309l.subs(C1006l.class, c0989l);
        C1697l c1697l = C1697l.yandex;
        c9309l.subs(AbstractC8314l.class, c1697l);
        c9309l.subs(C8997l.class, c1697l);
        C15914l c15914l = C15914l.yandex;
        c9309l.subs(AbstractC2883l.class, c15914l);
        c9309l.subs(C17358l.class, c15914l);
        C0666l c0666l = C0666l.yandex;
        c9309l.subs(AbstractC5909l.class, c0666l);
        c9309l.subs(C5161l.class, c0666l);
        C2918l c2918l = C2918l.yandex;
        c9309l.subs(AbstractC10102l.class, c2918l);
        c9309l.subs(C0139l.class, c2918l);
        C9184l c9184l = C9184l.yandex;
        c9309l.subs(AbstractC5906l.class, c9184l);
        c9309l.subs(C16498l.class, c9184l);
        C2725l c2725l = C2725l.yandex;
        c9309l.subs(AbstractC15403l.class, c2725l);
        c9309l.subs(C7422l.class, c2725l);
        C1495l c1495l = C1495l.yandex;
        c9309l.subs(AbstractC1377l.class, c1495l);
        c9309l.subs(C16172l.class, c1495l);
        C17381l c17381l = C17381l.yandex;
        c9309l.subs(AbstractC5235l.class, c17381l);
        c9309l.subs(C1379l.class, c17381l);
        C9986l c9986l = C9986l.yandex;
        c9309l.subs(AbstractC0724l.class, c9986l);
        c9309l.subs(C13365l.class, c9986l);
        C10658l c10658l = C10658l.yandex;
        c9309l.subs(AbstractC5579l.class, c10658l);
        c9309l.subs(C6990l.class, c10658l);
        C6744l c6744l = C6744l.yandex;
        c9309l.subs(AbstractC9956l.class, c6744l);
        c9309l.subs(C0494l.class, c6744l);
        C18699l c18699l = C18699l.yandex;
        c9309l.subs(AbstractC12911l.class, c18699l);
        c9309l.subs(C15474l.class, c18699l);
        C4255l c4255l = C4255l.yandex;
        c9309l.subs(AbstractC1431l.class, c4255l);
        c9309l.subs(C4702l.class, c4255l);
        C10579l c10579l = C10579l.yandex;
        c9309l.subs(AbstractC3394l.class, c10579l);
        c9309l.subs(C9947l.class, c10579l);
        C7485l c7485l = C7485l.yandex;
        c9309l.subs(AbstractC3802l.class, c7485l);
        c9309l.subs(C4473l.class, c7485l);
        C13592l c13592l = C13592l.yandex;
        c9309l.subs(AbstractC17409l.class, c13592l);
        c9309l.subs(C1222l.class, c13592l);
        C18373l c18373l = C18373l.yandex;
        c9309l.subs(AbstractC9375l.class, c18373l);
        c9309l.subs(C12069l.class, c18373l);
        C9132l c9132l = C9132l.yandex;
        c9309l.subs(AbstractC13583l.class, c9132l);
        c9309l.subs(C9895l.class, c9132l);
        C9236l c9236l = C9236l.yandex;
        c9309l.subs(AbstractC2869l.class, c9236l);
        c9309l.subs(C8638l.class, c9236l);
        C4188l c4188l = C4188l.yandex;
        c9309l.subs(AbstractC6291l.class, c4188l);
        c9309l.subs(C10090l.class, c4188l);
        c9309l.f19122l = true;
        yandex = new C14965l(c9309l);
    }

    /* JADX WARN: Code duplicated, block: B:170:0x0256  */
    public static C11091l admob(JsonReader jsonReader) throws IOException {
        byte b;
        Charset charset = AbstractC2236l.yandex;
        C10221l c10221l = new C10221l();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    jsonReader.beginObject();
                    List listAmazon = null;
                    String strNextString = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("files")) {
                            listAmazon = amazon(jsonReader, new C8936l(26));
                            if (listAmazon == null) {
                                C6541l.subs("Null files");
                                return null;
                            }
                        } else if (strNextName2.equals("orgId")) {
                            strNextString = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (listAmazon == null) {
                        C8339l.smaato("Missing required properties: files");
                        return null;
                    }
                    c10221l.firebase = new C8638l(listAmazon, strNextString);
                    continue;
                    break;
                    break;
                case "sdkVersion":
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        C6541l.subs("Null sdkVersion");
                        return null;
                    }
                    c10221l.yandex = strNextString2;
                    break;
                    break;
                case "appQualitySessionId":
                    c10221l.mopub = jsonReader.nextString();
                    break;
                case "appExitInfo":
                    c10221l.smaato = crashlytics(jsonReader);
                    break;
                case "buildVersion":
                    String strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        C6541l.subs("Null buildVersion");
                        return null;
                    }
                    c10221l.admob = strNextString3;
                    break;
                    break;
                case "firebaseAuthenticationToken":
                    c10221l.billing = jsonReader.nextString();
                    break;
                case "gmpAppId":
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        C6541l.subs("Null gmpAppId");
                        return null;
                    }
                    c10221l.loadAd = strNextString4;
                    break;
                    break;
                case "installationUuid":
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        C6541l.subs("Null installationUuid");
                        return null;
                    }
                    c10221l.amazon = strNextString5;
                    break;
                    break;
                case "firebaseInstallationId":
                    c10221l.purchase = jsonReader.nextString();
                    break;
                case "platform":
                    c10221l.crashlytics = jsonReader.nextInt();
                    c10221l.remoteconfig = (byte) (c10221l.remoteconfig | 1);
                    break;
                case "displayVersion":
                    String strNextString6 = jsonReader.nextString();
                    if (strNextString6 == null) {
                        C6541l.subs("Null displayVersion");
                        return null;
                    }
                    c10221l.subs = strNextString6;
                    break;
                    break;
                case "session":
                    C4320l c4320l = new C4320l();
                    c4320l.billing = false;
                    c4320l.remoteconfig = (byte) (c4320l.remoteconfig | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "startedAt":
                                c4320l.amazon = jsonReader.nextLong();
                                c4320l.remoteconfig = (byte) (c4320l.remoteconfig | 1);
                                break;
                            case "appQualitySessionId":
                                c4320l.crashlytics = jsonReader.nextString();
                                break;
                            case "identifier":
                                c4320l.loadAd = new String(Base64.decode(jsonReader.nextString(), 2), AbstractC2236l.yandex);
                                break;
                            case "endedAt":
                                c4320l.purchase = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "device":
                                C15017l c15017l = new C15017l();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "simulator":
                                            c15017l.billing = jsonReader.nextBoolean();
                                            c15017l.isPro = (byte) (c15017l.isPro | 16);
                                            break;
                                        case "manufacturer":
                                            String strNextString7 = jsonReader.nextString();
                                            if (strNextString7 == null) {
                                                C6541l.subs("Null manufacturer");
                                                return null;
                                            }
                                            c15017l.admob = strNextString7;
                                            break;
                                            break;
                                        case "ram":
                                            c15017l.amazon = jsonReader.nextLong();
                                            c15017l.isPro = (byte) (c15017l.isPro | 4);
                                            break;
                                        case "arch":
                                            c15017l.yandex = jsonReader.nextInt();
                                            c15017l.isPro = (byte) (c15017l.isPro | 1);
                                            break;
                                        case "diskSpace":
                                            c15017l.purchase = jsonReader.nextLong();
                                            c15017l.isPro = (byte) (c15017l.isPro | 8);
                                            break;
                                        case "cores":
                                            c15017l.crashlytics = jsonReader.nextInt();
                                            c15017l.isPro = (byte) (c15017l.isPro | 2);
                                            break;
                                        case "model":
                                            String strNextString8 = jsonReader.nextString();
                                            if (strNextString8 == null) {
                                                C6541l.subs("Null model");
                                                return null;
                                            }
                                            c15017l.loadAd = strNextString8;
                                            break;
                                            break;
                                        case "state":
                                            c15017l.mopub = jsonReader.nextInt();
                                            c15017l.isPro = (byte) (c15017l.isPro | 32);
                                            break;
                                        case "modelClass":
                                            String strNextString9 = jsonReader.nextString();
                                            if (strNextString9 == null) {
                                                C6541l.subs("Null modelClass");
                                                return null;
                                            }
                                            c15017l.subs = strNextString9;
                                            break;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                c4320l.isPro = c15017l.yandex();
                                break;
                            case "events":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(purchase(jsonReader));
                                }
                                jsonReader.endArray();
                                c4320l.firebase = DesugarCollections.unmodifiableList(arrayList);
                                break;
                            case "os":
                                C10028l c10028l = new C10028l();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            String strNextString10 = jsonReader.nextString();
                                            if (strNextString10 == null) {
                                                C6541l.subs("Null buildVersion");
                                                return null;
                                            }
                                            c10028l.crashlytics = strNextString10;
                                            break;
                                            break;
                                        case "jailbroken":
                                            c10028l.amazon = jsonReader.nextBoolean();
                                            c10028l.purchase = (byte) (c10028l.purchase | 2);
                                            break;
                                        case "version":
                                            String strNextString11 = jsonReader.nextString();
                                            if (strNextString11 == null) {
                                                C6541l.subs("Null version");
                                                return null;
                                            }
                                            c10028l.loadAd = strNextString11;
                                            break;
                                            break;
                                        case "platform":
                                            c10028l.yandex = jsonReader.nextInt();
                                            c10028l.purchase = (byte) (c10028l.purchase | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                c4320l.subs = c10028l.yandex();
                                break;
                            case "app":
                                jsonReader.beginObject();
                                String strNextString12 = null;
                                String strNextString13 = null;
                                String strNextString14 = null;
                                String strNextString15 = null;
                                String strNextString16 = null;
                                String strNextString17 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.getClass();
                                    switch (strNextName6.hashCode()) {
                                        case -1618432855:
                                            if (!strNextName6.equals("identifier")) {
                                                b = -1;
                                            } else {
                                                b = 0;
                                            }
                                            break;
                                        case -519438642:
                                            if (!strNextName6.equals("developmentPlatform")) {
                                                b = -1;
                                            } else {
                                                b = 1;
                                            }
                                            break;
                                        case 213652010:
                                            if (!strNextName6.equals("developmentPlatformVersion")) {
                                                b = -1;
                                            } else {
                                                b = 2;
                                            }
                                            break;
                                        case 351608024:
                                            b = !strNextName6.equals("version") ? (byte) -1 : (byte) 3;
                                            break;
                                        case 719853845:
                                            b = !strNextName6.equals("installationUuid") ? (byte) -1 : (byte) 4;
                                            break;
                                        case 1975623094:
                                            b = !strNextName6.equals("displayVersion") ? (byte) -1 : (byte) 5;
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    switch (b) {
                                        case 0:
                                            strNextString17 = jsonReader.nextString();
                                            if (strNextString17 == null) {
                                                C6541l.subs("Null identifier");
                                                return null;
                                            }
                                            break;
                                            break;
                                        case 1:
                                            strNextString15 = jsonReader.nextString();
                                            break;
                                        case 2:
                                            strNextString16 = jsonReader.nextString();
                                            break;
                                        case 3:
                                            strNextString12 = jsonReader.nextString();
                                            if (strNextString12 == null) {
                                                C6541l.subs("Null version");
                                                return null;
                                            }
                                            break;
                                            break;
                                        case 4:
                                            strNextString14 = jsonReader.nextString();
                                            break;
                                        case 5:
                                            strNextString13 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (strNextString17 != null && strNextString12 != null) {
                                    c4320l.mopub = new C4463l(strNextString17, strNextString12, strNextString13, strNextString14, strNextString15, strNextString16);
                                    break;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    if (strNextString17 == null) {
                                        sb.append(" identifier");
                                    }
                                    if (strNextString12 == null) {
                                        sb.append(" version");
                                    }
                                    C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb));
                                    return null;
                                }
                                break;
                            case "user":
                                jsonReader.beginObject();
                                String strNextString18 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        strNextString18 = jsonReader.nextString();
                                        if (strNextString18 == null) {
                                            C6541l.subs("Null identifier");
                                            return null;
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (strNextString18 == null) {
                                    C8339l.smaato("Missing required properties: identifier");
                                    return null;
                                }
                                c4320l.admob = new C13482l(strNextString18);
                                break;
                                break;
                            case "generator":
                                String strNextString19 = jsonReader.nextString();
                                if (strNextString19 == null) {
                                    C6541l.subs("Null generator");
                                    return null;
                                }
                                c4320l.yandex = strNextString19;
                                break;
                                break;
                            case "crashed":
                                c4320l.billing = jsonReader.nextBoolean();
                                c4320l.remoteconfig = (byte) (c4320l.remoteconfig | 2);
                                break;
                            case "generatorType":
                                c4320l.smaato = jsonReader.nextInt();
                                c4320l.remoteconfig = (byte) (c4320l.remoteconfig | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    c10221l.isPro = c4320l.yandex();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c10221l.yandex();
    }

    public static List amazon(JsonReader jsonReader, InterfaceC15792l interfaceC15792l) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(interfaceC15792l.crashlytics(jsonReader));
        }
        jsonReader.endArray();
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public static C16172l billing(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        byte b = 0;
        int iNextInt = 0;
        String strNextString = null;
        String strNextString2 = null;
        List listAmazon = null;
        C16172l c16172lBilling = null;
        while (true) {
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b == 1 && strNextString != null && listAmazon != null) {
                    return new C16172l(strNextString, strNextString2, listAmazon, c16172lBilling, iNextInt);
                }
                StringBuilder sb = new StringBuilder();
                if (strNextString == null) {
                    sb.append(" type");
                }
                if (listAmazon == null) {
                    sb.append(" frames");
                }
                if ((b & 1) == 0) {
                    sb.append(" overflowCount");
                }
                C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb));
                return null;
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    listAmazon = amazon(jsonReader, new C18725l(0));
                    if (listAmazon == null) {
                        C6541l.subs("Null frames");
                        return null;
                    }
                    break;
                    break;
                case "reason":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "type":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        C6541l.subs("Null type");
                        return null;
                    }
                    break;
                    break;
                case "causedBy":
                    c16172lBilling = billing(jsonReader);
                    break;
                case "overflowCount":
                    iNextInt = jsonReader.nextInt();
                    b = (byte) (b | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }

    public static C1379l crashlytics(JsonReader jsonReader) throws IOException {
        C2007l c2007l = new C2007l();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    c2007l.subs = amazon(jsonReader, new C8936l(25));
                    break;
                case "pid":
                    c2007l.yandex = jsonReader.nextInt();
                    c2007l.isPro = (byte) (c2007l.isPro | 1);
                    break;
                case "pss":
                    c2007l.purchase = jsonReader.nextLong();
                    c2007l.isPro = (byte) (c2007l.isPro | 8);
                    break;
                case "rss":
                    c2007l.billing = jsonReader.nextLong();
                    c2007l.isPro = (byte) (c2007l.isPro | 16);
                    break;
                case "timestamp":
                    c2007l.mopub = jsonReader.nextLong();
                    c2007l.isPro = (byte) (c2007l.isPro | 32);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        C6541l.subs("Null processName");
                        return null;
                    }
                    c2007l.loadAd = strNextString;
                    break;
                    break;
                case "reasonCode":
                    c2007l.crashlytics = jsonReader.nextInt();
                    c2007l.isPro = (byte) (c2007l.isPro | 2);
                    break;
                case "traceFile":
                    c2007l.admob = jsonReader.nextString();
                    break;
                case "importance":
                    c2007l.amazon = jsonReader.nextInt();
                    c2007l.isPro = (byte) (c2007l.isPro | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c2007l.yandex();
    }

    public static C15474l loadAd(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    C6541l.subs("Null key");
                    return null;
                }
            } else if (strNextName.equals("value")) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    C6541l.subs("Null value");
                    return null;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString != null && strNextString2 != null) {
            return new C15474l(strNextString, strNextString2);
        }
        StringBuilder sb = new StringBuilder();
        if (strNextString == null) {
            sb.append(" key");
        }
        if (strNextString2 == null) {
            sb.append(" value");
        }
        C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb));
        return null;
    }

    public static C4702l mopub(JsonReader jsonReader) throws IOException {
        C16647l c16647l = new C16647l();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    c16647l.loadAd = jsonReader.nextInt();
                    c16647l.purchase = (byte) (c16647l.purchase | 1);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        C6541l.subs("Null processName");
                        return null;
                    }
                    c16647l.yandex = strNextString;
                    break;
                    break;
                case "defaultProcess":
                    c16647l.amazon = jsonReader.nextBoolean();
                    c16647l.purchase = (byte) (c16647l.purchase | 4);
                    break;
                case "importance":
                    c16647l.crashlytics = jsonReader.nextInt();
                    c16647l.purchase = (byte) (c16647l.purchase | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c16647l.yandex();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:111:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:157:0x024e  */
    /* JADX WARN: Code duplicated, block: B:242:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [lؙٖؕ] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [lۣؗۢ] */
    /* JADX WARN: Type inference failed for: r24v2, types: [lْؒ۠] */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [lؚٖؓ] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r26v6 */
    /* JADX WARN: Type inference failed for: r26v7 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static C17358l purchase(JsonReader jsonReader) throws IOException {
        byte b;
        C0495l c0495l = new C0495l();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "device":
                    b = 0;
                    break;
                case "rollouts":
                    b = 1;
                    break;
                case "app":
                    b = 2;
                    break;
                case "log":
                    b = 3;
                    break;
                case "type":
                    b = 4;
                    break;
                case "timestamp":
                    b = 5;
                    break;
                default:
                    b = -1;
                    break;
            }
            C17358l c17358l = null;
            switch (b) {
                case 0:
                    C7028l c7028l = new C7028l();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        switch (strNextName2) {
                            case "batteryLevel":
                                c7028l.yandex = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case "batteryVelocity":
                                c7028l.loadAd = jsonReader.nextInt();
                                c7028l.mopub = (byte) (c7028l.mopub | 1);
                                break;
                            case "orientation":
                                c7028l.amazon = jsonReader.nextInt();
                                c7028l.mopub = (byte) (c7028l.mopub | 4);
                                break;
                            case "diskUsed":
                                c7028l.billing = jsonReader.nextLong();
                                c7028l.mopub = (byte) (c7028l.mopub | 16);
                                break;
                            case "ramUsed":
                                c7028l.purchase = jsonReader.nextLong();
                                c7028l.mopub = (byte) (c7028l.mopub | 8);
                                break;
                            case "proximityOn":
                                c7028l.crashlytics = jsonReader.nextBoolean();
                                c7028l.mopub = (byte) (c7028l.mopub | 2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    c0495l.amazon = c7028l.yandex();
                    break;
                case 1:
                    jsonReader.beginObject();
                    List listAmazon = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        if (strNextName3.equals("assignments")) {
                            listAmazon = amazon(jsonReader, new C8936l(27));
                            if (listAmazon == null) {
                                C6541l.subs("Null rolloutAssignments");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (listAmazon == null) {
                        C8339l.smaato("Missing required properties: rolloutAssignments");
                        return null;
                    }
                    c0495l.billing = new C1222l(listAmazon);
                    break;
                    break;
                case 2:
                    jsonReader.beginObject();
                    C0139l c0139l = null;
                    List listUnmodifiableList = null;
                    List listUnmodifiableList2 = null;
                    Boolean boolValueOf = null;
                    C4702l c4702lMopub = null;
                    List listUnmodifiableList3 = null;
                    boolean z = false;
                    int iNextInt = 0;
                    while (true) {
                        C17358l c17358l2 = c17358l;
                        if (!jsonReader.hasNext()) {
                            jsonReader.endObject();
                            if (z && c0139l != null) {
                                c0495l.crashlytics = new C5161l(c0139l, listUnmodifiableList, listUnmodifiableList2, boolValueOf, c4702lMopub, listUnmodifiableList3, iNextInt);
                                break;
                            }
                            StringBuilder sb = new StringBuilder();
                            if (c0139l == null) {
                                sb.append(" execution");
                            }
                            if (!z) {
                                sb.append(" uiOrientation");
                            }
                            C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb));
                            return c17358l2;
                        }
                        String strNextName4 = jsonReader.nextName();
                        strNextName4.getClass();
                        switch (strNextName4) {
                            case "appProcessDetails":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(mopub(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList3 = DesugarCollections.unmodifiableList(arrayList);
                                c17358l = c17358l2;
                                break;
                            case "background":
                                boolValueOf = Boolean.valueOf(jsonReader.nextBoolean());
                                c17358l = c17358l2;
                                break;
                            case "execution":
                                jsonReader.beginObject();
                                ?? Amazon = c17358l2;
                                ?? Billing = Amazon;
                                ?? Crashlytics = Billing;
                                ?? c6990l = Crashlytics;
                                ?? r26 = c6990l;
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "appExitInfo":
                                            Crashlytics = crashlytics(jsonReader);
                                            break;
                                        case "threads":
                                            Amazon = amazon(jsonReader, new C8936l(28));
                                            break;
                                        case "signal":
                                            jsonReader.beginObject();
                                            long jNextLong = 0;
                                            byte b2 = 0;
                                            ?? NextString = c17358l2;
                                            ?? NextString2 = NextString;
                                            while (jsonReader.hasNext()) {
                                                String strNextName6 = jsonReader.nextName();
                                                strNextName6.getClass();
                                                switch (strNextName6) {
                                                    case "address":
                                                        b2 = (byte) (b2 | 1);
                                                        jNextLong = jsonReader.nextLong();
                                                        break;
                                                    case "code":
                                                        NextString2 = jsonReader.nextString();
                                                        if (NextString2 == 0) {
                                                            C6541l.subs("Null code");
                                                            return c17358l2;
                                                        }
                                                        break;
                                                        break;
                                                    case "name":
                                                        NextString = jsonReader.nextString();
                                                        if (NextString == 0) {
                                                            C6541l.subs("Null name");
                                                            return c17358l2;
                                                        }
                                                        break;
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            if (b2 == 1 && NextString != 0 && NextString2 != 0) {
                                                c6990l = new C6990l(jNextLong, NextString, NextString2);
                                                break;
                                            } else {
                                                StringBuilder sb2 = new StringBuilder();
                                                if (NextString == 0) {
                                                    sb2.append(" name");
                                                }
                                                if (NextString2 == 0) {
                                                    sb2.append(" code");
                                                }
                                                if ((b2 & 1) == 0) {
                                                    sb2.append(" address");
                                                }
                                                C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb2));
                                                return c17358l2;
                                            }
                                            break;
                                        case "binaries":
                                            List listAmazon2 = amazon(jsonReader, new C8936l(29));
                                            Billing = Billing;
                                            r26 = listAmazon2;
                                            if (listAmazon2 == null) {
                                                C6541l.subs("Null binaries");
                                                return c17358l2;
                                            }
                                            break;
                                        case "exception":
                                            Billing = billing(jsonReader);
                                            r26 = r26;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            Billing = Billing;
                                            r26 = r26;
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (c6990l != 0 && r26 != 0) {
                                    c0139l = new C0139l(Amazon, Billing, Crashlytics, c6990l, r26);
                                    c17358l = c17358l2;
                                    break;
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    if (c6990l == 0) {
                                        sb3.append(" signal");
                                    }
                                    if (r26 == 0) {
                                        sb3.append(" binaries");
                                    }
                                    C8339l.smaato(AbstractC5020l.tapsense("Missing required properties:", sb3));
                                    return c17358l2;
                                }
                                break;
                            case "internalKeys":
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(loadAd(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList2 = DesugarCollections.unmodifiableList(arrayList2);
                                c17358l = c17358l2;
                                break;
                            case "customAttributes":
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(loadAd(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList3);
                                c17358l = c17358l2;
                                break;
                            case "uiOrientation":
                                iNextInt = jsonReader.nextInt();
                                z = true;
                                c17358l = c17358l2;
                                break;
                            case "currentProcessDetails":
                                c4702lMopub = mopub(jsonReader);
                                c17358l = c17358l2;
                                break;
                            default:
                                jsonReader.skipValue();
                                c17358l = c17358l2;
                                break;
                        }
                    }
                    break;
                case 3:
                    jsonReader.beginObject();
                    String strNextString = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals("content")) {
                            strNextString = jsonReader.nextString();
                            if (strNextString == null) {
                                C6541l.subs("Null content");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (strNextString == null) {
                        C8339l.smaato("Missing required properties: content");
                        return null;
                    }
                    c0495l.purchase = new C4473l(strNextString);
                    break;
                    break;
                case 4:
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        C6541l.subs("Null type");
                        return null;
                    }
                    c0495l.loadAd = strNextString2;
                    break;
                    break;
                case 5:
                    c0495l.yandex = jsonReader.nextLong();
                    c0495l.mopub = (byte) (c0495l.mopub | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c0495l.yandex();
    }

    public static C11091l subs(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                C11091l c11091lAdmob = admob(jsonReader);
                jsonReader.close();
                return c11091lAdmob;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    public static C7422l yandex(JsonReader jsonReader) throws IOException {
        C12580l c12580l = new C12580l();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    c12580l.amazon = jsonReader.nextLong();
                    c12580l.billing = (byte) (c12580l.billing | 2);
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        C6541l.subs("Null symbol");
                        return null;
                    }
                    c12580l.loadAd = strNextString;
                    break;
                    break;
                case "pc":
                    c12580l.yandex = jsonReader.nextLong();
                    c12580l.billing = (byte) (c12580l.billing | 1);
                    break;
                case "file":
                    c12580l.crashlytics = jsonReader.nextString();
                    break;
                case "importance":
                    c12580l.purchase = jsonReader.nextInt();
                    c12580l.billing = (byte) (c12580l.billing | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c12580l.yandex();
    }
}
