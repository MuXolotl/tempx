package io.realm.kotlin.internal.interop;

import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import defpackage.AbstractC5020l;
import defpackage.C12688l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0007¨\u0006\r"}, d2 = {"Lio/realm/kotlin/internal/interop/CoreErrorConverter;", "", "<init>", "()V", "asThrowable", "", "categoriesNativeValue", "", "errorCodeNativeValue", "messageNativeValue", "", "path", "userError", "cinterop_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CoreErrorConverter {
    public static final CoreErrorConverter INSTANCE = new CoreErrorConverter();

    private CoreErrorConverter() {
    }

    /* JADX WARN: Code duplicated, block: B:176:0x029b  */
    /* JADX WARN: Code duplicated, block: B:177:0x029f  */
    /* JADX WARN: Code duplicated, block: B:178:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:179:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:180:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:181:0x02af  */
    /* JADX WARN: Code duplicated, block: B:182:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:183:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:184:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:185:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:186:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:187:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:188:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:189:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:190:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:191:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:192:0x02db  */
    /* JADX WARN: Code duplicated, block: B:193:0x02df  */
    /* JADX WARN: Code duplicated, block: B:194:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:195:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:196:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:197:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:198:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:199:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:200:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:201:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:202:0x0303  */
    /* JADX WARN: Code duplicated, block: B:203:0x0307  */
    /* JADX WARN: Code duplicated, block: B:204:0x030b  */
    /* JADX WARN: Code duplicated, block: B:205:0x030f  */
    /* JADX WARN: Code duplicated, block: B:206:0x0313  */
    /* JADX WARN: Code duplicated, block: B:207:0x0317  */
    /* JADX WARN: Code duplicated, block: B:208:0x031b  */
    /* JADX WARN: Code duplicated, block: B:209:0x031f  */
    /* JADX WARN: Code duplicated, block: B:210:0x0323  */
    /* JADX WARN: Code duplicated, block: B:211:0x0327  */
    /* JADX WARN: Code duplicated, block: B:212:0x032b  */
    /* JADX WARN: Code duplicated, block: B:213:0x032f  */
    /* JADX WARN: Code duplicated, block: B:214:0x0333  */
    /* JADX WARN: Code duplicated, block: B:215:0x0337  */
    /* JADX WARN: Code duplicated, block: B:216:0x033b  */
    /* JADX WARN: Code duplicated, block: B:217:0x033f  */
    /* JADX WARN: Code duplicated, block: B:218:0x0343  */
    /* JADX WARN: Code duplicated, block: B:219:0x0347  */
    /* JADX WARN: Code duplicated, block: B:220:0x034b  */
    /* JADX WARN: Code duplicated, block: B:221:0x034f  */
    /* JADX WARN: Code duplicated, block: B:222:0x0353  */
    /* JADX WARN: Code duplicated, block: B:223:0x0357  */
    /* JADX WARN: Code duplicated, block: B:224:0x035b  */
    /* JADX WARN: Code duplicated, block: B:225:0x035f  */
    /* JADX WARN: Code duplicated, block: B:226:0x0363  */
    /* JADX WARN: Code duplicated, block: B:227:0x0367  */
    /* JADX WARN: Code duplicated, block: B:228:0x036b  */
    /* JADX WARN: Code duplicated, block: B:229:0x036f  */
    /* JADX WARN: Code duplicated, block: B:230:0x0373  */
    /* JADX WARN: Code duplicated, block: B:231:0x0377  */
    /* JADX WARN: Code duplicated, block: B:232:0x037b  */
    /* JADX WARN: Code duplicated, block: B:233:0x037f  */
    /* JADX WARN: Code duplicated, block: B:234:0x0383  */
    /* JADX WARN: Code duplicated, block: B:235:0x0387  */
    /* JADX WARN: Code duplicated, block: B:236:0x038b  */
    /* JADX WARN: Code duplicated, block: B:237:0x038f  */
    /* JADX WARN: Code duplicated, block: B:238:0x0393  */
    /* JADX WARN: Code duplicated, block: B:239:0x0397  */
    /* JADX WARN: Code duplicated, block: B:240:0x039b  */
    /* JADX WARN: Code duplicated, block: B:241:0x039f  */
    /* JADX WARN: Code duplicated, block: B:242:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:243:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:244:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:245:0x03af  */
    /* JADX WARN: Code duplicated, block: B:246:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:247:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:248:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:249:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:250:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:251:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:252:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:253:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:254:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:255:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:256:0x03db  */
    /* JADX WARN: Code duplicated, block: B:257:0x03df  */
    /* JADX WARN: Code duplicated, block: B:258:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:259:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:260:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:261:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:262:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:263:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:264:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:265:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:266:0x0403  */
    /* JADX WARN: Code duplicated, block: B:267:0x0407  */
    /* JADX WARN: Code duplicated, block: B:268:0x040b  */
    /* JADX WARN: Code duplicated, block: B:269:0x040f  */
    /* JADX WARN: Code duplicated, block: B:270:0x0413  */
    /* JADX WARN: Code duplicated, block: B:271:0x0417  */
    /* JADX WARN: Code duplicated, block: B:272:0x041b  */
    /* JADX WARN: Code duplicated, block: B:273:0x041f  */
    /* JADX WARN: Code duplicated, block: B:274:0x0423  */
    /* JADX WARN: Code duplicated, block: B:275:0x0427  */
    /* JADX WARN: Code duplicated, block: B:276:0x042b  */
    /* JADX WARN: Code duplicated, block: B:277:0x042f  */
    /* JADX WARN: Code duplicated, block: B:278:0x0433  */
    /* JADX WARN: Code duplicated, block: B:279:0x0437  */
    /* JADX WARN: Code duplicated, block: B:280:0x043b  */
    /* JADX WARN: Code duplicated, block: B:281:0x043f  */
    /* JADX WARN: Code duplicated, block: B:282:0x0443  */
    /* JADX WARN: Code duplicated, block: B:283:0x0447  */
    /* JADX WARN: Code duplicated, block: B:284:0x044b  */
    /* JADX WARN: Code duplicated, block: B:285:0x044f  */
    /* JADX WARN: Code duplicated, block: B:286:0x0453  */
    /* JADX WARN: Code duplicated, block: B:287:0x0457  */
    /* JADX WARN: Code duplicated, block: B:288:0x045b  */
    /* JADX WARN: Code duplicated, block: B:289:0x045f  */
    /* JADX WARN: Code duplicated, block: B:290:0x0463  */
    /* JADX WARN: Code duplicated, block: B:291:0x0467  */
    /* JADX WARN: Code duplicated, block: B:292:0x046b  */
    /* JADX WARN: Code duplicated, block: B:293:0x046f  */
    /* JADX WARN: Code duplicated, block: B:294:0x0473  */
    /* JADX WARN: Code duplicated, block: B:295:0x0477  */
    /* JADX WARN: Code duplicated, block: B:296:0x047b  */
    /* JADX WARN: Code duplicated, block: B:297:0x047f  */
    /* JADX WARN: Code duplicated, block: B:298:0x0483  */
    /* JADX WARN: Code duplicated, block: B:299:0x0487  */
    /* JADX WARN: Code duplicated, block: B:300:0x048b  */
    /* JADX WARN: Code duplicated, block: B:301:0x048f  */
    /* JADX WARN: Code duplicated, block: B:302:0x0493  */
    /* JADX WARN: Code duplicated, block: B:303:0x0497  */
    /* JADX WARN: Code duplicated, block: B:304:0x049b  */
    /* JADX WARN: Code duplicated, block: B:305:0x049f  */
    /* JADX WARN: Code duplicated, block: B:306:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:307:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:308:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:309:0x04af  */
    /* JADX WARN: Code duplicated, block: B:310:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:311:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:312:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:313:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:314:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:315:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:316:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:317:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:318:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:319:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:320:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:321:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:322:0x04db  */
    /* JADX WARN: Code duplicated, block: B:323:0x04de  */
    /* JADX WARN: Code duplicated, block: B:324:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:325:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:326:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:327:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:328:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:329:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:330:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:331:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:332:0x04f9  */
    /* JADX WARN: Code duplicated, block: B:333:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:334:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:335:0x0502  */
    /* JADX WARN: Code duplicated, block: B:336:0x0505  */
    /* JADX WARN: Code duplicated, block: B:337:0x0508  */
    /* JADX WARN: Code duplicated, block: B:338:0x050b  */
    /* JADX WARN: Code duplicated, block: B:339:0x050e  */
    /* JADX WARN: Code duplicated, block: B:342:0x0521  */
    /* JADX WARN: Code duplicated, block: B:344:0x0525  */
    /* JADX WARN: Code duplicated, block: B:346:0x052b  */
    /* JADX WARN: Code duplicated, block: B:348:0x0531  */
    /* JADX WARN: Code duplicated, block: B:350:0x0537  */
    /* JADX WARN: Code duplicated, block: B:359:0x054c A[RETURN] */
    public static final Throwable asThrowable(int categoriesNativeValue, int errorCodeNativeValue, String messageNativeValue, String path, Throwable userError) {
        String str;
        String string;
        int i;
        int i2;
        C12688l c12688l = new C12688l(categoriesNativeValue);
        int i3 = 0;
        for (int i4 : AbstractC5020l.m1673throws(163)) {
            switch (i4) {
                case 1:
                    i2 = 0;
                    break;
                case 2:
                    i2 = 1000;
                    break;
                case 3:
                    i2 = 1001;
                    break;
                case 4:
                    i2 = 1002;
                    break;
                case 5:
                    i2 = 1003;
                    break;
                case 6:
                    i2 = 1004;
                    break;
                case 7:
                    i2 = 1005;
                    break;
                case 8:
                    i2 = 1006;
                    break;
                case 9:
                    i2 = 1007;
                    break;
                case 10:
                    i2 = 1008;
                    break;
                case 11:
                    i2 = 1009;
                    break;
                case 12:
                    i2 = 1010;
                    break;
                case 13:
                    i2 = 1011;
                    break;
                case 14:
                    i2 = 1012;
                    break;
                case 15:
                    i2 = 1013;
                    break;
                case 16:
                    i2 = 1014;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    i2 = 1015;
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    i2 = 1016;
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    i2 = 1017;
                    break;
                case 20:
                    i2 = 1018;
                    break;
                case 21:
                    i2 = 1019;
                    break;
                case 22:
                    i2 = 1020;
                    break;
                case 23:
                    i2 = 1021;
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                    i2 = 1022;
                    break;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    i2 = 1023;
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    i2 = 1024;
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    i2 = 1025;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    i2 = 1026;
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    i2 = 1027;
                    break;
                case 30:
                    i2 = 1028;
                    break;
                case 31:
                    i2 = 1029;
                    break;
                case 32:
                    i2 = 1030;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    i2 = 1031;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    i2 = 1032;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    i2 = 1033;
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    i2 = 1034;
                    break;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    i2 = 1035;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    i2 = 1036;
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    i2 = 1037;
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    i2 = 1038;
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    i2 = 1039;
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    i2 = 1040;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    i2 = 1041;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    i2 = 1042;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    i2 = 1043;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    i2 = 1044;
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    i2 = 1045;
                    break;
                case 48:
                    i2 = 1046;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    i2 = 1999;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    i2 = 2000;
                    break;
                case 51:
                    i2 = 2001;
                    break;
                case 52:
                    i2 = 2002;
                    break;
                case 53:
                    i2 = 2003;
                    break;
                case 54:
                    i2 = 2004;
                    break;
                case 55:
                    i2 = 2005;
                    break;
                case 56:
                    i2 = 2006;
                    break;
                case 57:
                    i2 = 2007;
                    break;
                case 58:
                    i2 = 2008;
                    break;
                case 59:
                    i2 = 2009;
                    break;
                case 60:
                    i2 = 2010;
                    break;
                case 61:
                    i2 = 2011;
                    break;
                case 62:
                    i2 = 2012;
                    break;
                case 63:
                    i2 = 2013;
                    break;
                case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                    i2 = 2014;
                    break;
                case 65:
                    i2 = 2015;
                    break;
                case 66:
                    i2 = 2016;
                    break;
                case 67:
                    i2 = 2017;
                    break;
                case 68:
                    i2 = 2018;
                    break;
                case 69:
                    i2 = 2019;
                    break;
                case 70:
                    i2 = 2020;
                    break;
                case 71:
                    i2 = 2021;
                    break;
                case 72:
                    i2 = 3000;
                    break;
                case 73:
                    i2 = 3001;
                    break;
                case 74:
                    i2 = 3002;
                    break;
                case 75:
                    i2 = 3003;
                    break;
                case 76:
                    i2 = 3004;
                    break;
                case 77:
                    i2 = 3005;
                    break;
                case 78:
                    i2 = 3006;
                    break;
                case 79:
                    i2 = 3007;
                    break;
                case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                    i2 = 3008;
                    break;
                case 81:
                    i2 = 3009;
                    break;
                case 82:
                    i2 = 3010;
                    break;
                case 83:
                    i2 = 3011;
                    break;
                case 84:
                    i2 = 3012;
                    break;
                case 85:
                    i2 = 3013;
                    break;
                case 86:
                    i2 = 3014;
                    break;
                case 87:
                    i2 = 3015;
                    break;
                case 88:
                    i2 = 3016;
                    break;
                case 89:
                    i2 = 3017;
                    break;
                case 90:
                    i2 = 3018;
                    break;
                case 91:
                    i2 = 3019;
                    break;
                case 92:
                    i2 = 3020;
                    break;
                case 93:
                    i2 = 3021;
                    break;
                case 94:
                    i2 = 3022;
                    break;
                case 95:
                    i2 = 3023;
                    break;
                case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                    i2 = 4000;
                    break;
                case 97:
                    i2 = 4100;
                    break;
                case 98:
                    i2 = 4101;
                    break;
                case 99:
                    i2 = 4103;
                    break;
                case 100:
                    i2 = 4104;
                    break;
                case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                    i2 = 4105;
                    break;
                case 102:
                    i2 = 4200;
                    break;
                case 103:
                    i2 = 4201;
                    break;
                case 104:
                    i2 = 4202;
                    break;
                case 105:
                    i2 = 4203;
                    break;
                case 106:
                    i2 = 4300;
                    break;
                case 107:
                    i2 = 4301;
                    break;
                case 108:
                    i2 = 4302;
                    break;
                case 109:
                    i2 = 4303;
                    break;
                case 110:
                    i2 = 4304;
                    break;
                case 111:
                    i2 = 4305;
                    break;
                case 112:
                    i2 = 4306;
                    break;
                case 113:
                    i2 = 4307;
                    break;
                case 114:
                    i2 = 4308;
                    break;
                case 115:
                    i2 = 4309;
                    break;
                case 116:
                    i2 = 4310;
                    break;
                case 117:
                    i2 = 4311;
                    break;
                case 118:
                    i2 = 4312;
                    break;
                case 119:
                    i2 = 4313;
                    break;
                case 120:
                    i2 = 4314;
                    break;
                case 121:
                    i2 = 4315;
                    break;
                case 122:
                    i2 = 4316;
                    break;
                case 123:
                    i2 = 4317;
                    break;
                case 124:
                    i2 = 4318;
                    break;
                case 125:
                    i2 = 4319;
                    break;
                case 126:
                    i2 = 4320;
                    break;
                case 127:
                    i2 = 4321;
                    break;
                case 128:
                    i2 = 4322;
                    break;
                case 129:
                    i2 = 4323;
                    break;
                case 130:
                    i2 = 4324;
                    break;
                case 131:
                    i2 = 4325;
                    break;
                case 132:
                    i2 = 4326;
                    break;
                case 133:
                    i2 = 4327;
                    break;
                case 134:
                    i2 = 4328;
                    break;
                case 135:
                    i2 = 4329;
                    break;
                case 136:
                    i2 = 4330;
                    break;
                case 137:
                    i2 = 4331;
                    break;
                case 138:
                    i2 = 4332;
                    break;
                case 139:
                    i2 = 4333;
                    break;
                case 140:
                    i2 = 4334;
                    break;
                case 141:
                    i2 = 4335;
                    break;
                case 142:
                    i2 = 4336;
                    break;
                case 143:
                    i2 = 4337;
                    break;
                case 144:
                    i2 = 4338;
                    break;
                case 145:
                    i2 = 4339;
                    break;
                case 146:
                    i2 = 4340;
                    break;
                case 147:
                    i2 = 4341;
                    break;
                case 148:
                    i2 = 4342;
                    break;
                case 149:
                    i2 = 4343;
                    break;
                case 150:
                    i2 = 4344;
                    break;
                case 151:
                    i2 = 4345;
                    break;
                case 152:
                    i2 = 4346;
                    break;
                case 153:
                    i2 = 4347;
                    break;
                case 154:
                    i2 = 4348;
                    break;
                case 155:
                    i2 = 4349;
                    break;
                case 156:
                    i2 = 4350;
                    break;
                case 157:
                    i2 = 4351;
                    break;
                case 158:
                    i2 = 4352;
                    break;
                case 159:
                    i2 = 4353;
                    break;
                case 160:
                    i2 = 4354;
                    break;
                case 161:
                    i2 = 4355;
                    break;
                case 162:
                    i2 = 1000000;
                    break;
                case 163:
                    i2 = 2000000;
                    break;
                default:
                    throw null;
            }
            if (i2 == errorCodeNativeValue) {
                i3 = i4;
                StringBuilder sb = new StringBuilder("[");
                switch (i3) {
                    case 1:
                        str = "RLM_ERR_NONE";
                        break;
                    case 2:
                        str = "RLM_ERR_RUNTIME";
                        break;
                    case 3:
                        str = "RLM_ERR_RANGE_ERROR";
                        break;
                    case 4:
                        str = "RLM_ERR_BROKEN_INVARIANT";
                        break;
                    case 5:
                        str = "RLM_ERR_OUT_OF_MEMORY";
                        break;
                    case 6:
                        str = "RLM_ERR_OUT_OF_DISK_SPACE";
                        break;
                    case 7:
                        str = "RLM_ERR_ADDRESS_SPACE_EXHAUSTED";
                        break;
                    case 8:
                        str = "RLM_ERR_MAXIMUM_FILE_SIZE_EXCEEDED";
                        break;
                    case 9:
                        str = "RLM_ERR_INCOMPATIBLE_SESSION";
                        break;
                    case 10:
                        str = "RLM_ERR_INCOMPATIBLE_LOCK_FILE";
                        break;
                    case 11:
                        str = "RLM_ERR_INVALID_QUERY";
                        break;
                    case 12:
                        str = "RLM_ERR_BAD_VERSION";
                        break;
                    case 13:
                        str = "RLM_ERR_UNSUPPORTED_FILE_FORMAT_VERSION";
                        break;
                    case 14:
                        str = "RLM_ERR_MULTIPLE_SYNC_AGENTS";
                        break;
                    case 15:
                        str = "RLM_ERR_OBJECT_ALREADY_EXISTS";
                        break;
                    case 16:
                        str = "RLM_ERR_NOT_CLONABLE";
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        str = "RLM_ERR_BAD_CHANGESET";
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        str = "RLM_ERR_SUBSCRIPTION_FAILED";
                        break;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        str = "RLM_ERR_FILE_OPERATION_FAILED";
                        break;
                    case 20:
                        str = "RLM_ERR_FILE_PERMISSION_DENIED";
                        break;
                    case 21:
                        str = "RLM_ERR_FILE_NOT_FOUND";
                        break;
                    case 22:
                        str = "RLM_ERR_FILE_ALREADY_EXISTS";
                        break;
                    case 23:
                        str = "RLM_ERR_INVALID_DATABASE";
                        break;
                    case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        str = "RLM_ERR_DECRYPTION_FAILED";
                        break;
                    case Maneuver.TYPE_FORK_LEFT /* 25 */:
                        str = "RLM_ERR_INCOMPATIBLE_HISTORIES";
                        break;
                    case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                        str = "RLM_ERR_FILE_FORMAT_UPGRADE_REQUIRED";
                        break;
                    case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                        str = "RLM_ERR_SCHEMA_VERSION_MISMATCH";
                        break;
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        str = "RLM_ERR_NO_SUBSCRIPTION_FOR_WRITE";
                        break;
                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                        str = "RLM_ERR_OPERATION_ABORTED";
                        break;
                    case 30:
                        str = "RLM_ERR_AUTO_CLIENT_RESET_FAILED";
                        break;
                    case 31:
                        str = "RLM_ERR_BAD_SYNC_PARTITION_VALUE";
                        break;
                    case 32:
                        str = "RLM_ERR_CONNECTION_CLOSED";
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                        str = "RLM_ERR_INVALID_SUBSCRIPTION_QUERY";
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                        str = "RLM_ERR_SYNC_CLIENT_RESET_REQUIRED";
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                        str = "RLM_ERR_SYNC_COMPENSATING_WRITE";
                        break;
                    case Maneuver.TYPE_STRAIGHT /* 36 */:
                        str = "RLM_ERR_SYNC_CONNECT_FAILED";
                        break;
                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                        str = "RLM_ERR_SYNC_CONNECT_TIMEOUT";
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                        str = "RLM_ERR_SYNC_INVALID_SCHEMA_CHANGE";
                        break;
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                        str = "RLM_ERR_SYNC_PERMISSION_DENIED";
                        break;
                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                        str = "RLM_ERR_SYNC_PROTOCOL_INVARIANT_FAILED";
                        break;
                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                        str = "RLM_ERR_SYNC_PROTOCOL_NEGOTIATION_FAILED";
                        break;
                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                        str = "RLM_ERR_SYNC_SERVER_PERMISSIONS_CHANGED";
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                        str = "RLM_ERR_SYNC_USER_MISMATCH";
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                        str = "RLM_ERR_TLS_HANDSHAKE_FAILED";
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                        str = "RLM_ERR_WRONG_SYNC_TYPE";
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                        str = "RLM_ERR_SYNC_WRITE_NOT_ALLOWED";
                        break;
                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                        str = "RLM_ERR_SYNC_LOCAL_CLOCK_BEFORE_EPOCH";
                        break;
                    case 48:
                        str = "RLM_ERR_SYNC_SCHEMA_MIGRATION_ERROR";
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                        str = "RLM_ERR_SYSTEM_ERROR";
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        str = "RLM_ERR_LOGIC";
                        break;
                    case 51:
                        str = "RLM_ERR_NOT_SUPPORTED";
                        break;
                    case 52:
                        str = "RLM_ERR_BROKEN_PROMISE";
                        break;
                    case 53:
                        str = "RLM_ERR_CROSS_TABLE_LINK_TARGET";
                        break;
                    case 54:
                        str = "RLM_ERR_KEY_ALREADY_USED";
                        break;
                    case 55:
                        str = "RLM_ERR_WRONG_TRANSACTION_STATE";
                        break;
                    case 56:
                        str = "RLM_ERR_WRONG_THREAD";
                        break;
                    case 57:
                        str = "RLM_ERR_ILLEGAL_OPERATION";
                        break;
                    case 58:
                        str = "RLM_ERR_SERIALIZATION_ERROR";
                        break;
                    case 59:
                        str = "RLM_ERR_STALE_ACCESSOR";
                        break;
                    case 60:
                        str = "RLM_ERR_INVALIDATED_OBJECT";
                        break;
                    case 61:
                        str = "RLM_ERR_READ_ONLY_DB";
                        break;
                    case 62:
                        str = "RLM_ERR_DELETE_OPENED_REALM";
                        break;
                    case 63:
                        str = "RLM_ERR_MISMATCHED_CONFIG";
                        break;
                    case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                        str = "RLM_ERR_CLOSED_REALM";
                        break;
                    case 65:
                        str = "RLM_ERR_INVALID_TABLE_REF";
                        break;
                    case 66:
                        str = "RLM_ERR_SCHEMA_VALIDATION_FAILED";
                        break;
                    case 67:
                        str = "RLM_ERR_SCHEMA_MISMATCH";
                        break;
                    case 68:
                        str = "RLM_ERR_INVALID_SCHEMA_VERSION";
                        break;
                    case 69:
                        str = "RLM_ERR_INVALID_SCHEMA_CHANGE";
                        break;
                    case 70:
                        str = "RLM_ERR_MIGRATION_FAILED";
                        break;
                    case 71:
                        str = "RLM_ERR_TOP_LEVEL_OBJECT";
                        break;
                    case 72:
                        str = "RLM_ERR_INVALID_ARGUMENT";
                        break;
                    case 73:
                        str = "RLM_ERR_PROPERTY_TYPE_MISMATCH";
                        break;
                    case 74:
                        str = "RLM_ERR_PROPERTY_NOT_NULLABLE";
                        break;
                    case 75:
                        str = "RLM_ERR_READ_ONLY_PROPERTY";
                        break;
                    case 76:
                        str = "RLM_ERR_MISSING_PROPERTY_VALUE";
                        break;
                    case 77:
                        str = "RLM_ERR_MISSING_PRIMARY_KEY";
                        break;
                    case 78:
                        str = "RLM_ERR_UNEXPECTED_PRIMARY_KEY";
                        break;
                    case 79:
                        str = "RLM_ERR_MODIFY_PRIMARY_KEY";
                        break;
                    case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                        str = "RLM_ERR_INVALID_QUERY_STRING";
                        break;
                    case 81:
                        str = "RLM_ERR_INVALID_PROPERTY";
                        break;
                    case 82:
                        str = "RLM_ERR_INVALID_NAME";
                        break;
                    case 83:
                        str = "RLM_ERR_INVALID_DICTIONARY_KEY";
                        break;
                    case 84:
                        str = "RLM_ERR_INVALID_DICTIONARY_VALUE";
                        break;
                    case 85:
                        str = "RLM_ERR_INVALID_SORT_DESCRIPTOR";
                        break;
                    case 86:
                        str = "RLM_ERR_INVALID_ENCRYPTION_KEY";
                        break;
                    case 87:
                        str = "RLM_ERR_INVALID_QUERY_ARG";
                        break;
                    case 88:
                        str = "RLM_ERR_NO_SUCH_OBJECT";
                        break;
                    case 89:
                        str = "RLM_ERR_INDEX_OUT_OF_BOUNDS";
                        break;
                    case 90:
                        str = "RLM_ERR_LIMIT_EXCEEDED";
                        break;
                    case 91:
                        str = "RLM_ERR_OBJECT_TYPE_MISMATCH";
                        break;
                    case 92:
                        str = "RLM_ERR_NO_SUCH_TABLE";
                        break;
                    case 93:
                        str = "RLM_ERR_TABLE_NAME_IN_USE";
                        break;
                    case 94:
                        str = "RLM_ERR_ILLEGAL_COMBINATION";
                        break;
                    case 95:
                        str = "RLM_ERR_BAD_SERVER_URL";
                        break;
                    case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                        str = "RLM_ERR_CUSTOM_ERROR";
                        break;
                    case 97:
                        str = "RLM_ERR_CLIENT_USER_NOT_FOUND";
                        break;
                    case 98:
                        str = "RLM_ERR_CLIENT_USER_NOT_LOGGED_IN";
                        break;
                    case 99:
                        str = "RLM_ERR_CLIENT_REDIRECT_ERROR";
                        break;
                    case 100:
                        str = "RLM_ERR_CLIENT_TOO_MANY_REDIRECTS";
                        break;
                    case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                        str = "RLM_ERR_CLIENT_USER_ALREADY_NAMED";
                        break;
                    case 102:
                        str = "RLM_ERR_BAD_TOKEN";
                        break;
                    case 103:
                        str = "RLM_ERR_MALFORMED_JSON";
                        break;
                    case 104:
                        str = "RLM_ERR_MISSING_JSON_KEY";
                        break;
                    case 105:
                        str = "RLM_ERR_BAD_BSON_PARSE";
                        break;
                    case 106:
                        str = "RLM_ERR_MISSING_AUTH_REQ";
                        break;
                    case 107:
                        str = "RLM_ERR_INVALID_SESSION";
                        break;
                    case 108:
                        str = "RLM_ERR_USER_APP_DOMAIN_MISMATCH";
                        break;
                    case 109:
                        str = "RLM_ERR_DOMAIN_NOT_ALLOWED";
                        break;
                    case 110:
                        str = "RLM_ERR_READ_SIZE_LIMIT_EXCEEDED";
                        break;
                    case 111:
                        str = "RLM_ERR_INVALID_PARAMETER";
                        break;
                    case 112:
                        str = "RLM_ERR_MISSING_PARAMETER";
                        break;
                    case 113:
                        str = "RLM_ERR_TWILIO_ERROR";
                        break;
                    case 114:
                        str = "RLM_ERR_GCM_ERROR";
                        break;
                    case 115:
                        str = "RLM_ERR_HTTP_ERROR";
                        break;
                    case 116:
                        str = "RLM_ERR_AWS_ERROR";
                        break;
                    case 117:
                        str = "RLM_ERR_MONGODB_ERROR";
                        break;
                    case 118:
                        str = "RLM_ERR_ARGUMENTS_NOT_ALLOWED";
                        break;
                    case 119:
                        str = "RLM_ERR_FUNCTION_EXECUTION_ERROR";
                        break;
                    case 120:
                        str = "RLM_ERR_NO_MATCHING_RULE";
                        break;
                    case 121:
                        str = "RLM_ERR_INTERNAL_SERVER_ERROR";
                        break;
                    case 122:
                        str = "RLM_ERR_AUTH_PROVIDER_NOT_FOUND";
                        break;
                    case 123:
                        str = "RLM_ERR_AUTH_PROVIDER_ALREADY_EXISTS";
                        break;
                    case 124:
                        str = "RLM_ERR_SERVICE_NOT_FOUND";
                        break;
                    case 125:
                        str = "RLM_ERR_SERVICE_TYPE_NOT_FOUND";
                        break;
                    case 126:
                        str = "RLM_ERR_SERVICE_ALREADY_EXISTS";
                        break;
                    case 127:
                        str = "RLM_ERR_SERVICE_COMMAND_NOT_FOUND";
                        break;
                    case 128:
                        str = "RLM_ERR_VALUE_NOT_FOUND";
                        break;
                    case 129:
                        str = "RLM_ERR_VALUE_ALREADY_EXISTS";
                        break;
                    case 130:
                        str = "RLM_ERR_VALUE_DUPLICATE_NAME";
                        break;
                    case 131:
                        str = "RLM_ERR_FUNCTION_NOT_FOUND";
                        break;
                    case 132:
                        str = "RLM_ERR_FUNCTION_ALREADY_EXISTS";
                        break;
                    case 133:
                        str = "RLM_ERR_FUNCTION_DUPLICATE_NAME";
                        break;
                    case 134:
                        str = "RLM_ERR_FUNCTION_SYNTAX_ERROR";
                        break;
                    case 135:
                        str = "RLM_ERR_FUNCTION_INVALID";
                        break;
                    case 136:
                        str = "RLM_ERR_INCOMING_WEBHOOK_NOT_FOUND";
                        break;
                    case 137:
                        str = "RLM_ERR_INCOMING_WEBHOOK_ALREADY_EXISTS";
                        break;
                    case 138:
                        str = "RLM_ERR_INCOMING_WEBHOOK_DUPLICATE_NAME";
                        break;
                    case 139:
                        str = "RLM_ERR_RULE_NOT_FOUND";
                        break;
                    case 140:
                        str = "RLM_ERR_API_KEY_NOT_FOUND";
                        break;
                    case 141:
                        str = "RLM_ERR_RULE_ALREADY_EXISTS";
                        break;
                    case 142:
                        str = "RLM_ERR_RULE_DUPLICATE_NAME";
                        break;
                    case 143:
                        str = "RLM_ERR_AUTH_PROVIDER_DUPLICATE_NAME";
                        break;
                    case 144:
                        str = "RLM_ERR_RESTRICTED_HOST";
                        break;
                    case 145:
                        str = "RLM_ERR_API_KEY_ALREADY_EXISTS";
                        break;
                    case 146:
                        str = "RLM_ERR_INCOMING_WEBHOOK_AUTH_FAILED";
                        break;
                    case 147:
                        str = "RLM_ERR_EXECUTION_TIME_LIMIT_EXCEEDED";
                        break;
                    case 148:
                        str = "RLM_ERR_NOT_CALLABLE";
                        break;
                    case 149:
                        str = "RLM_ERR_USER_ALREADY_CONFIRMED";
                        break;
                    case 150:
                        str = "RLM_ERR_USER_NOT_FOUND";
                        break;
                    case 151:
                        str = "RLM_ERR_USER_DISABLED";
                        break;
                    case 152:
                        str = "RLM_ERR_AUTH_ERROR";
                        break;
                    case 153:
                        str = "RLM_ERR_BAD_REQUEST";
                        break;
                    case 154:
                        str = "RLM_ERR_ACCOUNT_NAME_IN_USE";
                        break;
                    case 155:
                        str = "RLM_ERR_INVALID_PASSWORD";
                        break;
                    case 156:
                        str = "RLM_ERR_SCHEMA_VALIDATION_FAILED_WRITE";
                        break;
                    case 157:
                        str = "RLM_ERR_APP_UNKNOWN";
                        break;
                    case 158:
                        str = "RLM_ERR_MAINTENANCE_IN_PROGRESS";
                        break;
                    case 159:
                        str = "RLM_ERR_USERPASS_TOKEN_INVALID";
                        break;
                    case 160:
                        str = "RLM_ERR_INVALID_SERVER_RESPONSE";
                        break;
                    case 161:
                        str = "RLM_ERR_APP_SERVER_ERROR";
                        break;
                    case 162:
                        str = "RLM_ERR_CALLBACK";
                        break;
                    case 163:
                        str = "RLM_ERR_UNKNOWN";
                        break;
                    default:
                        str = "null";
                        break;
                }
                sb.append(str);
                sb.append("]: ");
                sb.append(messageNativeValue);
                string = sb.toString();
                if (userError == null) {
                    return userError;
                }
                if (89 == i3) {
                    return new IndexOutOfBoundsException(string);
                }
                i = c12688l.yandex;
                if ((i & 8) != 0) {
                    return new IllegalArgumentException(string);
                }
                return ((i & 2) == 0 && (i & 4) == 0) ? new Error(string) : new IllegalStateException(string);
            }
        }
        StringBuilder sb2 = new StringBuilder("[");
        switch (i3) {
            case 1:
                str = "RLM_ERR_NONE";
                break;
            case 2:
                str = "RLM_ERR_RUNTIME";
                break;
            case 3:
                str = "RLM_ERR_RANGE_ERROR";
                break;
            case 4:
                str = "RLM_ERR_BROKEN_INVARIANT";
                break;
            case 5:
                str = "RLM_ERR_OUT_OF_MEMORY";
                break;
            case 6:
                str = "RLM_ERR_OUT_OF_DISK_SPACE";
                break;
            case 7:
                str = "RLM_ERR_ADDRESS_SPACE_EXHAUSTED";
                break;
            case 8:
                str = "RLM_ERR_MAXIMUM_FILE_SIZE_EXCEEDED";
                break;
            case 9:
                str = "RLM_ERR_INCOMPATIBLE_SESSION";
                break;
            case 10:
                str = "RLM_ERR_INCOMPATIBLE_LOCK_FILE";
                break;
            case 11:
                str = "RLM_ERR_INVALID_QUERY";
                break;
            case 12:
                str = "RLM_ERR_BAD_VERSION";
                break;
            case 13:
                str = "RLM_ERR_UNSUPPORTED_FILE_FORMAT_VERSION";
                break;
            case 14:
                str = "RLM_ERR_MULTIPLE_SYNC_AGENTS";
                break;
            case 15:
                str = "RLM_ERR_OBJECT_ALREADY_EXISTS";
                break;
            case 16:
                str = "RLM_ERR_NOT_CLONABLE";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                str = "RLM_ERR_BAD_CHANGESET";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                str = "RLM_ERR_SUBSCRIPTION_FAILED";
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                str = "RLM_ERR_FILE_OPERATION_FAILED";
                break;
            case 20:
                str = "RLM_ERR_FILE_PERMISSION_DENIED";
                break;
            case 21:
                str = "RLM_ERR_FILE_NOT_FOUND";
                break;
            case 22:
                str = "RLM_ERR_FILE_ALREADY_EXISTS";
                break;
            case 23:
                str = "RLM_ERR_INVALID_DATABASE";
                break;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                str = "RLM_ERR_DECRYPTION_FAILED";
                break;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                str = "RLM_ERR_INCOMPATIBLE_HISTORIES";
                break;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                str = "RLM_ERR_FILE_FORMAT_UPGRADE_REQUIRED";
                break;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                str = "RLM_ERR_SCHEMA_VERSION_MISMATCH";
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                str = "RLM_ERR_NO_SUBSCRIPTION_FOR_WRITE";
                break;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                str = "RLM_ERR_OPERATION_ABORTED";
                break;
            case 30:
                str = "RLM_ERR_AUTO_CLIENT_RESET_FAILED";
                break;
            case 31:
                str = "RLM_ERR_BAD_SYNC_PARTITION_VALUE";
                break;
            case 32:
                str = "RLM_ERR_CONNECTION_CLOSED";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                str = "RLM_ERR_INVALID_SUBSCRIPTION_QUERY";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                str = "RLM_ERR_SYNC_CLIENT_RESET_REQUIRED";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                str = "RLM_ERR_SYNC_COMPENSATING_WRITE";
                break;
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                str = "RLM_ERR_SYNC_CONNECT_FAILED";
                break;
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                str = "RLM_ERR_SYNC_CONNECT_TIMEOUT";
                break;
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                str = "RLM_ERR_SYNC_INVALID_SCHEMA_CHANGE";
                break;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                str = "RLM_ERR_SYNC_PERMISSION_DENIED";
                break;
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                str = "RLM_ERR_SYNC_PROTOCOL_INVARIANT_FAILED";
                break;
            case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                str = "RLM_ERR_SYNC_PROTOCOL_NEGOTIATION_FAILED";
                break;
            case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                str = "RLM_ERR_SYNC_SERVER_PERMISSIONS_CHANGED";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                str = "RLM_ERR_SYNC_USER_MISMATCH";
                break;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                str = "RLM_ERR_TLS_HANDSHAKE_FAILED";
                break;
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                str = "RLM_ERR_WRONG_SYNC_TYPE";
                break;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                str = "RLM_ERR_SYNC_WRITE_NOT_ALLOWED";
                break;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                str = "RLM_ERR_SYNC_LOCAL_CLOCK_BEFORE_EPOCH";
                break;
            case 48:
                str = "RLM_ERR_SYNC_SCHEMA_MIGRATION_ERROR";
                break;
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                str = "RLM_ERR_SYSTEM_ERROR";
                break;
            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                str = "RLM_ERR_LOGIC";
                break;
            case 51:
                str = "RLM_ERR_NOT_SUPPORTED";
                break;
            case 52:
                str = "RLM_ERR_BROKEN_PROMISE";
                break;
            case 53:
                str = "RLM_ERR_CROSS_TABLE_LINK_TARGET";
                break;
            case 54:
                str = "RLM_ERR_KEY_ALREADY_USED";
                break;
            case 55:
                str = "RLM_ERR_WRONG_TRANSACTION_STATE";
                break;
            case 56:
                str = "RLM_ERR_WRONG_THREAD";
                break;
            case 57:
                str = "RLM_ERR_ILLEGAL_OPERATION";
                break;
            case 58:
                str = "RLM_ERR_SERIALIZATION_ERROR";
                break;
            case 59:
                str = "RLM_ERR_STALE_ACCESSOR";
                break;
            case 60:
                str = "RLM_ERR_INVALIDATED_OBJECT";
                break;
            case 61:
                str = "RLM_ERR_READ_ONLY_DB";
                break;
            case 62:
                str = "RLM_ERR_DELETE_OPENED_REALM";
                break;
            case 63:
                str = "RLM_ERR_MISMATCHED_CONFIG";
                break;
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                str = "RLM_ERR_CLOSED_REALM";
                break;
            case 65:
                str = "RLM_ERR_INVALID_TABLE_REF";
                break;
            case 66:
                str = "RLM_ERR_SCHEMA_VALIDATION_FAILED";
                break;
            case 67:
                str = "RLM_ERR_SCHEMA_MISMATCH";
                break;
            case 68:
                str = "RLM_ERR_INVALID_SCHEMA_VERSION";
                break;
            case 69:
                str = "RLM_ERR_INVALID_SCHEMA_CHANGE";
                break;
            case 70:
                str = "RLM_ERR_MIGRATION_FAILED";
                break;
            case 71:
                str = "RLM_ERR_TOP_LEVEL_OBJECT";
                break;
            case 72:
                str = "RLM_ERR_INVALID_ARGUMENT";
                break;
            case 73:
                str = "RLM_ERR_PROPERTY_TYPE_MISMATCH";
                break;
            case 74:
                str = "RLM_ERR_PROPERTY_NOT_NULLABLE";
                break;
            case 75:
                str = "RLM_ERR_READ_ONLY_PROPERTY";
                break;
            case 76:
                str = "RLM_ERR_MISSING_PROPERTY_VALUE";
                break;
            case 77:
                str = "RLM_ERR_MISSING_PRIMARY_KEY";
                break;
            case 78:
                str = "RLM_ERR_UNEXPECTED_PRIMARY_KEY";
                break;
            case 79:
                str = "RLM_ERR_MODIFY_PRIMARY_KEY";
                break;
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                str = "RLM_ERR_INVALID_QUERY_STRING";
                break;
            case 81:
                str = "RLM_ERR_INVALID_PROPERTY";
                break;
            case 82:
                str = "RLM_ERR_INVALID_NAME";
                break;
            case 83:
                str = "RLM_ERR_INVALID_DICTIONARY_KEY";
                break;
            case 84:
                str = "RLM_ERR_INVALID_DICTIONARY_VALUE";
                break;
            case 85:
                str = "RLM_ERR_INVALID_SORT_DESCRIPTOR";
                break;
            case 86:
                str = "RLM_ERR_INVALID_ENCRYPTION_KEY";
                break;
            case 87:
                str = "RLM_ERR_INVALID_QUERY_ARG";
                break;
            case 88:
                str = "RLM_ERR_NO_SUCH_OBJECT";
                break;
            case 89:
                str = "RLM_ERR_INDEX_OUT_OF_BOUNDS";
                break;
            case 90:
                str = "RLM_ERR_LIMIT_EXCEEDED";
                break;
            case 91:
                str = "RLM_ERR_OBJECT_TYPE_MISMATCH";
                break;
            case 92:
                str = "RLM_ERR_NO_SUCH_TABLE";
                break;
            case 93:
                str = "RLM_ERR_TABLE_NAME_IN_USE";
                break;
            case 94:
                str = "RLM_ERR_ILLEGAL_COMBINATION";
                break;
            case 95:
                str = "RLM_ERR_BAD_SERVER_URL";
                break;
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                str = "RLM_ERR_CUSTOM_ERROR";
                break;
            case 97:
                str = "RLM_ERR_CLIENT_USER_NOT_FOUND";
                break;
            case 98:
                str = "RLM_ERR_CLIENT_USER_NOT_LOGGED_IN";
                break;
            case 99:
                str = "RLM_ERR_CLIENT_REDIRECT_ERROR";
                break;
            case 100:
                str = "RLM_ERR_CLIENT_TOO_MANY_REDIRECTS";
                break;
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                str = "RLM_ERR_CLIENT_USER_ALREADY_NAMED";
                break;
            case 102:
                str = "RLM_ERR_BAD_TOKEN";
                break;
            case 103:
                str = "RLM_ERR_MALFORMED_JSON";
                break;
            case 104:
                str = "RLM_ERR_MISSING_JSON_KEY";
                break;
            case 105:
                str = "RLM_ERR_BAD_BSON_PARSE";
                break;
            case 106:
                str = "RLM_ERR_MISSING_AUTH_REQ";
                break;
            case 107:
                str = "RLM_ERR_INVALID_SESSION";
                break;
            case 108:
                str = "RLM_ERR_USER_APP_DOMAIN_MISMATCH";
                break;
            case 109:
                str = "RLM_ERR_DOMAIN_NOT_ALLOWED";
                break;
            case 110:
                str = "RLM_ERR_READ_SIZE_LIMIT_EXCEEDED";
                break;
            case 111:
                str = "RLM_ERR_INVALID_PARAMETER";
                break;
            case 112:
                str = "RLM_ERR_MISSING_PARAMETER";
                break;
            case 113:
                str = "RLM_ERR_TWILIO_ERROR";
                break;
            case 114:
                str = "RLM_ERR_GCM_ERROR";
                break;
            case 115:
                str = "RLM_ERR_HTTP_ERROR";
                break;
            case 116:
                str = "RLM_ERR_AWS_ERROR";
                break;
            case 117:
                str = "RLM_ERR_MONGODB_ERROR";
                break;
            case 118:
                str = "RLM_ERR_ARGUMENTS_NOT_ALLOWED";
                break;
            case 119:
                str = "RLM_ERR_FUNCTION_EXECUTION_ERROR";
                break;
            case 120:
                str = "RLM_ERR_NO_MATCHING_RULE";
                break;
            case 121:
                str = "RLM_ERR_INTERNAL_SERVER_ERROR";
                break;
            case 122:
                str = "RLM_ERR_AUTH_PROVIDER_NOT_FOUND";
                break;
            case 123:
                str = "RLM_ERR_AUTH_PROVIDER_ALREADY_EXISTS";
                break;
            case 124:
                str = "RLM_ERR_SERVICE_NOT_FOUND";
                break;
            case 125:
                str = "RLM_ERR_SERVICE_TYPE_NOT_FOUND";
                break;
            case 126:
                str = "RLM_ERR_SERVICE_ALREADY_EXISTS";
                break;
            case 127:
                str = "RLM_ERR_SERVICE_COMMAND_NOT_FOUND";
                break;
            case 128:
                str = "RLM_ERR_VALUE_NOT_FOUND";
                break;
            case 129:
                str = "RLM_ERR_VALUE_ALREADY_EXISTS";
                break;
            case 130:
                str = "RLM_ERR_VALUE_DUPLICATE_NAME";
                break;
            case 131:
                str = "RLM_ERR_FUNCTION_NOT_FOUND";
                break;
            case 132:
                str = "RLM_ERR_FUNCTION_ALREADY_EXISTS";
                break;
            case 133:
                str = "RLM_ERR_FUNCTION_DUPLICATE_NAME";
                break;
            case 134:
                str = "RLM_ERR_FUNCTION_SYNTAX_ERROR";
                break;
            case 135:
                str = "RLM_ERR_FUNCTION_INVALID";
                break;
            case 136:
                str = "RLM_ERR_INCOMING_WEBHOOK_NOT_FOUND";
                break;
            case 137:
                str = "RLM_ERR_INCOMING_WEBHOOK_ALREADY_EXISTS";
                break;
            case 138:
                str = "RLM_ERR_INCOMING_WEBHOOK_DUPLICATE_NAME";
                break;
            case 139:
                str = "RLM_ERR_RULE_NOT_FOUND";
                break;
            case 140:
                str = "RLM_ERR_API_KEY_NOT_FOUND";
                break;
            case 141:
                str = "RLM_ERR_RULE_ALREADY_EXISTS";
                break;
            case 142:
                str = "RLM_ERR_RULE_DUPLICATE_NAME";
                break;
            case 143:
                str = "RLM_ERR_AUTH_PROVIDER_DUPLICATE_NAME";
                break;
            case 144:
                str = "RLM_ERR_RESTRICTED_HOST";
                break;
            case 145:
                str = "RLM_ERR_API_KEY_ALREADY_EXISTS";
                break;
            case 146:
                str = "RLM_ERR_INCOMING_WEBHOOK_AUTH_FAILED";
                break;
            case 147:
                str = "RLM_ERR_EXECUTION_TIME_LIMIT_EXCEEDED";
                break;
            case 148:
                str = "RLM_ERR_NOT_CALLABLE";
                break;
            case 149:
                str = "RLM_ERR_USER_ALREADY_CONFIRMED";
                break;
            case 150:
                str = "RLM_ERR_USER_NOT_FOUND";
                break;
            case 151:
                str = "RLM_ERR_USER_DISABLED";
                break;
            case 152:
                str = "RLM_ERR_AUTH_ERROR";
                break;
            case 153:
                str = "RLM_ERR_BAD_REQUEST";
                break;
            case 154:
                str = "RLM_ERR_ACCOUNT_NAME_IN_USE";
                break;
            case 155:
                str = "RLM_ERR_INVALID_PASSWORD";
                break;
            case 156:
                str = "RLM_ERR_SCHEMA_VALIDATION_FAILED_WRITE";
                break;
            case 157:
                str = "RLM_ERR_APP_UNKNOWN";
                break;
            case 158:
                str = "RLM_ERR_MAINTENANCE_IN_PROGRESS";
                break;
            case 159:
                str = "RLM_ERR_USERPASS_TOKEN_INVALID";
                break;
            case 160:
                str = "RLM_ERR_INVALID_SERVER_RESPONSE";
                break;
            case 161:
                str = "RLM_ERR_APP_SERVER_ERROR";
                break;
            case 162:
                str = "RLM_ERR_CALLBACK";
                break;
            case 163:
                str = "RLM_ERR_UNKNOWN";
                break;
            default:
                str = "null";
                break;
        }
        sb2.append(str);
        sb2.append("]: ");
        sb2.append(messageNativeValue);
        string = sb2.toString();
        if (userError == null) {
            return userError;
        }
        if (89 == i3) {
            return new IndexOutOfBoundsException(string);
        }
        i = c12688l.yandex;
        if ((i & 8) != 0) {
            return new IllegalArgumentException(string);
        }
        if ((i & 2) == 0) {
        }
    }
}
