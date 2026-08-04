package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: lْٔٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13370l extends AbstractC10491l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public C11154l f26228l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public Long f26229l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public String f26230l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public Long f26231l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public HashSet f26232l;

    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    public final C6360l m3640l(Integer num) {
        if (this.f26228l.containsKey(num)) {
            return (C6360l) this.f26228l.get(num);
        }
        C6360l c6360l = new C6360l(this, this.f26230l);
        this.f26228l.put(num, c6360l);
        return c6360l;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0242 A[LOOP:20: B:85:0x01f2->B:102:0x0242, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x0274  */
    /* JADX WARN: Code duplicated, block: B:121:0x027e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0289  */
    /* JADX WARN: Code duplicated, block: B:125:0x0294  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c2 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, LOOP:11: B:131:0x02c2->B:568:?, LOOP_START, TryCatch #4 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:478:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:133:0x02d3 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, TryCatch #4 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:478:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02f6 A[Catch: all -> 0x02dd, SQLiteException -> 0x02df, TRY_ENTER, TRY_LEAVE, TryCatch #4 {SQLiteException -> 0x02df, blocks: (B:129:0x02bc, B:131:0x02c2, B:133:0x02d3, B:139:0x02e1, B:142:0x02f6), top: B:478:0x02bc }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0335  */
    /* JADX WARN: Code duplicated, block: B:162:0x0343  */
    /* JADX WARN: Code duplicated, block: B:164:0x035a  */
    /* JADX WARN: Code duplicated, block: B:190:0x0455  */
    /* JADX WARN: Code duplicated, block: B:194:0x0466  */
    /* JADX WARN: Code duplicated, block: B:196:0x0486  */
    /* JADX WARN: Code duplicated, block: B:202:0x049d  */
    /* JADX WARN: Code duplicated, block: B:206:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:207:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:211:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:217:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:223:0x051d  */
    /* JADX WARN: Code duplicated, block: B:226:0x0526  */
    /* JADX WARN: Code duplicated, block: B:228:0x0532  */
    /* JADX WARN: Code duplicated, block: B:230:0x0554  */
    /* JADX WARN: Code duplicated, block: B:231:0x0558  */
    /* JADX WARN: Code duplicated, block: B:236:0x0571 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x0590  */
    /* JADX WARN: Code duplicated, block: B:249:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:252:0x05be  */
    /* JADX WARN: Code duplicated, block: B:255:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:262:0x060d  */
    /* JADX WARN: Code duplicated, block: B:265:0x0621  */
    /* JADX WARN: Code duplicated, block: B:271:0x0654  */
    /* JADX WARN: Code duplicated, block: B:275:0x0695  */
    /* JADX WARN: Code duplicated, block: B:282:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:288:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:299:0x06f9 A[LOOP:3: B:276:0x0697->B:299:0x06f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:300:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:315:0x072c  */
    /* JADX WARN: Code duplicated, block: B:320:0x0737  */
    /* JADX WARN: Code duplicated, block: B:322:0x073b  */
    /* JADX WARN: Code duplicated, block: B:326:0x074d  */
    /* JADX WARN: Code duplicated, block: B:332:0x077c  */
    /* JADX WARN: Code duplicated, block: B:334:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:336:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:339:0x07bf A[LOOP:5: B:330:0x0776->B:339:0x07bf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:343:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:346:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:349:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:352:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:354:0x0810  */
    /* JADX WARN: Code duplicated, block: B:358:0x084b  */
    /* JADX WARN: Code duplicated, block: B:365:0x0873  */
    /* JADX WARN: Code duplicated, block: B:371:0x0884  */
    /* JADX WARN: Code duplicated, block: B:382:0x08b3 A[LOOP:7: B:359:0x084d->B:382:0x08b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:385:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:400:0x08ee  */
    /* JADX WARN: Code duplicated, block: B:404:0x08f8  */
    /* JADX WARN: Code duplicated, block: B:406:0x08fc  */
    /* JADX WARN: Code duplicated, block: B:410:0x090c  */
    /* JADX WARN: Code duplicated, block: B:414:0x092d  */
    /* JADX WARN: Code duplicated, block: B:417:0x093e  */
    /* JADX WARN: Code duplicated, block: B:419:0x0955  */
    /* JADX WARN: Code duplicated, block: B:421:0x0963  */
    /* JADX WARN: Code duplicated, block: B:423:0x096e  */
    /* JADX WARN: Code duplicated, block: B:425:0x0999  */
    /* JADX WARN: Code duplicated, block: B:428:0x09a3  */
    /* JADX WARN: Code duplicated, block: B:441:0x0a0e  */
    /* JADX WARN: Code duplicated, block: B:442:0x0a17  */
    /* JADX WARN: Code duplicated, block: B:446:0x0a2a A[PHI: r16 r20 r21
  0x0a2a: PHI (r16v2 java.util.Map) = (r16v3 java.util.Map), (r16v4 java.util.Map) binds: [B:445:0x0a28, B:443:0x0a18] A[DONT_GENERATE, DONT_INLINE]
  0x0a2a: PHI (r20v5 lّؗۙ) = (r20v6 lّؗۙ), (r2v41 lّؗۙ) binds: [B:445:0x0a28, B:443:0x0a18] A[DONT_GENERATE, DONT_INLINE]
  0x0a2a: PHI (r21v20 java.util.Iterator) = (r21v21 java.util.Iterator), (r3v56 java.util.Iterator) binds: [B:445:0x0a28, B:443:0x0a18] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:451:0x0a53  */
    /* JADX WARN: Code duplicated, block: B:464:0x0ad9  */
    /* JADX WARN: Code duplicated, block: B:467:0x0ae1  */
    /* JADX WARN: Code duplicated, block: B:536:0x062f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:0x0646 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x061b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:540:0x061b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x06f4 A[EDGE_INSN: B:542:0x06f4->B:298:0x06f4 BREAK  A[LOOP:3: B:276:0x0697->B:299:0x06f9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x076b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x075f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x07cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:0x07d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x08ae A[EDGE_INSN: B:553:0x08ae->B:381:0x08ae BREAK  A[LOOP:7: B:359:0x084d->B:382:0x08b3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:0x091e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x0a2f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x0a22 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x09fa A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x0aaf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:0x0a4d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:0x04a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:0x0497 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:0x04f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:0x04e1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:0x05d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:0x0360 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:0x023e A[EDGE_INSN: B:604:0x023e->B:101:0x023e BREAK  A[LOOP:20: B:85:0x01f2->B:102:0x0242], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x018e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0195  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d1 A[Catch: all -> 0x01dd, SQLiteException -> 0x01e0, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x01e0, blocks: (B:72:0x01cb, B:74:0x01d1, B:83:0x01eb), top: B:476:0x01cb }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb A[Catch: all -> 0x01dd, SQLiteException -> 0x01e0, TRY_ENTER, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x01e0, blocks: (B:72:0x01cb, B:74:0x01d1, B:83:0x01eb), top: B:476:0x01cb }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v202 */
    /* JADX WARN: Type inference failed for: r0v203 */
    /* JADX WARN: Type inference failed for: r0v31, types: [lّؗۙ, lُٛ٘] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v20, types: [lّؗۙ, lُٛ٘] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [lًٗۜ] */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24, types: [lًٗۜ] */
    /* JADX WARN: Type inference failed for: r17v30 */
    /* JADX WARN: Type inference failed for: r17v31 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v19 */
    /* JADX WARN: Type inference failed for: r18v20, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r18v24 */
    /* JADX WARN: Type inference failed for: r18v25 */
    /* JADX WARN: Type inference failed for: r18v26 */
    /* JADX WARN: Type inference failed for: r18v27 */
    /* JADX WARN: Type inference failed for: r18v28 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v30 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v69, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v70 */
    /* JADX WARN: Type inference failed for: r3v69, types: [lؘٕٔ] */
    /* JADX WARN: Type inference failed for: r3v83, types: [lؘٕٔ] */
    /* JADX WARN: Type inference failed for: r42v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r42v10 */
    /* JADX WARN: Type inference failed for: r42v11, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r42v12 */
    /* JADX WARN: Type inference failed for: r42v13 */
    /* JADX WARN: Type inference failed for: r42v14 */
    /* JADX WARN: Type inference failed for: r42v15 */
    /* JADX WARN: Type inference failed for: r42v16, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r42v17 */
    /* JADX WARN: Type inference failed for: r42v18 */
    /* JADX WARN: Type inference failed for: r42v19 */
    /* JADX WARN: Type inference failed for: r42v2 */
    /* JADX WARN: Type inference failed for: r42v20 */
    /* JADX WARN: Type inference failed for: r42v21 */
    /* JADX WARN: Type inference failed for: r42v22 */
    /* JADX WARN: Type inference failed for: r42v23 */
    /* JADX WARN: Type inference failed for: r42v24 */
    /* JADX WARN: Type inference failed for: r42v25 */
    /* JADX WARN: Type inference failed for: r42v26 */
    /* JADX WARN: Type inference failed for: r42v27 */
    /* JADX WARN: Type inference failed for: r42v28 */
    /* JADX WARN: Type inference failed for: r42v29 */
    /* JADX WARN: Type inference failed for: r42v3 */
    /* JADX WARN: Type inference failed for: r42v30 */
    /* JADX WARN: Type inference failed for: r42v31 */
    /* JADX WARN: Type inference failed for: r42v32 */
    /* JADX WARN: Type inference failed for: r42v33 */
    /* JADX WARN: Type inference failed for: r42v4 */
    /* JADX WARN: Type inference failed for: r42v5 */
    /* JADX WARN: Type inference failed for: r42v6 */
    /* JADX WARN: Type inference failed for: r42v7 */
    /* JADX WARN: Type inference failed for: r42v8 */
    /* JADX WARN: Type inference failed for: r42v9 */
    /* JADX WARN: Type inference failed for: r4v31, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v64 */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v66, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v67, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v68, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v69 */
    /* JADX WARN: Type inference failed for: r7v70 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v72 */
    /* JADX WARN: Type inference failed for: r7v73, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v75 */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final ArrayList m3641l(String str, List list, List list2, Long l, Long l2, boolean z) throws Throwable {
        boolean z2;
        boolean z3;
        String str2;
        Map map;
        Object obj;
        ?? r5;
        Cursor cursorQuery;
        ?? r17;
        String str3;
        Object obj2;
        ?? r21;
        Map map2;
        String str4;
        C17417l c17417l;
        Map map3;
        Map map4;
        Map map5;
        String str5;
        C0450l c0450l;
        BitSet bitSet;
        BitSet bitSet2;
        C11154l c11154l;
        C0450l c0450l2;
        C11154l c11154l2;
        List<C9540l> list3;
        long jLongValue;
        Integer numValueOf;
        int i;
        boolean z4;
        Iterator it;
        C8888l c8888l;
        Long lValueOf;
        C8648l c8648lM2104public;
        String str6;
        ?? c11154l3;
        ?? r7;
        Cursor cursorRawQuery;
        ?? r0;
        C11154l c11154l4;
        Iterator it2;
        Integer num;
        C0450l c0450l3;
        List list4;
        ?? r18;
        Iterator it3;
        C17417l c17417l2;
        Integer numValueOf2;
        List arrayList;
        String str7;
        ArrayList arrayList2;
        C8648l c8648lM2104public2;
        C17417l c17417l3;
        String str8;
        ContentValues contentValues;
        Iterator it4;
        C5128l c5128l;
        String strLicense;
        Map map6;
        Iterator it5;
        Iterator it6;
        C5128l c5128l2;
        Integer num2;
        int iIntValue;
        Iterator it7;
        boolean zLoadAd;
        C5128l c5128l3;
        Map map7;
        C16493l c16493l;
        Integer numValueOf3;
        C13104l c13104l;
        int i2;
        Integer numValueOf4;
        C17417l c17417l4;
        String str9;
        C11154l c11154l5;
        Cursor cursor;
        C17417l c17417l5;
        String str10;
        Cursor cursorQuery2;
        Integer numValueOf5;
        List list5;
        List arrayList3;
        C0093l c0093l;
        ?? c11154l6;
        C1841l c1841lAmazon;
        C6491l c6491lM2365l;
        long j;
        String strAdvert;
        Map map8;
        int iIntValue2;
        Iterator it8;
        boolean zYandex;
        Map map9;
        C0093l c0093l2;
        Integer num3;
        C13104l c13104l2;
        int iSignature;
        C6360l c6360l;
        boolean z5;
        String str11;
        C11154l c11154l7;
        ?? r8;
        String str12;
        ?? r2;
        ?? r42;
        ?? r43;
        ?? Query;
        ?? r44;
        ?? r45;
        ?? r46;
        ?? r47;
        Integer numValueOf6;
        List list6;
        ?? r48;
        List arrayList4;
        C11154l c11154l8;
        int i3;
        ?? r6;
        Object obj3;
        ?? r9;
        ?? r19;
        ?? r110;
        List arrayList5;
        C17417l c17417l6 = (C17417l) this.f833l;
        AbstractC1051l.billing(str);
        AbstractC1051l.subs(list);
        AbstractC1051l.subs(list2);
        this.f26230l = str;
        this.f26232l = new HashSet();
        this.f26228l = new C11154l();
        this.f26229l = l;
        this.f26231l = l2;
        Iterator it9 = list.iterator();
        while (true) {
            if (!it9.hasNext()) {
                z2 = false;
                break;
            }
            if ("_s".equals(((C1841l) it9.next()).advert())) {
                z2 = true;
                break;
            }
        }
        C3264l.yandex();
        boolean zM1682l = c17417l6.f33945l.m1682l(this.f26230l, AbstractC5981l.f12661l);
        C3264l.yandex();
        boolean zM1682l2 = c17417l6.f33945l.m1682l(this.f26230l, AbstractC5981l.f12672l);
        C6901l c6901l = this.f13233l;
        if (z2) {
            C8648l c8648lM2104public3 = c6901l.m2104public();
            String str13 = this.f26230l;
            c8648lM2104public3.m2927l();
            c8648lM2104public3.mo211l();
            AbstractC1051l.billing(str13);
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                c8648lM2104public3.m2395l().update("events", contentValues2, "app_id = ?", new String[]{str13});
            } catch (SQLiteException e) {
                ((C17417l) c8648lM2104public3.f833l).mo200else().m2264l().crashlytics(C8118l.m2260l(str13), e, "Error resetting session-scoped event counts. appId");
            }
        }
        Map map10 = Collections.EMPTY_MAP;
        String str14 = "Failed to merge filter. appId";
        Object objM2260l = "Database error querying filters. appId";
        String str15 = "audience_id";
        try {
            try {
                try {
                    if (zM1682l2 && zM1682l) {
                        C8648l c8648lM2104public4 = c6901l.m2104public();
                        C17417l c17417l7 = (C17417l) c8648lM2104public4.f833l;
                        String str16 = this.f26230l;
                        AbstractC1051l.billing(str16);
                        z3 = z2;
                        C11154l c11154l9 = new C11154l();
                        try {
                            ?? Query2 = c8648lM2104public4.m2395l().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str16}, null, null, null);
                            try {
                                try {
                                    if (Query2.moveToFirst()) {
                                        str2 = "data";
                                        Query2 = Query2;
                                        ?? r111 = "event_filters";
                                        while (true) {
                                            try {
                                                try {
                                                    C9540l c9540l = (C9540l) ((C6122l) C13718l.m3698l(C9540l.m2679throws(), Query2.getBlob(1))).amazon();
                                                    if (c9540l.isVip()) {
                                                        Integer numValueOf7 = Integer.valueOf(Query2.getInt(0));
                                                        List list7 = (List) c11154l9.get(numValueOf7);
                                                        if (list7 == null) {
                                                            arrayList5 = new ArrayList();
                                                            c11154l9.put(numValueOf7, arrayList5);
                                                        } else {
                                                            arrayList5 = list7;
                                                        }
                                                        arrayList5.add(c9540l);
                                                        r111 = Query2;
                                                    } else {
                                                        r111 = Query2;
                                                    }
                                                } catch (IOException e2) {
                                                    r111 = Query2;
                                                    c17417l7.mo200else().m2264l().crashlytics(C8118l.m2260l(str16), e2, "Failed to merge filter. appId");
                                                }
                                                try {
                                                    if (!r111.moveToNext()) {
                                                        break;
                                                    }
                                                    Query2 = r111;
                                                    r111 = r111;
                                                } catch (SQLiteException e3) {
                                                    e = e3;
                                                    r110 = r111;
                                                    r9 = r110;
                                                    try {
                                                        c17417l7.mo200else().m2264l().crashlytics(C8118l.m2260l(str16), e, "Database error querying filters. appId");
                                                        map10 = Collections.EMPTY_MAP;
                                                        if (r9 != 0) {
                                                            r9.close();
                                                        }
                                                        map = map10;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        if (r9 != 0) {
                                                            r9.close();
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    r19 = r111;
                                                    r9 = r19;
                                                    if (r9 != 0) {
                                                        r9.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (SQLiteException e4) {
                                                e = e4;
                                                r110 = Query2;
                                                r9 = r110;
                                                c17417l7.mo200else().m2264l().crashlytics(C8118l.m2260l(str16), e, "Database error querying filters. appId");
                                                map10 = Collections.EMPTY_MAP;
                                                if (r9 != 0) {
                                                    r9.close();
                                                }
                                                map = map10;
                                                C8648l c8648lM2104public5 = c6901l.m2104public();
                                                obj = (C17417l) c8648lM2104public5.f833l;
                                                r5 = this.f26230l;
                                                c8648lM2104public5.m2927l();
                                                c8648lM2104public5.mo211l();
                                                AbstractC1051l.billing(r5);
                                                cursorQuery = c8648lM2104public5.m2395l().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
                                                if (cursorQuery.moveToFirst()) {
                                                    c11154l8 = new C11154l();
                                                    r17 = obj;
                                                    r21 = r5;
                                                    while (true) {
                                                        try {
                                                            i3 = cursorQuery.getInt(0);
                                                            try {
                                                                C0450l c0450l4 = (C0450l) ((C3269l) C13718l.m3698l(C0450l.premium(), cursorQuery.getBlob(1))).amazon();
                                                                Object objValueOf = Integer.valueOf(i3);
                                                                c11154l8.put(objValueOf, c0450l4);
                                                                str3 = str14;
                                                                obj2 = objM2260l;
                                                                obj3 = objValueOf;
                                                                r6 = r21;
                                                            } catch (IOException e5) {
                                                                C14906l c14906lM2264l = r17.mo200else().m2264l();
                                                                str3 = str14;
                                                                str14 = "Failed to merge filter results. appId, audienceId, error";
                                                                obj2 = objM2260l;
                                                                try {
                                                                    objM2260l = C8118l.m2260l(r21);
                                                                    Integer numValueOf8 = Integer.valueOf(i3);
                                                                    c14906lM2264l.amazon("Failed to merge filter results. appId, audienceId, error", objM2260l, numValueOf8, e5);
                                                                    obj3 = c14906lM2264l;
                                                                    r6 = numValueOf8;
                                                                } catch (SQLiteException e6) {
                                                                    e = e6;
                                                                    r21 = r21;
                                                                    r17.mo200else().m2264l().crashlytics(C8118l.m2260l(r21), e, "Database error querying filter results. appId");
                                                                    Map map11 = Collections.EMPTY_MAP;
                                                                    if (cursorQuery != null) {
                                                                        cursorQuery.close();
                                                                    }
                                                                    map2 = map11;
                                                                    if (map2.isEmpty()) {
                                                                        str5 = "audience_id";
                                                                        c17417l = c17417l6;
                                                                    } else {
                                                                        HashSet<Integer> hashSet = new HashSet(map2.keySet());
                                                                        if (z3) {
                                                                            String str17 = this.f26230l;
                                                                            c8648lM2104public = c6901l.m2104public();
                                                                            str6 = this.f26230l;
                                                                            c8648lM2104public.m2927l();
                                                                            c8648lM2104public.mo211l();
                                                                            AbstractC1051l.billing(str6);
                                                                            c11154l3 = new C11154l();
                                                                            try {
                                                                                try {
                                                                                    cursorRawQuery = c8648lM2104public.m2395l().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                                    try {
                                                                                        if (cursorRawQuery.moveToFirst()) {
                                                                                            do {
                                                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                                                arrayList = (List) c11154l3.get(numValueOf2);
                                                                                                if (arrayList == null) {
                                                                                                    arrayList = new ArrayList();
                                                                                                    c11154l3.put(numValueOf2, arrayList);
                                                                                                }
                                                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                                            } while (cursorRawQuery.moveToNext());
                                                                                        } else {
                                                                                            c11154l3 = Collections.EMPTY_MAP;
                                                                                        }
                                                                                    } catch (SQLiteException e7) {
                                                                                        e = e7;
                                                                                        ((C17417l) c8648lM2104public.f833l).mo200else().m2264l().crashlytics(C8118l.m2260l(str6), e, "Database error querying scoped filters. appId");
                                                                                        c11154l3 = Collections.EMPTY_MAP;
                                                                                        r0 = c11154l3;
                                                                                        if (cursorRawQuery != null) {
                                                                                        }
                                                                                        AbstractC1051l.billing(str17);
                                                                                        c11154l4 = new C11154l();
                                                                                        if (!map2.isEmpty()) {
                                                                                            it2 = map2.keySet().iterator();
                                                                                            while (it2.hasNext()) {
                                                                                                num = (Integer) it2.next();
                                                                                                num.getClass();
                                                                                                c0450l3 = (C0450l) map2.get(num);
                                                                                                list4 = (List) r0.get(num);
                                                                                                if (list4 != null) {
                                                                                                }
                                                                                                r18 = r0;
                                                                                                it3 = it2;
                                                                                                c17417l2 = c17417l6;
                                                                                                c11154l4.put(num, c0450l3);
                                                                                                r0 = r18;
                                                                                                str15 = str15;
                                                                                                it2 = it3;
                                                                                                c17417l6 = c17417l2;
                                                                                            }
                                                                                        }
                                                                                        str4 = str15;
                                                                                        c17417l = c17417l6;
                                                                                        map3 = c11154l4;
                                                                                        map5 = map3;
                                                                                        map4 = map2;
                                                                                        for (Integer num4 : hashSet) {
                                                                                            num4.getClass();
                                                                                            c0450l = (C0450l) map5.get(num4);
                                                                                            bitSet = new BitSet();
                                                                                            bitSet2 = new BitSet();
                                                                                            c11154l = new C11154l();
                                                                                            if (c0450l != null) {
                                                                                                for (C16986l c16986l : c0450l.ad()) {
                                                                                                    if (c16986l.tapsense()) {
                                                                                                        C0450l c0450l5 = c0450l;
                                                                                                        Integer numValueOf9 = Integer.valueOf(c16986l.Signature());
                                                                                                        if (c16986l.license()) {
                                                                                                            lValueOf = Long.valueOf(c16986l.pro());
                                                                                                        } else {
                                                                                                            lValueOf = null;
                                                                                                        }
                                                                                                        c11154l.put(numValueOf9, lValueOf);
                                                                                                        c0450l = c0450l5;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            c0450l2 = c0450l;
                                                                                            c11154l2 = new C11154l();
                                                                                            if (c0450l2 != null) {
                                                                                                it = c0450l2.isVip().iterator();
                                                                                                while (it.hasNext()) {
                                                                                                    c8888l = (C8888l) it.next();
                                                                                                    if (!c8888l.tapsense()) {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            Map map12 = map5;
                                                                                            if (c0450l2 != null) {
                                                                                                i = 0;
                                                                                                while (i < c0450l2.Signature() * 64) {
                                                                                                    if (C13718l.m3689l((InterfaceC11831l) c0450l2.tapsense(), i)) {
                                                                                                        z4 = zM1682l;
                                                                                                        c17417l.mo200else().m2267l().crashlytics(num4, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                                                        bitSet2.set(i);
                                                                                                        if (C13718l.m3689l((InterfaceC11831l) c0450l2.license(), i)) {
                                                                                                            bitSet.set(i);
                                                                                                        }
                                                                                                        i++;
                                                                                                        zM1682l = z4;
                                                                                                    } else {
                                                                                                        z4 = zM1682l;
                                                                                                    }
                                                                                                    c11154l.remove(Integer.valueOf(i));
                                                                                                    i++;
                                                                                                    zM1682l = z4;
                                                                                                }
                                                                                            }
                                                                                            boolean z6 = zM1682l;
                                                                                            C0450l c0450l6 = (C0450l) map4.get(num4);
                                                                                            if (zM1682l2) {
                                                                                                for (C9540l c9540l2 : list3) {
                                                                                                    int iSignature2 = c9540l2.Signature();
                                                                                                    Integer num5 = num4;
                                                                                                    jLongValue = this.f26231l.longValue() / 1000;
                                                                                                    if (c9540l2.applovin()) {
                                                                                                        jLongValue = this.f26229l.longValue() / 1000;
                                                                                                    }
                                                                                                    numValueOf = Integer.valueOf(iSignature2);
                                                                                                    if (c11154l.containsKey(numValueOf)) {
                                                                                                        c11154l.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    if (c11154l2.containsKey(numValueOf)) {
                                                                                                        c11154l2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                                    }
                                                                                                    num4 = num5;
                                                                                                }
                                                                                            }
                                                                                            this.f26228l.put(num4, new C6360l(this, this.f26230l, c0450l6, bitSet, bitSet2, c11154l, c11154l2));
                                                                                            map = map;
                                                                                            zM1682l = z6;
                                                                                            map4 = map4;
                                                                                            zM1682l2 = zM1682l2;
                                                                                            str3 = str3;
                                                                                            map5 = map12;
                                                                                        }
                                                                                        str5 = str4;
                                                                                        str7 = str2;
                                                                                        String str18 = str3;
                                                                                        ?? r10 = obj2;
                                                                                        if (!list.isEmpty()) {
                                                                                            c0093l = new C0093l(this);
                                                                                            c11154l6 = new C11154l();
                                                                                            for (C1841l c1841l : list) {
                                                                                                c1841lAmazon = c0093l.amazon(this.f26230l, c1841l);
                                                                                                if (c1841lAmazon != null) {
                                                                                                    c6491lM2365l = c6901l.m2104public().m2365l(this.f26230l, c1841l, c1841lAmazon.advert());
                                                                                                    c6901l.m2104public().m2388l("events", c6491lM2365l);
                                                                                                    if (z) {
                                                                                                        continue;
                                                                                                    } else {
                                                                                                        j = c6491lM2365l.crashlytics;
                                                                                                        strAdvert = c1841lAmazon.advert();
                                                                                                        map8 = (Map) c11154l6.get(strAdvert);
                                                                                                        if (map8 == null) {
                                                                                                            C8648l c8648lM2104public6 = c6901l.m2104public();
                                                                                                            C17417l c17417l8 = (C17417l) c8648lM2104public6.f833l;
                                                                                                            str11 = this.f26230l;
                                                                                                            c8648lM2104public6.m2927l();
                                                                                                            c8648lM2104public6.mo211l();
                                                                                                            AbstractC1051l.billing(str11);
                                                                                                            AbstractC1051l.billing(strAdvert);
                                                                                                            c11154l7 = new C11154l();
                                                                                                            try {
                                                                                                                Query = c8648lM2104public6.m2395l().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strAdvert}, null, null, null);
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        if (Query.moveToFirst()) {
                                                                                                                            str12 = str11;
                                                                                                                            Query = Query;
                                                                                                                            r46 = list;
                                                                                                                            while (true) {
                                                                                                                                try {
                                                                                                                                    try {
                                                                                                                                        C9540l c9540l3 = (C9540l) ((C6122l) C13718l.m3698l(C9540l.m2679throws(), Query.getBlob(1))).amazon();
                                                                                                                                        numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                                                                        list6 = (List) c11154l7.get(numValueOf6);
                                                                                                                                        if (list6 == null) {
                                                                                                                                            r46 = Query;
                                                                                                                                            try {
                                                                                                                                                arrayList4 = new ArrayList();
                                                                                                                                                c11154l7.put(numValueOf6, arrayList4);
                                                                                                                                                r48 = r46;
                                                                                                                                            } catch (SQLiteException e8) {
                                                                                                                                                e = e8;
                                                                                                                                                r45 = r46;
                                                                                                                                                r2 = r45;
                                                                                                                                                r42 = r45;
                                                                                                                                                try {
                                                                                                                                                    c17417l8.mo200else().m2264l().crashlytics(C8118l.m2260l(str12), e, r10);
                                                                                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                                                                                    r43 = r42;
                                                                                                                                                    if (r2 != 0) {
                                                                                                                                                        r2.close();
                                                                                                                                                        r43 = r42;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th3) {
                                                                                                                                                    th = th3;
                                                                                                                                                    r8 = r2;
                                                                                                                                                    if (r8 != 0) {
                                                                                                                                                        r8.close();
                                                                                                                                                    }
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th4) {
                                                                                                                                                th = th4;
                                                                                                                                                r44 = r46;
                                                                                                                                                r8 = r44;
                                                                                                                                                if (r8 != 0) {
                                                                                                                                                    r8.close();
                                                                                                                                                }
                                                                                                                                                throw th;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            r48 = Query;
                                                                                                                                            arrayList4 = list6;
                                                                                                                                        }
                                                                                                                                        arrayList4.add(c9540l3);
                                                                                                                                        r47 = r48;
                                                                                                                                    } catch (IOException e9) {
                                                                                                                                        r47 = Query;
                                                                                                                                        c17417l8.mo200else().m2264l().crashlytics(C8118l.m2260l(str12), e9, str18);
                                                                                                                                    }
                                                                                                                                    if (!r47.moveToNext()) {
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    Query = r47;
                                                                                                                                    r46 = r47;
                                                                                                                                } catch (SQLiteException e10) {
                                                                                                                                    e = e10;
                                                                                                                                    r45 = Query;
                                                                                                                                    r2 = r45;
                                                                                                                                    r42 = r45;
                                                                                                                                    c17417l8.mo200else().m2264l().crashlytics(C8118l.m2260l(str12), e, r10);
                                                                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                                                                    r43 = r42;
                                                                                                                                    if (r2 != 0) {
                                                                                                                                        r2.close();
                                                                                                                                        r43 = r42;
                                                                                                                                    }
                                                                                                                                    c11154l6.put(strAdvert, map8);
                                                                                                                                    list = r43;
                                                                                                                                    for (Integer num6 : map8.keySet()) {
                                                                                                                                        iIntValue2 = num6.intValue();
                                                                                                                                        if (this.f26232l.contains(num6)) {
                                                                                                                                            c17417l.mo200else().m2267l().loadAd(num6, "Skipping failed audience ID");
                                                                                                                                        } else {
                                                                                                                                            it8 = ((List) map8.get(num6)).iterator();
                                                                                                                                            zYandex = true;
                                                                                                                                            while (true) {
                                                                                                                                                if (!it8.hasNext()) {
                                                                                                                                                    map9 = map8;
                                                                                                                                                    c0093l2 = c0093l;
                                                                                                                                                    num3 = num6;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                C9540l c9540l4 = (C9540l) it8.next();
                                                                                                                                                c0093l2 = c0093l;
                                                                                                                                                num3 = num6;
                                                                                                                                                map9 = map8;
                                                                                                                                                c13104l2 = new C13104l(this, this.f26230l, iIntValue2, c9540l4, 0);
                                                                                                                                                Long l3 = this.f26229l;
                                                                                                                                                Long l4 = this.f26231l;
                                                                                                                                                iSignature = c9540l4.Signature();
                                                                                                                                                c6360l = (C6360l) this.f26228l.get(num3);
                                                                                                                                                if (c6360l == null) {
                                                                                                                                                    z5 = false;
                                                                                                                                                } else {
                                                                                                                                                    z5 = c6360l.amazon.get(iSignature);
                                                                                                                                                }
                                                                                                                                                zYandex = c13104l2.yandex(l3, l4, c1841lAmazon, j, c6491lM2365l, z5);
                                                                                                                                                if (!zYandex) {
                                                                                                                                                    this.f26232l.add(num3);
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                m3640l(num3).yandex(c13104l2);
                                                                                                                                                num6 = num3;
                                                                                                                                                map8 = map9;
                                                                                                                                                c0093l = c0093l2;
                                                                                                                                            }
                                                                                                                                            if (!zYandex) {
                                                                                                                                                this.f26232l.add(num3);
                                                                                                                                            }
                                                                                                                                            c0093l = c0093l2;
                                                                                                                                            map8 = map9;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                            r47.close();
                                                                                                                            map8 = c11154l7;
                                                                                                                            r43 = r47;
                                                                                                                        } else {
                                                                                                                            ?? r49 = Query;
                                                                                                                            map8 = Collections.EMPTY_MAP;
                                                                                                                            r49.close();
                                                                                                                            r43 = r49;
                                                                                                                        }
                                                                                                                    } catch (Throwable th5) {
                                                                                                                        th = th5;
                                                                                                                        r44 = Query;
                                                                                                                    }
                                                                                                                } catch (SQLiteException e11) {
                                                                                                                    e = e11;
                                                                                                                    str12 = str11;
                                                                                                                }
                                                                                                            } catch (SQLiteException e12) {
                                                                                                                e = e12;
                                                                                                                str12 = str11;
                                                                                                                r2 = 0;
                                                                                                                r42 = list;
                                                                                                            } catch (Throwable th6) {
                                                                                                                th = th6;
                                                                                                                r8 = 0;
                                                                                                            }
                                                                                                            c11154l6.put(strAdvert, map8);
                                                                                                            list = r43;
                                                                                                        } else {
                                                                                                            list = list;
                                                                                                        }
                                                                                                        while (r19.hasNext()) {
                                                                                                            iIntValue2 = num6.intValue();
                                                                                                            if (this.f26232l.contains(num6)) {
                                                                                                                c17417l.mo200else().m2267l().loadAd(num6, "Skipping failed audience ID");
                                                                                                            } else {
                                                                                                                it8 = ((List) map8.get(num6)).iterator();
                                                                                                                zYandex = true;
                                                                                                                while (true) {
                                                                                                                    if (!it8.hasNext()) {
                                                                                                                        map9 = map8;
                                                                                                                        c0093l2 = c0093l;
                                                                                                                        num3 = num6;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    C9540l c9540l5 = (C9540l) it8.next();
                                                                                                                    c0093l2 = c0093l;
                                                                                                                    num3 = num6;
                                                                                                                    map9 = map8;
                                                                                                                    c13104l2 = new C13104l(this, this.f26230l, iIntValue2, c9540l5, 0);
                                                                                                                    Long l5 = this.f26229l;
                                                                                                                    Long l6 = this.f26231l;
                                                                                                                    iSignature = c9540l5.Signature();
                                                                                                                    c6360l = (C6360l) this.f26228l.get(num3);
                                                                                                                    if (c6360l == null) {
                                                                                                                        z5 = false;
                                                                                                                    } else {
                                                                                                                        z5 = c6360l.amazon.get(iSignature);
                                                                                                                    }
                                                                                                                    zYandex = c13104l2.yandex(l5, l6, c1841lAmazon, j, c6491lM2365l, z5);
                                                                                                                    if (!zYandex) {
                                                                                                                        this.f26232l.add(num3);
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    m3640l(num3).yandex(c13104l2);
                                                                                                                    num6 = num3;
                                                                                                                    map8 = map9;
                                                                                                                    c0093l = c0093l2;
                                                                                                                }
                                                                                                                if (!zYandex) {
                                                                                                                    this.f26232l.add(num3);
                                                                                                                }
                                                                                                                c0093l = c0093l2;
                                                                                                                map8 = map9;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        if (!z) {
                                                                                            return new ArrayList();
                                                                                        }
                                                                                        if (!list2.isEmpty()) {
                                                                                            C11154l c11154l10 = new C11154l();
                                                                                            it4 = list2.iterator();
                                                                                            c5128l = c11154l10;
                                                                                            while (it4.hasNext()) {
                                                                                                C8252l c8252l = (C8252l) it4.next();
                                                                                                strLicense = c8252l.license();
                                                                                                map6 = (Map) c5128l.get(strLicense);
                                                                                                if (map6 == null) {
                                                                                                    C8648l c8648lM2104public7 = c6901l.m2104public();
                                                                                                    c17417l4 = (C17417l) c8648lM2104public7.f833l;
                                                                                                    str9 = this.f26230l;
                                                                                                    c8648lM2104public7.m2927l();
                                                                                                    c8648lM2104public7.mo211l();
                                                                                                    AbstractC1051l.billing(str9);
                                                                                                    AbstractC1051l.billing(strLicense);
                                                                                                    c11154l5 = new C11154l();
                                                                                                    try {
                                                                                                        cursorQuery2 = c8648lM2104public7.m2395l().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strLicense}, null, null, null);
                                                                                                        try {
                                                                                                            try {
                                                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                                                    it5 = it4;
                                                                                                                    while (true) {
                                                                                                                        try {
                                                                                                                            try {
                                                                                                                                C16493l c16493l2 = (C16493l) ((C14364l) C13718l.m3698l(C16493l.premium(), cursorQuery2.getBlob(1))).amazon();
                                                                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                                list5 = (List) c11154l5.get(numValueOf5);
                                                                                                                                if (list5 == null) {
                                                                                                                                    c17417l5 = c17417l4;
                                                                                                                                    try {
                                                                                                                                        arrayList3 = new ArrayList();
                                                                                                                                        c11154l5.put(numValueOf5, arrayList3);
                                                                                                                                    } catch (SQLiteException e13) {
                                                                                                                                        e = e13;
                                                                                                                                        str10 = str9;
                                                                                                                                        cursor = cursorQuery2;
                                                                                                                                        try {
                                                                                                                                            c17417l5.mo200else().m2264l().crashlytics(C8118l.m2260l(str10), e, r10);
                                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            c5128l.put(strLicense, map6);
                                                                                                                                            it6 = map6.keySet().iterator();
                                                                                                                                            c5128l2 = c5128l;
                                                                                                                                            while (it6.hasNext()) {
                                                                                                                                                num2 = (Integer) it6.next();
                                                                                                                                                iIntValue = num2.intValue();
                                                                                                                                                if (this.f26232l.contains(num2)) {
                                                                                                                                                    c17417l.mo200else().m2267l().loadAd(num2, "Skipping failed audience ID");
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                                                                                zLoadAd = true;
                                                                                                                                                c5128l3 = c5128l2;
                                                                                                                                                while (true) {
                                                                                                                                                    if (it7.hasNext()) {
                                                                                                                                                        c16493l = (C16493l) it7.next();
                                                                                                                                                        map7 = map6;
                                                                                                                                                        if (Log.isLoggable(c17417l.mo200else().m2266l(), 2)) {
                                                                                                                                                            C14906l c14906lM2267l = c17417l.mo200else().m2267l();
                                                                                                                                                            if (c16493l.tapsense()) {
                                                                                                                                                                numValueOf4 = Integer.valueOf(c16493l.Signature());
                                                                                                                                                            } else {
                                                                                                                                                                numValueOf4 = null;
                                                                                                                                                            }
                                                                                                                                                            c14906lM2267l.amazon("Evaluating filter. audience, filter, property", num2, numValueOf4, c17417l.subs().crashlytics(c16493l.license()));
                                                                                                                                                            c17417l.mo200else().m2267l().loadAd(c6901l.m2113try().m3722l(c16493l), "Filter definition");
                                                                                                                                                        }
                                                                                                                                                        if (c16493l.tapsense()) {
                                                                                                                                                        }
                                                                                                                                                        C14906l c14906lM2263l = c17417l.mo200else().m2263l();
                                                                                                                                                        C6327l c6327lM2260l = C8118l.m2260l(this.f26230l);
                                                                                                                                                        if (c16493l.tapsense()) {
                                                                                                                                                            numValueOf3 = Integer.valueOf(c16493l.Signature());
                                                                                                                                                        } else {
                                                                                                                                                            numValueOf3 = null;
                                                                                                                                                        }
                                                                                                                                                        c14906lM2263l.crashlytics(c6327lM2260l, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                                                                                        this.f26232l.add(num2);
                                                                                                                                                        map6 = map7;
                                                                                                                                                        c5128l2 = c5128l3;
                                                                                                                                                        it6 = it6;
                                                                                                                                                    } else {
                                                                                                                                                        map7 = map6;
                                                                                                                                                        c5128l3 = c5128l3;
                                                                                                                                                        it6 = it6;
                                                                                                                                                    }
                                                                                                                                                    if (!zLoadAd) {
                                                                                                                                                        this.f26232l.add(num2);
                                                                                                                                                    }
                                                                                                                                                    map6 = map7;
                                                                                                                                                    c5128l2 = c5128l3;
                                                                                                                                                    it6 = it6;
                                                                                                                                                    m3640l(num2).yandex(c13104l);
                                                                                                                                                    iIntValue = i2;
                                                                                                                                                    map6 = map7;
                                                                                                                                                    c5128l3 = c5128l3;
                                                                                                                                                    it6 = it6;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            it4 = it5;
                                                                                                                                            c5128l = c5128l2;
                                                                                                                                        } catch (Throwable th7) {
                                                                                                                                            th = th7;
                                                                                                                                            if (cursor != null) {
                                                                                                                                                cursor.close();
                                                                                                                                            }
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    c17417l5 = c17417l4;
                                                                                                                                    arrayList3 = list5;
                                                                                                                                }
                                                                                                                                arrayList3.add(c16493l2);
                                                                                                                                str10 = str9;
                                                                                                                            } catch (IOException e14) {
                                                                                                                                c17417l5 = c17417l4;
                                                                                                                                str10 = str9;
                                                                                                                                c17417l5.mo200else().m2264l().crashlytics(C8118l.m2260l(str10), e14, "Failed to merge filter");
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                c17417l4 = c17417l5;
                                                                                                                                str9 = str10;
                                                                                                                            } catch (SQLiteException e15) {
                                                                                                                                e = e15;
                                                                                                                                cursor = cursorQuery2;
                                                                                                                                c17417l5.mo200else().m2264l().crashlytics(C8118l.m2260l(str10), e, r10);
                                                                                                                                map6 = Collections.EMPTY_MAP;
                                                                                                                                if (cursor != null) {
                                                                                                                                    cursor.close();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } catch (SQLiteException e16) {
                                                                                                                            e = e16;
                                                                                                                            c17417l5 = c17417l4;
                                                                                                                            str10 = str9;
                                                                                                                            cursor = cursorQuery2;
                                                                                                                            c17417l5.mo200else().m2264l().crashlytics(C8118l.m2260l(str10), e, r10);
                                                                                                                            map6 = Collections.EMPTY_MAP;
                                                                                                                            if (cursor != null) {
                                                                                                                                cursor.close();
                                                                                                                            }
                                                                                                                            c5128l.put(strLicense, map6);
                                                                                                                            it6 = map6.keySet().iterator();
                                                                                                                            c5128l2 = c5128l;
                                                                                                                            while (it6.hasNext()) {
                                                                                                                                num2 = (Integer) it6.next();
                                                                                                                                iIntValue = num2.intValue();
                                                                                                                                if (this.f26232l.contains(num2)) {
                                                                                                                                    c17417l.mo200else().m2267l().loadAd(num2, "Skipping failed audience ID");
                                                                                                                                    break;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                                                                zLoadAd = true;
                                                                                                                                c5128l3 = c5128l2;
                                                                                                                                while (true) {
                                                                                                                                    if (it7.hasNext()) {
                                                                                                                                        c16493l = (C16493l) it7.next();
                                                                                                                                        map7 = map6;
                                                                                                                                        if (Log.isLoggable(c17417l.mo200else().m2266l(), 2)) {
                                                                                                                                            C14906l c14906lM2267l2 = c17417l.mo200else().m2267l();
                                                                                                                                            if (c16493l.tapsense()) {
                                                                                                                                                numValueOf4 = Integer.valueOf(c16493l.Signature());
                                                                                                                                            } else {
                                                                                                                                                numValueOf4 = null;
                                                                                                                                            }
                                                                                                                                            c14906lM2267l2.amazon("Evaluating filter. audience, filter, property", num2, numValueOf4, c17417l.subs().crashlytics(c16493l.license()));
                                                                                                                                            c17417l.mo200else().m2267l().loadAd(c6901l.m2113try().m3722l(c16493l), "Filter definition");
                                                                                                                                        }
                                                                                                                                        if (c16493l.tapsense()) {
                                                                                                                                        }
                                                                                                                                        C14906l c14906lM2263l2 = c17417l.mo200else().m2263l();
                                                                                                                                        C6327l c6327lM2260l2 = C8118l.m2260l(this.f26230l);
                                                                                                                                        if (c16493l.tapsense()) {
                                                                                                                                            numValueOf3 = Integer.valueOf(c16493l.Signature());
                                                                                                                                        } else {
                                                                                                                                            numValueOf3 = null;
                                                                                                                                        }
                                                                                                                                        c14906lM2263l2.crashlytics(c6327lM2260l2, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                                                                        this.f26232l.add(num2);
                                                                                                                                        map6 = map7;
                                                                                                                                        c5128l2 = c5128l3;
                                                                                                                                        it6 = it6;
                                                                                                                                    } else {
                                                                                                                                        map7 = map6;
                                                                                                                                        c5128l3 = c5128l3;
                                                                                                                                        it6 = it6;
                                                                                                                                    }
                                                                                                                                    if (!zLoadAd) {
                                                                                                                                        this.f26232l.add(num2);
                                                                                                                                    }
                                                                                                                                    map6 = map7;
                                                                                                                                    c5128l2 = c5128l3;
                                                                                                                                    it6 = it6;
                                                                                                                                    m3640l(num2).yandex(c13104l);
                                                                                                                                    iIntValue = i2;
                                                                                                                                    map6 = map7;
                                                                                                                                    c5128l3 = c5128l3;
                                                                                                                                    it6 = it6;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            it4 = it5;
                                                                                                                            c5128l = c5128l2;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    cursorQuery2.close();
                                                                                                                    map6 = c11154l5;
                                                                                                                } else {
                                                                                                                    it5 = it4;
                                                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                                                    cursorQuery2.close();
                                                                                                                }
                                                                                                            } catch (SQLiteException e17) {
                                                                                                                e = e17;
                                                                                                                it5 = it4;
                                                                                                            }
                                                                                                            c5128l.put(strLicense, map6);
                                                                                                        } catch (Throwable th8) {
                                                                                                            th = th8;
                                                                                                            cursor = cursorQuery2;
                                                                                                            if (cursor != null) {
                                                                                                                cursor.close();
                                                                                                            }
                                                                                                            throw th;
                                                                                                        }
                                                                                                    } catch (SQLiteException e18) {
                                                                                                        e = e18;
                                                                                                        it5 = it4;
                                                                                                        c17417l5 = c17417l4;
                                                                                                        str10 = str9;
                                                                                                        cursor = null;
                                                                                                    } catch (Throwable th9) {
                                                                                                        th = th9;
                                                                                                        cursor = null;
                                                                                                    }
                                                                                                } else {
                                                                                                    it5 = it4;
                                                                                                }
                                                                                                it6 = map6.keySet().iterator();
                                                                                                c5128l2 = c5128l;
                                                                                                while (it6.hasNext()) {
                                                                                                    num2 = (Integer) it6.next();
                                                                                                    iIntValue = num2.intValue();
                                                                                                    if (this.f26232l.contains(num2)) {
                                                                                                        c17417l.mo200else().m2267l().loadAd(num2, "Skipping failed audience ID");
                                                                                                        break;
                                                                                                        break;
                                                                                                    }
                                                                                                    it7 = ((List) map6.get(num2)).iterator();
                                                                                                    zLoadAd = true;
                                                                                                    c5128l3 = c5128l2;
                                                                                                    while (true) {
                                                                                                        if (it7.hasNext()) {
                                                                                                            c16493l = (C16493l) it7.next();
                                                                                                            map7 = map6;
                                                                                                            if (Log.isLoggable(c17417l.mo200else().m2266l(), 2)) {
                                                                                                                C14906l c14906lM2267l3 = c17417l.mo200else().m2267l();
                                                                                                                if (c16493l.tapsense()) {
                                                                                                                    numValueOf4 = Integer.valueOf(c16493l.Signature());
                                                                                                                } else {
                                                                                                                    numValueOf4 = null;
                                                                                                                }
                                                                                                                c14906lM2267l3.amazon("Evaluating filter. audience, filter, property", num2, numValueOf4, c17417l.subs().crashlytics(c16493l.license()));
                                                                                                                c17417l.mo200else().m2267l().loadAd(c6901l.m2113try().m3722l(c16493l), "Filter definition");
                                                                                                            }
                                                                                                            if (c16493l.tapsense()) {
                                                                                                            }
                                                                                                            C14906l c14906lM2263l3 = c17417l.mo200else().m2263l();
                                                                                                            C6327l c6327lM2260l3 = C8118l.m2260l(this.f26230l);
                                                                                                            if (c16493l.tapsense()) {
                                                                                                                numValueOf3 = Integer.valueOf(c16493l.Signature());
                                                                                                            } else {
                                                                                                                numValueOf3 = null;
                                                                                                            }
                                                                                                            c14906lM2263l3.crashlytics(c6327lM2260l3, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                                            this.f26232l.add(num2);
                                                                                                            map6 = map7;
                                                                                                            c5128l2 = c5128l3;
                                                                                                            it6 = it6;
                                                                                                        } else {
                                                                                                            map7 = map6;
                                                                                                            c5128l3 = c5128l3;
                                                                                                            it6 = it6;
                                                                                                        }
                                                                                                        if (!zLoadAd) {
                                                                                                            this.f26232l.add(num2);
                                                                                                        }
                                                                                                        map6 = map7;
                                                                                                        c5128l2 = c5128l3;
                                                                                                        it6 = it6;
                                                                                                        m3640l(num2).yandex(c13104l);
                                                                                                        iIntValue = i2;
                                                                                                        map6 = map7;
                                                                                                        c5128l3 = c5128l3;
                                                                                                        it6 = it6;
                                                                                                    }
                                                                                                }
                                                                                                it4 = it5;
                                                                                                c5128l = c5128l2;
                                                                                            }
                                                                                        }
                                                                                        arrayList2 = new ArrayList();
                                                                                        C5386l<Integer> c5386l = (C5386l) this.f26228l.keySet();
                                                                                        c5386l.removeAll(this.f26232l);
                                                                                        for (Integer num7 : c5386l) {
                                                                                            int iIntValue3 = num7.intValue();
                                                                                            C6360l c6360l2 = (C6360l) this.f26228l.get(num7);
                                                                                            AbstractC1051l.subs(c6360l2);
                                                                                            C6812l c6812lLoadAd = c6360l2.loadAd(iIntValue3);
                                                                                            arrayList2.add(c6812lLoadAd);
                                                                                            c8648lM2104public2 = c6901l.m2104public();
                                                                                            c17417l3 = (C17417l) c8648lM2104public2.f833l;
                                                                                            str8 = this.f26230l;
                                                                                            C0450l c0450lLicense = c6812lLoadAd.license();
                                                                                            c8648lM2104public2.m2927l();
                                                                                            c8648lM2104public2.mo211l();
                                                                                            AbstractC1051l.billing(str8);
                                                                                            AbstractC1051l.subs(c0450lLicense);
                                                                                            byte[] bArrYandex = c0450lLicense.yandex();
                                                                                            contentValues = new ContentValues();
                                                                                            contentValues.put("app_id", str8);
                                                                                            contentValues.put(str5, num7);
                                                                                            contentValues.put("current_results", bArrYandex);
                                                                                            try {
                                                                                                try {
                                                                                                    if (c8648lM2104public2.m2395l().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                                        c17417l3.mo200else().m2264l().loadAd(C8118l.m2260l(str8), "Failed to insert filter results (got -1). appId");
                                                                                                    }
                                                                                                } catch (SQLiteException e19) {
                                                                                                    e = e19;
                                                                                                    c17417l3.mo200else().m2264l().crashlytics(C8118l.m2260l(str8), e, "Error storing filter results. appId");
                                                                                                }
                                                                                            } catch (SQLiteException e20) {
                                                                                                e = e20;
                                                                                            }
                                                                                        }
                                                                                        return arrayList2;
                                                                                    }
                                                                                } catch (SQLiteException e21) {
                                                                                    e = e21;
                                                                                    cursorRawQuery = null;
                                                                                } catch (Throwable th10) {
                                                                                    th = th10;
                                                                                    r7 = 0;
                                                                                    if (r7 != 0) {
                                                                                        r7.close();
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                                cursorRawQuery.close();
                                                                                r0 = c11154l3;
                                                                                AbstractC1051l.billing(str17);
                                                                                c11154l4 = new C11154l();
                                                                                if (!map2.isEmpty()) {
                                                                                    it2 = map2.keySet().iterator();
                                                                                    while (it2.hasNext()) {
                                                                                        num = (Integer) it2.next();
                                                                                        num.getClass();
                                                                                        c0450l3 = (C0450l) map2.get(num);
                                                                                        list4 = (List) r0.get(num);
                                                                                        if (list4 != null) {
                                                                                        }
                                                                                        r18 = r0;
                                                                                        it3 = it2;
                                                                                        c17417l2 = c17417l6;
                                                                                        c11154l4.put(num, c0450l3);
                                                                                        r0 = r18;
                                                                                        str15 = str15;
                                                                                        it2 = it3;
                                                                                        c17417l6 = c17417l2;
                                                                                    }
                                                                                }
                                                                                str4 = str15;
                                                                                c17417l = c17417l6;
                                                                                map3 = c11154l4;
                                                                            } catch (Throwable th11) {
                                                                                th = th11;
                                                                                r7 = hashSet;
                                                                            }
                                                                        } else {
                                                                            str4 = "audience_id";
                                                                            c17417l = c17417l6;
                                                                            map3 = map2;
                                                                        }
                                                                        map5 = map3;
                                                                        map4 = map2;
                                                                        while (r17.hasNext()) {
                                                                            num4.getClass();
                                                                            c0450l = (C0450l) map5.get(num4);
                                                                            bitSet = new BitSet();
                                                                            bitSet2 = new BitSet();
                                                                            c11154l = new C11154l();
                                                                            if (c0450l != null) {
                                                                                while (r3.hasNext()) {
                                                                                    if (c16986l.tapsense()) {
                                                                                        C0450l c0450l7 = c0450l;
                                                                                        Integer numValueOf10 = Integer.valueOf(c16986l.Signature());
                                                                                        if (c16986l.license()) {
                                                                                            lValueOf = Long.valueOf(c16986l.pro());
                                                                                        } else {
                                                                                            lValueOf = null;
                                                                                        }
                                                                                        c11154l.put(numValueOf10, lValueOf);
                                                                                        c0450l = c0450l7;
                                                                                    }
                                                                                }
                                                                            }
                                                                            c0450l2 = c0450l;
                                                                            c11154l2 = new C11154l();
                                                                            if (c0450l2 != null) {
                                                                                it = c0450l2.isVip().iterator();
                                                                                while (it.hasNext()) {
                                                                                    c8888l = (C8888l) it.next();
                                                                                    if (!c8888l.tapsense()) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            Map map13 = map5;
                                                                            if (c0450l2 != null) {
                                                                                i = 0;
                                                                                while (i < c0450l2.Signature() * 64) {
                                                                                    if (C13718l.m3689l((InterfaceC11831l) c0450l2.tapsense(), i)) {
                                                                                        z4 = zM1682l;
                                                                                        c17417l.mo200else().m2267l().crashlytics(num4, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                                        bitSet2.set(i);
                                                                                        if (C13718l.m3689l((InterfaceC11831l) c0450l2.license(), i)) {
                                                                                            bitSet.set(i);
                                                                                        }
                                                                                        i++;
                                                                                        zM1682l = z4;
                                                                                    } else {
                                                                                        z4 = zM1682l;
                                                                                    }
                                                                                    c11154l.remove(Integer.valueOf(i));
                                                                                    i++;
                                                                                    zM1682l = z4;
                                                                                }
                                                                            }
                                                                            boolean z7 = zM1682l;
                                                                            C0450l c0450l8 = (C0450l) map4.get(num4);
                                                                            if (zM1682l2) {
                                                                                while (r2.hasNext()) {
                                                                                    int iSignature3 = c9540l2.Signature();
                                                                                    Integer num8 = num4;
                                                                                    jLongValue = this.f26231l.longValue() / 1000;
                                                                                    if (c9540l2.applovin()) {
                                                                                        jLongValue = this.f26229l.longValue() / 1000;
                                                                                    }
                                                                                    numValueOf = Integer.valueOf(iSignature3);
                                                                                    if (c11154l.containsKey(numValueOf)) {
                                                                                        c11154l.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    if (c11154l2.containsKey(numValueOf)) {
                                                                                        c11154l2.put(numValueOf, Long.valueOf(jLongValue));
                                                                                    }
                                                                                    num4 = num8;
                                                                                }
                                                                            }
                                                                            this.f26228l.put(num4, new C6360l(this, this.f26230l, c0450l8, bitSet, bitSet2, c11154l, c11154l2));
                                                                            map = map;
                                                                            zM1682l = z7;
                                                                            map4 = map4;
                                                                            zM1682l2 = zM1682l2;
                                                                            str3 = str3;
                                                                            map5 = map13;
                                                                        }
                                                                        str5 = str4;
                                                                    }
                                                                    str7 = str2;
                                                                    String str19 = str3;
                                                                    ?? r11 = obj2;
                                                                    if (!list.isEmpty()) {
                                                                        c0093l = new C0093l(this);
                                                                        c11154l6 = new C11154l();
                                                                        while (r17.hasNext()) {
                                                                            c1841lAmazon = c0093l.amazon(this.f26230l, c1841l);
                                                                            if (c1841lAmazon != null) {
                                                                                c6491lM2365l = c6901l.m2104public().m2365l(this.f26230l, c1841l, c1841lAmazon.advert());
                                                                                c6901l.m2104public().m2388l("events", c6491lM2365l);
                                                                                if (z) {
                                                                                    j = c6491lM2365l.crashlytics;
                                                                                    strAdvert = c1841lAmazon.advert();
                                                                                    map8 = (Map) c11154l6.get(strAdvert);
                                                                                    if (map8 == null) {
                                                                                        C8648l c8648lM2104public8 = c6901l.m2104public();
                                                                                        C17417l c17417l9 = (C17417l) c8648lM2104public8.f833l;
                                                                                        str11 = this.f26230l;
                                                                                        c8648lM2104public8.m2927l();
                                                                                        c8648lM2104public8.mo211l();
                                                                                        AbstractC1051l.billing(str11);
                                                                                        AbstractC1051l.billing(strAdvert);
                                                                                        c11154l7 = new C11154l();
                                                                                        Query = c8648lM2104public8.m2395l().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strAdvert}, null, null, null);
                                                                                        if (Query.moveToFirst()) {
                                                                                            str12 = str11;
                                                                                            Query = Query;
                                                                                            r46 = list;
                                                                                            while (true) {
                                                                                                C9540l c9540l6 = (C9540l) ((C6122l) C13718l.m3698l(C9540l.m2679throws(), Query.getBlob(1))).amazon();
                                                                                                numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                                list6 = (List) c11154l7.get(numValueOf6);
                                                                                                if (list6 == null) {
                                                                                                    r46 = Query;
                                                                                                    arrayList4 = new ArrayList();
                                                                                                    c11154l7.put(numValueOf6, arrayList4);
                                                                                                    r48 = r46;
                                                                                                } else {
                                                                                                    r48 = Query;
                                                                                                    arrayList4 = list6;
                                                                                                }
                                                                                                arrayList4.add(c9540l6);
                                                                                                r47 = r48;
                                                                                                if (!r47.moveToNext()) {
                                                                                                    break;
                                                                                                    break;
                                                                                                }
                                                                                                Query = r47;
                                                                                                r46 = r47;
                                                                                            }
                                                                                            r47.close();
                                                                                            map8 = c11154l7;
                                                                                            r43 = r47;
                                                                                        } else {
                                                                                            ?? r410 = Query;
                                                                                            map8 = Collections.EMPTY_MAP;
                                                                                            r410.close();
                                                                                            r43 = r410;
                                                                                        }
                                                                                        c11154l6.put(strAdvert, map8);
                                                                                        list = r43;
                                                                                    } else {
                                                                                        list = list;
                                                                                    }
                                                                                    while (r19.hasNext()) {
                                                                                        iIntValue2 = num6.intValue();
                                                                                        if (this.f26232l.contains(num6)) {
                                                                                            c17417l.mo200else().m2267l().loadAd(num6, "Skipping failed audience ID");
                                                                                        } else {
                                                                                            it8 = ((List) map8.get(num6)).iterator();
                                                                                            zYandex = true;
                                                                                            while (true) {
                                                                                                if (!it8.hasNext()) {
                                                                                                    map9 = map8;
                                                                                                    c0093l2 = c0093l;
                                                                                                    num3 = num6;
                                                                                                    break;
                                                                                                }
                                                                                                C9540l c9540l7 = (C9540l) it8.next();
                                                                                                c0093l2 = c0093l;
                                                                                                num3 = num6;
                                                                                                map9 = map8;
                                                                                                c13104l2 = new C13104l(this, this.f26230l, iIntValue2, c9540l7, 0);
                                                                                                Long l7 = this.f26229l;
                                                                                                Long l8 = this.f26231l;
                                                                                                iSignature = c9540l7.Signature();
                                                                                                c6360l = (C6360l) this.f26228l.get(num3);
                                                                                                if (c6360l == null) {
                                                                                                    z5 = false;
                                                                                                } else {
                                                                                                    z5 = c6360l.amazon.get(iSignature);
                                                                                                }
                                                                                                zYandex = c13104l2.yandex(l7, l8, c1841lAmazon, j, c6491lM2365l, z5);
                                                                                                if (!zYandex) {
                                                                                                    this.f26232l.add(num3);
                                                                                                    break;
                                                                                                }
                                                                                                m3640l(num3).yandex(c13104l2);
                                                                                                num6 = num3;
                                                                                                map8 = map9;
                                                                                                c0093l = c0093l2;
                                                                                            }
                                                                                            if (!zYandex) {
                                                                                                this.f26232l.add(num3);
                                                                                            }
                                                                                            c0093l = c0093l2;
                                                                                            map8 = map9;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    continue;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    if (!z) {
                                                                        return new ArrayList();
                                                                    }
                                                                    if (!list2.isEmpty()) {
                                                                        C11154l c11154l11 = new C11154l();
                                                                        it4 = list2.iterator();
                                                                        c5128l = c11154l11;
                                                                        while (it4.hasNext()) {
                                                                            C8252l c8252l2 = (C8252l) it4.next();
                                                                            strLicense = c8252l2.license();
                                                                            map6 = (Map) c5128l.get(strLicense);
                                                                            if (map6 == null) {
                                                                                C8648l c8648lM2104public9 = c6901l.m2104public();
                                                                                c17417l4 = (C17417l) c8648lM2104public9.f833l;
                                                                                str9 = this.f26230l;
                                                                                c8648lM2104public9.m2927l();
                                                                                c8648lM2104public9.mo211l();
                                                                                AbstractC1051l.billing(str9);
                                                                                AbstractC1051l.billing(strLicense);
                                                                                c11154l5 = new C11154l();
                                                                                cursorQuery2 = c8648lM2104public9.m2395l().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strLicense}, null, null, null);
                                                                                if (cursorQuery2.moveToFirst()) {
                                                                                    it5 = it4;
                                                                                    while (true) {
                                                                                        C16493l c16493l3 = (C16493l) ((C14364l) C13718l.m3698l(C16493l.premium(), cursorQuery2.getBlob(1))).amazon();
                                                                                        numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                        list5 = (List) c11154l5.get(numValueOf5);
                                                                                        if (list5 == null) {
                                                                                            c17417l5 = c17417l4;
                                                                                            arrayList3 = new ArrayList();
                                                                                            c11154l5.put(numValueOf5, arrayList3);
                                                                                        } else {
                                                                                            c17417l5 = c17417l4;
                                                                                            arrayList3 = list5;
                                                                                        }
                                                                                        arrayList3.add(c16493l3);
                                                                                        str10 = str9;
                                                                                        if (!cursorQuery2.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        c17417l4 = c17417l5;
                                                                                        str9 = str10;
                                                                                    }
                                                                                    cursorQuery2.close();
                                                                                    map6 = c11154l5;
                                                                                } else {
                                                                                    it5 = it4;
                                                                                    map6 = Collections.EMPTY_MAP;
                                                                                    cursorQuery2.close();
                                                                                }
                                                                                c5128l.put(strLicense, map6);
                                                                            } else {
                                                                                it5 = it4;
                                                                            }
                                                                            it6 = map6.keySet().iterator();
                                                                            c5128l2 = c5128l;
                                                                            while (it6.hasNext()) {
                                                                                num2 = (Integer) it6.next();
                                                                                iIntValue = num2.intValue();
                                                                                if (this.f26232l.contains(num2)) {
                                                                                    c17417l.mo200else().m2267l().loadAd(num2, "Skipping failed audience ID");
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                it7 = ((List) map6.get(num2)).iterator();
                                                                                zLoadAd = true;
                                                                                c5128l3 = c5128l2;
                                                                                while (true) {
                                                                                    if (it7.hasNext()) {
                                                                                        c16493l = (C16493l) it7.next();
                                                                                        map7 = map6;
                                                                                        if (Log.isLoggable(c17417l.mo200else().m2266l(), 2)) {
                                                                                            C14906l c14906lM2267l4 = c17417l.mo200else().m2267l();
                                                                                            if (c16493l.tapsense()) {
                                                                                                numValueOf4 = Integer.valueOf(c16493l.Signature());
                                                                                            } else {
                                                                                                numValueOf4 = null;
                                                                                            }
                                                                                            c14906lM2267l4.amazon("Evaluating filter. audience, filter, property", num2, numValueOf4, c17417l.subs().crashlytics(c16493l.license()));
                                                                                            c17417l.mo200else().m2267l().loadAd(c6901l.m2113try().m3722l(c16493l), "Filter definition");
                                                                                        }
                                                                                        if (c16493l.tapsense()) {
                                                                                        }
                                                                                        C14906l c14906lM2263l4 = c17417l.mo200else().m2263l();
                                                                                        C6327l c6327lM2260l4 = C8118l.m2260l(this.f26230l);
                                                                                        if (c16493l.tapsense()) {
                                                                                            numValueOf3 = Integer.valueOf(c16493l.Signature());
                                                                                        } else {
                                                                                            numValueOf3 = null;
                                                                                        }
                                                                                        c14906lM2263l4.crashlytics(c6327lM2260l4, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                        this.f26232l.add(num2);
                                                                                        map6 = map7;
                                                                                        c5128l2 = c5128l3;
                                                                                        it6 = it6;
                                                                                    } else {
                                                                                        map7 = map6;
                                                                                        c5128l3 = c5128l3;
                                                                                        it6 = it6;
                                                                                    }
                                                                                    if (!zLoadAd) {
                                                                                        this.f26232l.add(num2);
                                                                                    }
                                                                                    map6 = map7;
                                                                                    c5128l2 = c5128l3;
                                                                                    it6 = it6;
                                                                                    m3640l(num2).yandex(c13104l);
                                                                                    iIntValue = i2;
                                                                                    map6 = map7;
                                                                                    c5128l3 = c5128l3;
                                                                                    it6 = it6;
                                                                                }
                                                                            }
                                                                            it4 = it5;
                                                                            c5128l = c5128l2;
                                                                        }
                                                                    }
                                                                    arrayList2 = new ArrayList();
                                                                    C5386l<Integer> c5386l2 = (C5386l) this.f26228l.keySet();
                                                                    c5386l2.removeAll(this.f26232l);
                                                                    while (r3.hasNext()) {
                                                                        int iIntValue4 = num7.intValue();
                                                                        C6360l c6360l3 = (C6360l) this.f26228l.get(num7);
                                                                        AbstractC1051l.subs(c6360l3);
                                                                        C6812l c6812lLoadAd2 = c6360l3.loadAd(iIntValue4);
                                                                        arrayList2.add(c6812lLoadAd2);
                                                                        c8648lM2104public2 = c6901l.m2104public();
                                                                        c17417l3 = (C17417l) c8648lM2104public2.f833l;
                                                                        str8 = this.f26230l;
                                                                        C0450l c0450lLicense2 = c6812lLoadAd2.license();
                                                                        c8648lM2104public2.m2927l();
                                                                        c8648lM2104public2.mo211l();
                                                                        AbstractC1051l.billing(str8);
                                                                        AbstractC1051l.subs(c0450lLicense2);
                                                                        byte[] bArrYandex2 = c0450lLicense2.yandex();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str8);
                                                                        contentValues.put(str5, num7);
                                                                        contentValues.put("current_results", bArrYandex2);
                                                                        if (c8648lM2104public2.m2395l().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                            c17417l3.mo200else().m2264l().loadAd(C8118l.m2260l(str8), "Failed to insert filter results (got -1). appId");
                                                                        }
                                                                    }
                                                                    return arrayList2;
                                                                }
                                                            }
                                                            try {
                                                                if (!cursorQuery.moveToNext()) {
                                                                    break;
                                                                }
                                                                str14 = str3;
                                                                objM2260l = obj2;
                                                                r21 = r21;
                                                            } catch (SQLiteException e22) {
                                                                e = e22;
                                                                r17.mo200else().m2264l().crashlytics(C8118l.m2260l(r21), e, "Database error querying filter results. appId");
                                                                Map map14 = Collections.EMPTY_MAP;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                map2 = map14;
                                                            }
                                                        } catch (SQLiteException e23) {
                                                            e = e23;
                                                            r21 = r21;
                                                            r17 = r17;
                                                            str3 = str14;
                                                            obj2 = objM2260l;
                                                            r21 = r21;
                                                            r17.mo200else().m2264l().crashlytics(C8118l.m2260l(r21), e, "Database error querying filter results. appId");
                                                            Map map15 = Collections.EMPTY_MAP;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            map2 = map15;
                                                            if (map2.isEmpty()) {
                                                                str5 = "audience_id";
                                                                c17417l = c17417l6;
                                                            } else {
                                                                HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
                                                                if (z3) {
                                                                    String str110 = this.f26230l;
                                                                    c8648lM2104public = c6901l.m2104public();
                                                                    str6 = this.f26230l;
                                                                    c8648lM2104public.m2927l();
                                                                    c8648lM2104public.mo211l();
                                                                    AbstractC1051l.billing(str6);
                                                                    c11154l3 = new C11154l();
                                                                    cursorRawQuery = c8648lM2104public.m2395l().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) c11154l3.get(numValueOf2);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                c11154l3.put(numValueOf2, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                    } else {
                                                                        c11154l3 = Collections.EMPTY_MAP;
                                                                    }
                                                                    cursorRawQuery.close();
                                                                    r0 = c11154l3;
                                                                    AbstractC1051l.billing(str110);
                                                                    c11154l4 = new C11154l();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            num = (Integer) it2.next();
                                                                            num.getClass();
                                                                            c0450l3 = (C0450l) map2.get(num);
                                                                            list4 = (List) r0.get(num);
                                                                            if (list4 != null) {
                                                                            }
                                                                            r18 = r0;
                                                                            it3 = it2;
                                                                            c17417l2 = c17417l6;
                                                                            c11154l4.put(num, c0450l3);
                                                                            r0 = r18;
                                                                            str15 = str15;
                                                                            it2 = it3;
                                                                            c17417l6 = c17417l2;
                                                                        }
                                                                    }
                                                                    str4 = str15;
                                                                    c17417l = c17417l6;
                                                                    map3 = c11154l4;
                                                                } else {
                                                                    str4 = "audience_id";
                                                                    c17417l = c17417l6;
                                                                    map3 = map2;
                                                                }
                                                                map5 = map3;
                                                                map4 = map2;
                                                                while (r17.hasNext()) {
                                                                    num4.getClass();
                                                                    c0450l = (C0450l) map5.get(num4);
                                                                    bitSet = new BitSet();
                                                                    bitSet2 = new BitSet();
                                                                    c11154l = new C11154l();
                                                                    if (c0450l != null) {
                                                                        while (r3.hasNext()) {
                                                                            if (c16986l.tapsense()) {
                                                                                C0450l c0450l9 = c0450l;
                                                                                Integer numValueOf11 = Integer.valueOf(c16986l.Signature());
                                                                                if (c16986l.license()) {
                                                                                    lValueOf = Long.valueOf(c16986l.pro());
                                                                                } else {
                                                                                    lValueOf = null;
                                                                                }
                                                                                c11154l.put(numValueOf11, lValueOf);
                                                                                c0450l = c0450l9;
                                                                            }
                                                                        }
                                                                    }
                                                                    c0450l2 = c0450l;
                                                                    c11154l2 = new C11154l();
                                                                    if (c0450l2 != null) {
                                                                        it = c0450l2.isVip().iterator();
                                                                        while (it.hasNext()) {
                                                                            c8888l = (C8888l) it.next();
                                                                            if (!c8888l.tapsense()) {
                                                                            }
                                                                        }
                                                                    }
                                                                    Map map16 = map5;
                                                                    if (c0450l2 != null) {
                                                                        i = 0;
                                                                        while (i < c0450l2.Signature() * 64) {
                                                                            if (C13718l.m3689l((InterfaceC11831l) c0450l2.tapsense(), i)) {
                                                                                z4 = zM1682l;
                                                                                c17417l.mo200else().m2267l().crashlytics(num4, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                                bitSet2.set(i);
                                                                                if (C13718l.m3689l((InterfaceC11831l) c0450l2.license(), i)) {
                                                                                    bitSet.set(i);
                                                                                }
                                                                                i++;
                                                                                zM1682l = z4;
                                                                            } else {
                                                                                z4 = zM1682l;
                                                                            }
                                                                            c11154l.remove(Integer.valueOf(i));
                                                                            i++;
                                                                            zM1682l = z4;
                                                                        }
                                                                    }
                                                                    boolean z8 = zM1682l;
                                                                    C0450l c0450l10 = (C0450l) map4.get(num4);
                                                                    if (zM1682l2) {
                                                                        while (r2.hasNext()) {
                                                                            int iSignature4 = c9540l2.Signature();
                                                                            Integer num9 = num4;
                                                                            jLongValue = this.f26231l.longValue() / 1000;
                                                                            if (c9540l2.applovin()) {
                                                                                jLongValue = this.f26229l.longValue() / 1000;
                                                                            }
                                                                            numValueOf = Integer.valueOf(iSignature4);
                                                                            if (c11154l.containsKey(numValueOf)) {
                                                                                c11154l.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            if (c11154l2.containsKey(numValueOf)) {
                                                                                c11154l2.put(numValueOf, Long.valueOf(jLongValue));
                                                                            }
                                                                            num4 = num9;
                                                                        }
                                                                    }
                                                                    this.f26228l.put(num4, new C6360l(this, this.f26230l, c0450l10, bitSet, bitSet2, c11154l, c11154l2));
                                                                    map = map;
                                                                    zM1682l = z8;
                                                                    map4 = map4;
                                                                    zM1682l2 = zM1682l2;
                                                                    str3 = str3;
                                                                    map5 = map16;
                                                                }
                                                                str5 = str4;
                                                            }
                                                            str7 = str2;
                                                            String str111 = str3;
                                                            ?? r12 = obj2;
                                                            if (!list.isEmpty()) {
                                                                c0093l = new C0093l(this);
                                                                c11154l6 = new C11154l();
                                                                while (r17.hasNext()) {
                                                                    c1841lAmazon = c0093l.amazon(this.f26230l, c1841l);
                                                                    if (c1841lAmazon != null) {
                                                                        c6491lM2365l = c6901l.m2104public().m2365l(this.f26230l, c1841l, c1841lAmazon.advert());
                                                                        c6901l.m2104public().m2388l("events", c6491lM2365l);
                                                                        if (z) {
                                                                            j = c6491lM2365l.crashlytics;
                                                                            strAdvert = c1841lAmazon.advert();
                                                                            map8 = (Map) c11154l6.get(strAdvert);
                                                                            if (map8 == null) {
                                                                                C8648l c8648lM2104public10 = c6901l.m2104public();
                                                                                C17417l c17417l10 = (C17417l) c8648lM2104public10.f833l;
                                                                                str11 = this.f26230l;
                                                                                c8648lM2104public10.m2927l();
                                                                                c8648lM2104public10.mo211l();
                                                                                AbstractC1051l.billing(str11);
                                                                                AbstractC1051l.billing(strAdvert);
                                                                                c11154l7 = new C11154l();
                                                                                Query = c8648lM2104public10.m2395l().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strAdvert}, null, null, null);
                                                                                if (Query.moveToFirst()) {
                                                                                    str12 = str11;
                                                                                    Query = Query;
                                                                                    r46 = list;
                                                                                    while (true) {
                                                                                        C9540l c9540l8 = (C9540l) ((C6122l) C13718l.m3698l(C9540l.m2679throws(), Query.getBlob(1))).amazon();
                                                                                        numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                                        list6 = (List) c11154l7.get(numValueOf6);
                                                                                        if (list6 == null) {
                                                                                            r46 = Query;
                                                                                            arrayList4 = new ArrayList();
                                                                                            c11154l7.put(numValueOf6, arrayList4);
                                                                                            r48 = r46;
                                                                                        } else {
                                                                                            r48 = Query;
                                                                                            arrayList4 = list6;
                                                                                        }
                                                                                        arrayList4.add(c9540l8);
                                                                                        r47 = r48;
                                                                                        if (!r47.moveToNext()) {
                                                                                            break;
                                                                                            break;
                                                                                        }
                                                                                        Query = r47;
                                                                                        r46 = r47;
                                                                                    }
                                                                                    r47.close();
                                                                                    map8 = c11154l7;
                                                                                    r43 = r47;
                                                                                } else {
                                                                                    ?? r411 = Query;
                                                                                    map8 = Collections.EMPTY_MAP;
                                                                                    r411.close();
                                                                                    r43 = r411;
                                                                                }
                                                                                c11154l6.put(strAdvert, map8);
                                                                                list = r43;
                                                                            } else {
                                                                                list = list;
                                                                            }
                                                                            while (r19.hasNext()) {
                                                                                iIntValue2 = num6.intValue();
                                                                                if (this.f26232l.contains(num6)) {
                                                                                    c17417l.mo200else().m2267l().loadAd(num6, "Skipping failed audience ID");
                                                                                } else {
                                                                                    it8 = ((List) map8.get(num6)).iterator();
                                                                                    zYandex = true;
                                                                                    while (true) {
                                                                                        if (!it8.hasNext()) {
                                                                                            map9 = map8;
                                                                                            c0093l2 = c0093l;
                                                                                            num3 = num6;
                                                                                            break;
                                                                                        }
                                                                                        C9540l c9540l9 = (C9540l) it8.next();
                                                                                        c0093l2 = c0093l;
                                                                                        num3 = num6;
                                                                                        map9 = map8;
                                                                                        c13104l2 = new C13104l(this, this.f26230l, iIntValue2, c9540l9, 0);
                                                                                        Long l9 = this.f26229l;
                                                                                        Long l10 = this.f26231l;
                                                                                        iSignature = c9540l9.Signature();
                                                                                        c6360l = (C6360l) this.f26228l.get(num3);
                                                                                        if (c6360l == null) {
                                                                                            z5 = false;
                                                                                        } else {
                                                                                            z5 = c6360l.amazon.get(iSignature);
                                                                                        }
                                                                                        zYandex = c13104l2.yandex(l9, l10, c1841lAmazon, j, c6491lM2365l, z5);
                                                                                        if (!zYandex) {
                                                                                            this.f26232l.add(num3);
                                                                                            break;
                                                                                        }
                                                                                        m3640l(num3).yandex(c13104l2);
                                                                                        num6 = num3;
                                                                                        map8 = map9;
                                                                                        c0093l = c0093l2;
                                                                                    }
                                                                                    if (!zYandex) {
                                                                                        this.f26232l.add(num3);
                                                                                    }
                                                                                    c0093l = c0093l2;
                                                                                    map8 = map9;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (!z) {
                                                                return new ArrayList();
                                                            }
                                                            if (!list2.isEmpty()) {
                                                                C11154l c11154l12 = new C11154l();
                                                                it4 = list2.iterator();
                                                                c5128l = c11154l12;
                                                                while (it4.hasNext()) {
                                                                    C8252l c8252l3 = (C8252l) it4.next();
                                                                    strLicense = c8252l3.license();
                                                                    map6 = (Map) c5128l.get(strLicense);
                                                                    if (map6 == null) {
                                                                        C8648l c8648lM2104public11 = c6901l.m2104public();
                                                                        c17417l4 = (C17417l) c8648lM2104public11.f833l;
                                                                        str9 = this.f26230l;
                                                                        c8648lM2104public11.m2927l();
                                                                        c8648lM2104public11.mo211l();
                                                                        AbstractC1051l.billing(str9);
                                                                        AbstractC1051l.billing(strLicense);
                                                                        c11154l5 = new C11154l();
                                                                        cursorQuery2 = c8648lM2104public11.m2395l().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strLicense}, null, null, null);
                                                                        if (cursorQuery2.moveToFirst()) {
                                                                            it5 = it4;
                                                                            while (true) {
                                                                                C16493l c16493l4 = (C16493l) ((C14364l) C13718l.m3698l(C16493l.premium(), cursorQuery2.getBlob(1))).amazon();
                                                                                numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                list5 = (List) c11154l5.get(numValueOf5);
                                                                                if (list5 == null) {
                                                                                    c17417l5 = c17417l4;
                                                                                    arrayList3 = new ArrayList();
                                                                                    c11154l5.put(numValueOf5, arrayList3);
                                                                                } else {
                                                                                    c17417l5 = c17417l4;
                                                                                    arrayList3 = list5;
                                                                                }
                                                                                arrayList3.add(c16493l4);
                                                                                str10 = str9;
                                                                                if (!cursorQuery2.moveToNext()) {
                                                                                    break;
                                                                                    break;
                                                                                }
                                                                                c17417l4 = c17417l5;
                                                                                str9 = str10;
                                                                            }
                                                                            cursorQuery2.close();
                                                                            map6 = c11154l5;
                                                                        } else {
                                                                            it5 = it4;
                                                                            map6 = Collections.EMPTY_MAP;
                                                                            cursorQuery2.close();
                                                                        }
                                                                        c5128l.put(strLicense, map6);
                                                                    } else {
                                                                        it5 = it4;
                                                                    }
                                                                    it6 = map6.keySet().iterator();
                                                                    c5128l2 = c5128l;
                                                                    while (it6.hasNext()) {
                                                                        num2 = (Integer) it6.next();
                                                                        iIntValue = num2.intValue();
                                                                        if (this.f26232l.contains(num2)) {
                                                                            c17417l.mo200else().m2267l().loadAd(num2, "Skipping failed audience ID");
                                                                            break;
                                                                            break;
                                                                        }
                                                                        it7 = ((List) map6.get(num2)).iterator();
                                                                        zLoadAd = true;
                                                                        c5128l3 = c5128l2;
                                                                        while (true) {
                                                                            if (it7.hasNext()) {
                                                                                c16493l = (C16493l) it7.next();
                                                                                map7 = map6;
                                                                                if (Log.isLoggable(c17417l.mo200else().m2266l(), 2)) {
                                                                                    C14906l c14906lM2267l5 = c17417l.mo200else().m2267l();
                                                                                    if (c16493l.tapsense()) {
                                                                                        numValueOf4 = Integer.valueOf(c16493l.Signature());
                                                                                    } else {
                                                                                        numValueOf4 = null;
                                                                                    }
                                                                                    c14906lM2267l5.amazon("Evaluating filter. audience, filter, property", num2, numValueOf4, c17417l.subs().crashlytics(c16493l.license()));
                                                                                    c17417l.mo200else().m2267l().loadAd(c6901l.m2113try().m3722l(c16493l), "Filter definition");
                                                                                }
                                                                                if (c16493l.tapsense()) {
                                                                                }
                                                                                C14906l c14906lM2263l5 = c17417l.mo200else().m2263l();
                                                                                C6327l c6327lM2260l5 = C8118l.m2260l(this.f26230l);
                                                                                if (c16493l.tapsense()) {
                                                                                    numValueOf3 = Integer.valueOf(c16493l.Signature());
                                                                                } else {
                                                                                    numValueOf3 = null;
                                                                                }
                                                                                c14906lM2263l5.crashlytics(c6327lM2260l5, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                                this.f26232l.add(num2);
                                                                                map6 = map7;
                                                                                c5128l2 = c5128l3;
                                                                                it6 = it6;
                                                                            } else {
                                                                                map7 = map6;
                                                                                c5128l3 = c5128l3;
                                                                                it6 = it6;
                                                                            }
                                                                            if (!zLoadAd) {
                                                                                this.f26232l.add(num2);
                                                                            }
                                                                            map6 = map7;
                                                                            c5128l2 = c5128l3;
                                                                            it6 = it6;
                                                                            m3640l(num2).yandex(c13104l);
                                                                            iIntValue = i2;
                                                                            map6 = map7;
                                                                            c5128l3 = c5128l3;
                                                                            it6 = it6;
                                                                        }
                                                                    }
                                                                    it4 = it5;
                                                                    c5128l = c5128l2;
                                                                }
                                                            }
                                                            arrayList2 = new ArrayList();
                                                            C5386l<Integer> c5386l3 = (C5386l) this.f26228l.keySet();
                                                            c5386l3.removeAll(this.f26232l);
                                                            while (r3.hasNext()) {
                                                                int iIntValue5 = num7.intValue();
                                                                C6360l c6360l4 = (C6360l) this.f26228l.get(num7);
                                                                AbstractC1051l.subs(c6360l4);
                                                                C6812l c6812lLoadAd3 = c6360l4.loadAd(iIntValue5);
                                                                arrayList2.add(c6812lLoadAd3);
                                                                c8648lM2104public2 = c6901l.m2104public();
                                                                c17417l3 = (C17417l) c8648lM2104public2.f833l;
                                                                str8 = this.f26230l;
                                                                C0450l c0450lLicense3 = c6812lLoadAd3.license();
                                                                c8648lM2104public2.m2927l();
                                                                c8648lM2104public2.mo211l();
                                                                AbstractC1051l.billing(str8);
                                                                AbstractC1051l.subs(c0450lLicense3);
                                                                byte[] bArrYandex3 = c0450lLicense3.yandex();
                                                                contentValues = new ContentValues();
                                                                contentValues.put("app_id", str8);
                                                                contentValues.put(str5, num7);
                                                                contentValues.put("current_results", bArrYandex3);
                                                                if (c8648lM2104public2.m2395l().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                    c17417l3.mo200else().m2264l().loadAd(C8118l.m2260l(str8), "Failed to insert filter results (got -1). appId");
                                                                }
                                                            }
                                                            return arrayList2;
                                                        }
                                                    }
                                                    cursorQuery.close();
                                                    obj = obj3;
                                                    r5 = r6;
                                                    map2 = c11154l8;
                                                } else {
                                                    Map map17 = Collections.EMPTY_MAP;
                                                    cursorQuery.close();
                                                    map2 = map17;
                                                    str3 = "Failed to merge filter. appId";
                                                    obj2 = "Database error querying filters. appId";
                                                    obj = obj;
                                                    r5 = r5;
                                                }
                                                if (map2.isEmpty()) {
                                                    str5 = "audience_id";
                                                    c17417l = c17417l6;
                                                } else {
                                                    HashSet<Integer> hashSet3 = new HashSet(map2.keySet());
                                                    if (z3) {
                                                        String str112 = this.f26230l;
                                                        c8648lM2104public = c6901l.m2104public();
                                                        str6 = this.f26230l;
                                                        c8648lM2104public.m2927l();
                                                        c8648lM2104public.mo211l();
                                                        AbstractC1051l.billing(str6);
                                                        c11154l3 = new C11154l();
                                                        cursorRawQuery = c8648lM2104public.m2395l().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                                        if (cursorRawQuery.moveToFirst()) {
                                                            do {
                                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                arrayList = (List) c11154l3.get(numValueOf2);
                                                                if (arrayList == null) {
                                                                    arrayList = new ArrayList();
                                                                    c11154l3.put(numValueOf2, arrayList);
                                                                }
                                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                            } while (cursorRawQuery.moveToNext());
                                                        } else {
                                                            c11154l3 = Collections.EMPTY_MAP;
                                                        }
                                                        cursorRawQuery.close();
                                                        r0 = c11154l3;
                                                        AbstractC1051l.billing(str112);
                                                        c11154l4 = new C11154l();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                num = (Integer) it2.next();
                                                                num.getClass();
                                                                c0450l3 = (C0450l) map2.get(num);
                                                                list4 = (List) r0.get(num);
                                                                if (list4 != null) {
                                                                }
                                                                r18 = r0;
                                                                it3 = it2;
                                                                c17417l2 = c17417l6;
                                                                c11154l4.put(num, c0450l3);
                                                                r0 = r18;
                                                                str15 = str15;
                                                                it2 = it3;
                                                                c17417l6 = c17417l2;
                                                            }
                                                        }
                                                        str4 = str15;
                                                        c17417l = c17417l6;
                                                        map3 = c11154l4;
                                                    } else {
                                                        str4 = "audience_id";
                                                        c17417l = c17417l6;
                                                        map3 = map2;
                                                    }
                                                    map5 = map3;
                                                    map4 = map2;
                                                    while (r17.hasNext()) {
                                                        num4.getClass();
                                                        c0450l = (C0450l) map5.get(num4);
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        c11154l = new C11154l();
                                                        if (c0450l != null) {
                                                            while (r3.hasNext()) {
                                                                if (c16986l.tapsense()) {
                                                                    C0450l c0450l11 = c0450l;
                                                                    Integer numValueOf12 = Integer.valueOf(c16986l.Signature());
                                                                    if (c16986l.license()) {
                                                                        lValueOf = Long.valueOf(c16986l.pro());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    c11154l.put(numValueOf12, lValueOf);
                                                                    c0450l = c0450l11;
                                                                }
                                                            }
                                                        }
                                                        c0450l2 = c0450l;
                                                        c11154l2 = new C11154l();
                                                        if (c0450l2 != null) {
                                                            it = c0450l2.isVip().iterator();
                                                            while (it.hasNext()) {
                                                                c8888l = (C8888l) it.next();
                                                                if (!c8888l.tapsense()) {
                                                                }
                                                            }
                                                        }
                                                        Map map18 = map5;
                                                        if (c0450l2 != null) {
                                                            i = 0;
                                                            while (i < c0450l2.Signature() * 64) {
                                                                if (C13718l.m3689l((InterfaceC11831l) c0450l2.tapsense(), i)) {
                                                                    z4 = zM1682l;
                                                                    c17417l.mo200else().m2267l().crashlytics(num4, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                                    bitSet2.set(i);
                                                                    if (C13718l.m3689l((InterfaceC11831l) c0450l2.license(), i)) {
                                                                        bitSet.set(i);
                                                                    }
                                                                    i++;
                                                                    zM1682l = z4;
                                                                } else {
                                                                    z4 = zM1682l;
                                                                }
                                                                c11154l.remove(Integer.valueOf(i));
                                                                i++;
                                                                zM1682l = z4;
                                                            }
                                                        }
                                                        boolean z9 = zM1682l;
                                                        C0450l c0450l12 = (C0450l) map4.get(num4);
                                                        if (zM1682l2) {
                                                            while (r2.hasNext()) {
                                                                int iSignature5 = c9540l2.Signature();
                                                                Integer num10 = num4;
                                                                jLongValue = this.f26231l.longValue() / 1000;
                                                                if (c9540l2.applovin()) {
                                                                    jLongValue = this.f26229l.longValue() / 1000;
                                                                }
                                                                numValueOf = Integer.valueOf(iSignature5);
                                                                if (c11154l.containsKey(numValueOf)) {
                                                                    c11154l.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                if (c11154l2.containsKey(numValueOf)) {
                                                                    c11154l2.put(numValueOf, Long.valueOf(jLongValue));
                                                                }
                                                                num4 = num10;
                                                            }
                                                        }
                                                        this.f26228l.put(num4, new C6360l(this, this.f26230l, c0450l12, bitSet, bitSet2, c11154l, c11154l2));
                                                        map = map;
                                                        zM1682l = z9;
                                                        map4 = map4;
                                                        zM1682l2 = zM1682l2;
                                                        str3 = str3;
                                                        map5 = map18;
                                                    }
                                                    str5 = str4;
                                                }
                                                str7 = str2;
                                                String str113 = str3;
                                                ?? r13 = obj2;
                                                if (!list.isEmpty()) {
                                                    c0093l = new C0093l(this);
                                                    c11154l6 = new C11154l();
                                                    while (r17.hasNext()) {
                                                        c1841lAmazon = c0093l.amazon(this.f26230l, c1841l);
                                                        if (c1841lAmazon != null) {
                                                            c6491lM2365l = c6901l.m2104public().m2365l(this.f26230l, c1841l, c1841lAmazon.advert());
                                                            c6901l.m2104public().m2388l("events", c6491lM2365l);
                                                            if (z) {
                                                                j = c6491lM2365l.crashlytics;
                                                                strAdvert = c1841lAmazon.advert();
                                                                map8 = (Map) c11154l6.get(strAdvert);
                                                                if (map8 == null) {
                                                                    C8648l c8648lM2104public12 = c6901l.m2104public();
                                                                    C17417l c17417l11 = (C17417l) c8648lM2104public12.f833l;
                                                                    str11 = this.f26230l;
                                                                    c8648lM2104public12.m2927l();
                                                                    c8648lM2104public12.mo211l();
                                                                    AbstractC1051l.billing(str11);
                                                                    AbstractC1051l.billing(strAdvert);
                                                                    c11154l7 = new C11154l();
                                                                    Query = c8648lM2104public12.m2395l().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strAdvert}, null, null, null);
                                                                    if (Query.moveToFirst()) {
                                                                        str12 = str11;
                                                                        Query = Query;
                                                                        r46 = list;
                                                                        while (true) {
                                                                            C9540l c9540l10 = (C9540l) ((C6122l) C13718l.m3698l(C9540l.m2679throws(), Query.getBlob(1))).amazon();
                                                                            numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                                            list6 = (List) c11154l7.get(numValueOf6);
                                                                            if (list6 == null) {
                                                                                r46 = Query;
                                                                                arrayList4 = new ArrayList();
                                                                                c11154l7.put(numValueOf6, arrayList4);
                                                                                r48 = r46;
                                                                            } else {
                                                                                r48 = Query;
                                                                                arrayList4 = list6;
                                                                            }
                                                                            arrayList4.add(c9540l10);
                                                                            r47 = r48;
                                                                            if (!r47.moveToNext()) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            Query = r47;
                                                                            r46 = r47;
                                                                        }
                                                                        r47.close();
                                                                        map8 = c11154l7;
                                                                        r43 = r47;
                                                                    } else {
                                                                        ?? r412 = Query;
                                                                        map8 = Collections.EMPTY_MAP;
                                                                        r412.close();
                                                                        r43 = r412;
                                                                    }
                                                                    c11154l6.put(strAdvert, map8);
                                                                    list = r43;
                                                                } else {
                                                                    list = list;
                                                                }
                                                                while (r19.hasNext()) {
                                                                    iIntValue2 = num6.intValue();
                                                                    if (this.f26232l.contains(num6)) {
                                                                        c17417l.mo200else().m2267l().loadAd(num6, "Skipping failed audience ID");
                                                                    } else {
                                                                        it8 = ((List) map8.get(num6)).iterator();
                                                                        zYandex = true;
                                                                        while (true) {
                                                                            if (!it8.hasNext()) {
                                                                                map9 = map8;
                                                                                c0093l2 = c0093l;
                                                                                num3 = num6;
                                                                                break;
                                                                            }
                                                                            C9540l c9540l11 = (C9540l) it8.next();
                                                                            c0093l2 = c0093l;
                                                                            num3 = num6;
                                                                            map9 = map8;
                                                                            c13104l2 = new C13104l(this, this.f26230l, iIntValue2, c9540l11, 0);
                                                                            Long l11 = this.f26229l;
                                                                            Long l12 = this.f26231l;
                                                                            iSignature = c9540l11.Signature();
                                                                            c6360l = (C6360l) this.f26228l.get(num3);
                                                                            if (c6360l == null) {
                                                                                z5 = false;
                                                                            } else {
                                                                                z5 = c6360l.amazon.get(iSignature);
                                                                            }
                                                                            zYandex = c13104l2.yandex(l11, l12, c1841lAmazon, j, c6491lM2365l, z5);
                                                                            if (!zYandex) {
                                                                                this.f26232l.add(num3);
                                                                                break;
                                                                            }
                                                                            m3640l(num3).yandex(c13104l2);
                                                                            num6 = num3;
                                                                            map8 = map9;
                                                                            c0093l = c0093l2;
                                                                        }
                                                                        if (!zYandex) {
                                                                            this.f26232l.add(num3);
                                                                        }
                                                                        c0093l = c0093l2;
                                                                        map8 = map9;
                                                                    }
                                                                }
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (!z) {
                                                    return new ArrayList();
                                                }
                                                if (!list2.isEmpty()) {
                                                    C11154l c11154l13 = new C11154l();
                                                    it4 = list2.iterator();
                                                    c5128l = c11154l13;
                                                    while (it4.hasNext()) {
                                                        C8252l c8252l4 = (C8252l) it4.next();
                                                        strLicense = c8252l4.license();
                                                        map6 = (Map) c5128l.get(strLicense);
                                                        if (map6 == null) {
                                                            C8648l c8648lM2104public13 = c6901l.m2104public();
                                                            c17417l4 = (C17417l) c8648lM2104public13.f833l;
                                                            str9 = this.f26230l;
                                                            c8648lM2104public13.m2927l();
                                                            c8648lM2104public13.mo211l();
                                                            AbstractC1051l.billing(str9);
                                                            AbstractC1051l.billing(strLicense);
                                                            c11154l5 = new C11154l();
                                                            cursorQuery2 = c8648lM2104public13.m2395l().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strLicense}, null, null, null);
                                                            if (cursorQuery2.moveToFirst()) {
                                                                it5 = it4;
                                                                while (true) {
                                                                    C16493l c16493l5 = (C16493l) ((C14364l) C13718l.m3698l(C16493l.premium(), cursorQuery2.getBlob(1))).amazon();
                                                                    numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                    list5 = (List) c11154l5.get(numValueOf5);
                                                                    if (list5 == null) {
                                                                        c17417l5 = c17417l4;
                                                                        arrayList3 = new ArrayList();
                                                                        c11154l5.put(numValueOf5, arrayList3);
                                                                    } else {
                                                                        c17417l5 = c17417l4;
                                                                        arrayList3 = list5;
                                                                    }
                                                                    arrayList3.add(c16493l5);
                                                                    str10 = str9;
                                                                    if (!cursorQuery2.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    c17417l4 = c17417l5;
                                                                    str9 = str10;
                                                                }
                                                                cursorQuery2.close();
                                                                map6 = c11154l5;
                                                            } else {
                                                                it5 = it4;
                                                                map6 = Collections.EMPTY_MAP;
                                                                cursorQuery2.close();
                                                            }
                                                            c5128l.put(strLicense, map6);
                                                        } else {
                                                            it5 = it4;
                                                        }
                                                        it6 = map6.keySet().iterator();
                                                        c5128l2 = c5128l;
                                                        while (it6.hasNext()) {
                                                            num2 = (Integer) it6.next();
                                                            iIntValue = num2.intValue();
                                                            if (this.f26232l.contains(num2)) {
                                                                c17417l.mo200else().m2267l().loadAd(num2, "Skipping failed audience ID");
                                                                break;
                                                                break;
                                                            }
                                                            it7 = ((List) map6.get(num2)).iterator();
                                                            zLoadAd = true;
                                                            c5128l3 = c5128l2;
                                                            while (true) {
                                                                if (it7.hasNext()) {
                                                                    c16493l = (C16493l) it7.next();
                                                                    map7 = map6;
                                                                    if (Log.isLoggable(c17417l.mo200else().m2266l(), 2)) {
                                                                        C14906l c14906lM2267l6 = c17417l.mo200else().m2267l();
                                                                        if (c16493l.tapsense()) {
                                                                            numValueOf4 = Integer.valueOf(c16493l.Signature());
                                                                        } else {
                                                                            numValueOf4 = null;
                                                                        }
                                                                        c14906lM2267l6.amazon("Evaluating filter. audience, filter, property", num2, numValueOf4, c17417l.subs().crashlytics(c16493l.license()));
                                                                        c17417l.mo200else().m2267l().loadAd(c6901l.m2113try().m3722l(c16493l), "Filter definition");
                                                                    }
                                                                    if (c16493l.tapsense()) {
                                                                    }
                                                                    C14906l c14906lM2263l6 = c17417l.mo200else().m2263l();
                                                                    C6327l c6327lM2260l6 = C8118l.m2260l(this.f26230l);
                                                                    if (c16493l.tapsense()) {
                                                                        numValueOf3 = Integer.valueOf(c16493l.Signature());
                                                                    } else {
                                                                        numValueOf3 = null;
                                                                    }
                                                                    c14906lM2263l6.crashlytics(c6327lM2260l6, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                                    this.f26232l.add(num2);
                                                                    map6 = map7;
                                                                    c5128l2 = c5128l3;
                                                                    it6 = it6;
                                                                } else {
                                                                    map7 = map6;
                                                                    c5128l3 = c5128l3;
                                                                    it6 = it6;
                                                                }
                                                                if (!zLoadAd) {
                                                                    this.f26232l.add(num2);
                                                                }
                                                                map6 = map7;
                                                                c5128l2 = c5128l3;
                                                                it6 = it6;
                                                                m3640l(num2).yandex(c13104l);
                                                                iIntValue = i2;
                                                                map6 = map7;
                                                                c5128l3 = c5128l3;
                                                                it6 = it6;
                                                            }
                                                        }
                                                        it4 = it5;
                                                        c5128l = c5128l2;
                                                    }
                                                }
                                                arrayList2 = new ArrayList();
                                                C5386l<Integer> c5386l4 = (C5386l) this.f26228l.keySet();
                                                c5386l4.removeAll(this.f26232l);
                                                while (r3.hasNext()) {
                                                    int iIntValue6 = num7.intValue();
                                                    C6360l c6360l5 = (C6360l) this.f26228l.get(num7);
                                                    AbstractC1051l.subs(c6360l5);
                                                    C6812l c6812lLoadAd4 = c6360l5.loadAd(iIntValue6);
                                                    arrayList2.add(c6812lLoadAd4);
                                                    c8648lM2104public2 = c6901l.m2104public();
                                                    c17417l3 = (C17417l) c8648lM2104public2.f833l;
                                                    str8 = this.f26230l;
                                                    C0450l c0450lLicense4 = c6812lLoadAd4.license();
                                                    c8648lM2104public2.m2927l();
                                                    c8648lM2104public2.mo211l();
                                                    AbstractC1051l.billing(str8);
                                                    AbstractC1051l.subs(c0450lLicense4);
                                                    byte[] bArrYandex4 = c0450lLicense4.yandex();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str8);
                                                    contentValues.put(str5, num7);
                                                    contentValues.put("current_results", bArrYandex4);
                                                    if (c8648lM2104public2.m2395l().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        c17417l3.mo200else().m2264l().loadAd(C8118l.m2260l(str8), "Failed to insert filter results (got -1). appId");
                                                    }
                                                }
                                                return arrayList2;
                                            }
                                        }
                                        r111.close();
                                        map = c11154l9;
                                    } else {
                                        str2 = "data";
                                        Query2.close();
                                    }
                                } catch (SQLiteException e24) {
                                    e = e24;
                                    str2 = "data";
                                }
                                C8648l c8648lM2104public14 = c6901l.m2104public();
                                obj = (C17417l) c8648lM2104public14.f833l;
                                r5 = this.f26230l;
                                c8648lM2104public14.m2927l();
                                c8648lM2104public14.mo211l();
                                AbstractC1051l.billing(r5);
                                cursorQuery = c8648lM2104public14.m2395l().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
                                if (cursorQuery.moveToFirst()) {
                                    Map map19 = Collections.EMPTY_MAP;
                                    cursorQuery.close();
                                    map2 = map19;
                                    str3 = "Failed to merge filter. appId";
                                    obj2 = "Database error querying filters. appId";
                                    obj = obj;
                                    r5 = r5;
                                } else {
                                    c11154l8 = new C11154l();
                                    r17 = obj;
                                    r21 = r5;
                                    while (true) {
                                        i3 = cursorQuery.getInt(0);
                                        C0450l c0450l13 = (C0450l) ((C3269l) C13718l.m3698l(C0450l.premium(), cursorQuery.getBlob(1))).amazon();
                                        Object objValueOf2 = Integer.valueOf(i3);
                                        c11154l8.put(objValueOf2, c0450l13);
                                        str3 = str14;
                                        obj2 = objM2260l;
                                        obj3 = objValueOf2;
                                        r6 = r21;
                                        if (!cursorQuery.moveToNext()) {
                                            break;
                                            break;
                                        }
                                        str14 = str3;
                                        objM2260l = obj2;
                                        r21 = r21;
                                    }
                                    cursorQuery.close();
                                    obj = obj3;
                                    r5 = r6;
                                    map2 = c11154l8;
                                }
                                if (map2.isEmpty()) {
                                    str5 = "audience_id";
                                    c17417l = c17417l6;
                                } else {
                                    HashSet<Integer> hashSet4 = new HashSet(map2.keySet());
                                    if (z3) {
                                        String str114 = this.f26230l;
                                        c8648lM2104public = c6901l.m2104public();
                                        str6 = this.f26230l;
                                        c8648lM2104public.m2927l();
                                        c8648lM2104public.mo211l();
                                        AbstractC1051l.billing(str6);
                                        c11154l3 = new C11154l();
                                        cursorRawQuery = c8648lM2104public.m2395l().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                                        if (cursorRawQuery.moveToFirst()) {
                                            do {
                                                numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                                                arrayList = (List) c11154l3.get(numValueOf2);
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                    c11154l3.put(numValueOf2, arrayList);
                                                }
                                                arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                            } while (cursorRawQuery.moveToNext());
                                        } else {
                                            c11154l3 = Collections.EMPTY_MAP;
                                        }
                                        cursorRawQuery.close();
                                        r0 = c11154l3;
                                        AbstractC1051l.billing(str114);
                                        c11154l4 = new C11154l();
                                        if (!map2.isEmpty()) {
                                            it2 = map2.keySet().iterator();
                                            while (it2.hasNext()) {
                                                num = (Integer) it2.next();
                                                num.getClass();
                                                c0450l3 = (C0450l) map2.get(num);
                                                list4 = (List) r0.get(num);
                                                if (list4 != null || list4.isEmpty()) {
                                                    r18 = r0;
                                                    it3 = it2;
                                                    c17417l2 = c17417l6;
                                                    c11154l4.put(num, c0450l3);
                                                    r0 = r18;
                                                    str15 = str15;
                                                    it2 = it3;
                                                    c17417l6 = c17417l2;
                                                } else {
                                                    ?? r112 = r0;
                                                    it3 = it2;
                                                    List listM3713l = c6901l.m2113try().m3713l((InterfaceC11831l) c0450l3.license(), list4);
                                                    if (listM3713l.isEmpty()) {
                                                        r0 = r112;
                                                        it2 = it3;
                                                    } else {
                                                        C3269l c3269l = (C3269l) c0450l3.firebase();
                                                        c3269l.subs();
                                                        c3269l.loadAd();
                                                        ((C0450l) c3269l.f20498l).m545throws(listM3713l);
                                                        List listM3713l2 = c6901l.m2113try().m3713l((InterfaceC11831l) c0450l3.tapsense(), list4);
                                                        c3269l.admob();
                                                        c3269l.loadAd();
                                                        ((C0450l) c3269l.f20498l).appmetrica(listM3713l2);
                                                        ArrayList arrayList6 = new ArrayList();
                                                        Iterator it10 = c0450l3.ad().iterator();
                                                        while (it10.hasNext()) {
                                                            Iterator it11 = it10;
                                                            C16986l c16986l2 = (C16986l) it10.next();
                                                            C17417l c17417l12 = c17417l6;
                                                            if (!list4.contains(Integer.valueOf(c16986l2.Signature()))) {
                                                                arrayList6.add(c16986l2);
                                                            }
                                                            it10 = it11;
                                                            c17417l6 = c17417l12;
                                                        }
                                                        c17417l2 = c17417l6;
                                                        c3269l.isPro();
                                                        c3269l.loadAd();
                                                        ((C0450l) c3269l.f20498l).m544synchronized(arrayList6);
                                                        ArrayList arrayList7 = new ArrayList();
                                                        for (C8888l c8888l2 : c0450l3.isVip()) {
                                                            if (!list4.contains(Integer.valueOf(c8888l2.Signature()))) {
                                                                arrayList7.add(c8888l2);
                                                            }
                                                        }
                                                        c3269l.firebase();
                                                        c3269l.loadAd();
                                                        ((C0450l) c3269l.f20498l).m546volatile(arrayList7);
                                                        c11154l4.put(num, (C0450l) c3269l.amazon());
                                                        r18 = r112;
                                                        r0 = r18;
                                                        str15 = str15;
                                                        it2 = it3;
                                                        c17417l6 = c17417l2;
                                                    }
                                                }
                                            }
                                        }
                                        str4 = str15;
                                        c17417l = c17417l6;
                                        map3 = c11154l4;
                                    } else {
                                        str4 = "audience_id";
                                        c17417l = c17417l6;
                                        map3 = map2;
                                    }
                                    map5 = map3;
                                    map4 = map2;
                                    while (r17.hasNext()) {
                                        num4.getClass();
                                        c0450l = (C0450l) map5.get(num4);
                                        bitSet = new BitSet();
                                        bitSet2 = new BitSet();
                                        c11154l = new C11154l();
                                        if (c0450l != null && c0450l.advert() != 0) {
                                            while (r3.hasNext()) {
                                                if (c16986l.tapsense()) {
                                                    C0450l c0450l14 = c0450l;
                                                    Integer numValueOf13 = Integer.valueOf(c16986l.Signature());
                                                    if (c16986l.license()) {
                                                        lValueOf = Long.valueOf(c16986l.pro());
                                                    } else {
                                                        lValueOf = null;
                                                    }
                                                    c11154l.put(numValueOf13, lValueOf);
                                                    c0450l = c0450l14;
                                                }
                                            }
                                        }
                                        c0450l2 = c0450l;
                                        c11154l2 = new C11154l();
                                        if (c0450l2 != null && c0450l2.signatures() != 0) {
                                            it = c0450l2.isVip().iterator();
                                            while (it.hasNext()) {
                                                c8888l = (C8888l) it.next();
                                                if (!c8888l.tapsense() && c8888l.pro() > 0) {
                                                    c11154l2.put(Integer.valueOf(c8888l.Signature()), Long.valueOf(c8888l.ad(c8888l.pro() - 1)));
                                                    it = it;
                                                    map5 = map5;
                                                }
                                            }
                                        }
                                        Map map110 = map5;
                                        if (c0450l2 != null) {
                                            i = 0;
                                            while (i < c0450l2.Signature() * 64) {
                                                if (C13718l.m3689l((InterfaceC11831l) c0450l2.tapsense(), i)) {
                                                    z4 = zM1682l;
                                                    c17417l.mo200else().m2267l().crashlytics(num4, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                                                    bitSet2.set(i);
                                                    if (C13718l.m3689l((InterfaceC11831l) c0450l2.license(), i)) {
                                                        bitSet.set(i);
                                                    }
                                                    i++;
                                                    zM1682l = z4;
                                                } else {
                                                    z4 = zM1682l;
                                                }
                                                c11154l.remove(Integer.valueOf(i));
                                                i++;
                                                zM1682l = z4;
                                            }
                                        }
                                        boolean z10 = zM1682l;
                                        C0450l c0450l15 = (C0450l) map4.get(num4);
                                        if (zM1682l2 && z10 && (list3 = (List) map.get(num4)) != null && this.f26231l != null && this.f26229l != null) {
                                            while (r2.hasNext()) {
                                                int iSignature6 = c9540l2.Signature();
                                                Integer num11 = num4;
                                                jLongValue = this.f26231l.longValue() / 1000;
                                                if (c9540l2.applovin()) {
                                                    jLongValue = this.f26229l.longValue() / 1000;
                                                }
                                                numValueOf = Integer.valueOf(iSignature6);
                                                if (c11154l.containsKey(numValueOf)) {
                                                    c11154l.put(numValueOf, Long.valueOf(jLongValue));
                                                }
                                                if (c11154l2.containsKey(numValueOf)) {
                                                    c11154l2.put(numValueOf, Long.valueOf(jLongValue));
                                                }
                                                num4 = num11;
                                            }
                                        }
                                        this.f26228l.put(num4, new C6360l(this, this.f26230l, c0450l15, bitSet, bitSet2, c11154l, c11154l2));
                                        map = map;
                                        zM1682l = z10;
                                        map4 = map4;
                                        zM1682l2 = zM1682l2;
                                        str3 = str3;
                                        map5 = map110;
                                    }
                                    str5 = str4;
                                }
                                str7 = str2;
                                String str115 = str3;
                                ?? r14 = obj2;
                                if (!list.isEmpty()) {
                                    c0093l = new C0093l(this);
                                    c11154l6 = new C11154l();
                                    while (r17.hasNext()) {
                                        c1841lAmazon = c0093l.amazon(this.f26230l, c1841l);
                                        if (c1841lAmazon != null) {
                                            c6491lM2365l = c6901l.m2104public().m2365l(this.f26230l, c1841l, c1841lAmazon.advert());
                                            c6901l.m2104public().m2388l("events", c6491lM2365l);
                                            if (z) {
                                                j = c6491lM2365l.crashlytics;
                                                strAdvert = c1841lAmazon.advert();
                                                map8 = (Map) c11154l6.get(strAdvert);
                                                if (map8 == null) {
                                                    C8648l c8648lM2104public15 = c6901l.m2104public();
                                                    C17417l c17417l13 = (C17417l) c8648lM2104public15.f833l;
                                                    str11 = this.f26230l;
                                                    c8648lM2104public15.m2927l();
                                                    c8648lM2104public15.mo211l();
                                                    AbstractC1051l.billing(str11);
                                                    AbstractC1051l.billing(strAdvert);
                                                    c11154l7 = new C11154l();
                                                    Query = c8648lM2104public15.m2395l().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strAdvert}, null, null, null);
                                                    if (Query.moveToFirst()) {
                                                        str12 = str11;
                                                        Query = Query;
                                                        r46 = list;
                                                        while (true) {
                                                            C9540l c9540l12 = (C9540l) ((C6122l) C13718l.m3698l(C9540l.m2679throws(), Query.getBlob(1))).amazon();
                                                            numValueOf6 = Integer.valueOf(Query.getInt(0));
                                                            list6 = (List) c11154l7.get(numValueOf6);
                                                            if (list6 == null) {
                                                                r46 = Query;
                                                                arrayList4 = new ArrayList();
                                                                c11154l7.put(numValueOf6, arrayList4);
                                                                r48 = r46;
                                                            } else {
                                                                r48 = Query;
                                                                arrayList4 = list6;
                                                            }
                                                            arrayList4.add(c9540l12);
                                                            r47 = r48;
                                                            if (!r47.moveToNext()) {
                                                                break;
                                                                break;
                                                            }
                                                            Query = r47;
                                                            r46 = r47;
                                                        }
                                                        r47.close();
                                                        map8 = c11154l7;
                                                        r43 = r47;
                                                    } else {
                                                        ?? r413 = Query;
                                                        map8 = Collections.EMPTY_MAP;
                                                        r413.close();
                                                        r43 = r413;
                                                    }
                                                    c11154l6.put(strAdvert, map8);
                                                    list = r43;
                                                } else {
                                                    list = list;
                                                }
                                                while (r19.hasNext()) {
                                                    iIntValue2 = num6.intValue();
                                                    if (this.f26232l.contains(num6)) {
                                                        c17417l.mo200else().m2267l().loadAd(num6, "Skipping failed audience ID");
                                                    } else {
                                                        it8 = ((List) map8.get(num6)).iterator();
                                                        zYandex = true;
                                                        while (true) {
                                                            if (!it8.hasNext()) {
                                                                map9 = map8;
                                                                c0093l2 = c0093l;
                                                                num3 = num6;
                                                                break;
                                                            }
                                                            C9540l c9540l13 = (C9540l) it8.next();
                                                            c0093l2 = c0093l;
                                                            num3 = num6;
                                                            map9 = map8;
                                                            c13104l2 = new C13104l(this, this.f26230l, iIntValue2, c9540l13, 0);
                                                            Long l13 = this.f26229l;
                                                            Long l14 = this.f26231l;
                                                            iSignature = c9540l13.Signature();
                                                            c6360l = (C6360l) this.f26228l.get(num3);
                                                            if (c6360l == null) {
                                                                z5 = false;
                                                            } else {
                                                                z5 = c6360l.amazon.get(iSignature);
                                                            }
                                                            zYandex = c13104l2.yandex(l13, l14, c1841lAmazon, j, c6491lM2365l, z5);
                                                            if (!zYandex) {
                                                                this.f26232l.add(num3);
                                                                break;
                                                            }
                                                            m3640l(num3).yandex(c13104l2);
                                                            num6 = num3;
                                                            map8 = map9;
                                                            c0093l = c0093l2;
                                                        }
                                                        if (!zYandex) {
                                                            this.f26232l.add(num3);
                                                        }
                                                        c0093l = c0093l2;
                                                        map8 = map9;
                                                    }
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                if (!z) {
                                    return new ArrayList();
                                }
                                if (!list2.isEmpty()) {
                                    C11154l c11154l14 = new C11154l();
                                    it4 = list2.iterator();
                                    c5128l = c11154l14;
                                    while (it4.hasNext()) {
                                        C8252l c8252l5 = (C8252l) it4.next();
                                        strLicense = c8252l5.license();
                                        map6 = (Map) c5128l.get(strLicense);
                                        if (map6 == null) {
                                            C8648l c8648lM2104public16 = c6901l.m2104public();
                                            c17417l4 = (C17417l) c8648lM2104public16.f833l;
                                            str9 = this.f26230l;
                                            c8648lM2104public16.m2927l();
                                            c8648lM2104public16.mo211l();
                                            AbstractC1051l.billing(str9);
                                            AbstractC1051l.billing(strLicense);
                                            c11154l5 = new C11154l();
                                            cursorQuery2 = c8648lM2104public16.m2395l().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strLicense}, null, null, null);
                                            if (cursorQuery2.moveToFirst()) {
                                                it5 = it4;
                                                while (true) {
                                                    C16493l c16493l6 = (C16493l) ((C14364l) C13718l.m3698l(C16493l.premium(), cursorQuery2.getBlob(1))).amazon();
                                                    numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                                                    list5 = (List) c11154l5.get(numValueOf5);
                                                    if (list5 == null) {
                                                        c17417l5 = c17417l4;
                                                        arrayList3 = new ArrayList();
                                                        c11154l5.put(numValueOf5, arrayList3);
                                                    } else {
                                                        c17417l5 = c17417l4;
                                                        arrayList3 = list5;
                                                    }
                                                    arrayList3.add(c16493l6);
                                                    str10 = str9;
                                                    if (!cursorQuery2.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    c17417l4 = c17417l5;
                                                    str9 = str10;
                                                }
                                                cursorQuery2.close();
                                                map6 = c11154l5;
                                            } else {
                                                it5 = it4;
                                                map6 = Collections.EMPTY_MAP;
                                                cursorQuery2.close();
                                            }
                                            c5128l.put(strLicense, map6);
                                        } else {
                                            it5 = it4;
                                        }
                                        it6 = map6.keySet().iterator();
                                        c5128l2 = c5128l;
                                        while (it6.hasNext()) {
                                            num2 = (Integer) it6.next();
                                            iIntValue = num2.intValue();
                                            if (this.f26232l.contains(num2)) {
                                                c17417l.mo200else().m2267l().loadAd(num2, "Skipping failed audience ID");
                                                break;
                                                break;
                                            }
                                            it7 = ((List) map6.get(num2)).iterator();
                                            zLoadAd = true;
                                            c5128l3 = c5128l2;
                                            while (true) {
                                                if (it7.hasNext()) {
                                                    c16493l = (C16493l) it7.next();
                                                    map7 = map6;
                                                    if (Log.isLoggable(c17417l.mo200else().m2266l(), 2)) {
                                                        C14906l c14906lM2267l7 = c17417l.mo200else().m2267l();
                                                        if (c16493l.tapsense()) {
                                                            numValueOf4 = Integer.valueOf(c16493l.Signature());
                                                        } else {
                                                            numValueOf4 = null;
                                                        }
                                                        c14906lM2267l7.amazon("Evaluating filter. audience, filter, property", num2, numValueOf4, c17417l.subs().crashlytics(c16493l.license()));
                                                        c17417l.mo200else().m2267l().loadAd(c6901l.m2113try().m3722l(c16493l), "Filter definition");
                                                    }
                                                    if (c16493l.tapsense() || c16493l.Signature() > 256) {
                                                        C14906l c14906lM2263l7 = c17417l.mo200else().m2263l();
                                                        C6327l c6327lM2260l7 = C8118l.m2260l(this.f26230l);
                                                        if (c16493l.tapsense()) {
                                                            numValueOf3 = Integer.valueOf(c16493l.Signature());
                                                        } else {
                                                            numValueOf3 = null;
                                                        }
                                                        c14906lM2263l7.crashlytics(c6327lM2260l7, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                                                        this.f26232l.add(num2);
                                                        map6 = map7;
                                                        c5128l2 = c5128l3;
                                                        it6 = it6;
                                                    } else {
                                                        i2 = iIntValue;
                                                        c13104l = new C13104l(this, this.f26230l, i2, c16493l, 1);
                                                        Long l15 = this.f26229l;
                                                        Long l16 = this.f26231l;
                                                        int iSignature7 = c16493l.Signature();
                                                        C6360l c6360l6 = (C6360l) this.f26228l.get(num2);
                                                        zLoadAd = c13104l.loadAd(l15, l16, c8252l5, c6360l6 == null ? false : c6360l6.amazon.get(iSignature7));
                                                        if (zLoadAd) {
                                                            m3640l(num2).yandex(c13104l);
                                                            iIntValue = i2;
                                                            map6 = map7;
                                                            c5128l3 = c5128l3;
                                                            it6 = it6;
                                                        } else {
                                                            this.f26232l.add(num2);
                                                            c5128l3 = c5128l3;
                                                        }
                                                    }
                                                } else {
                                                    map7 = map6;
                                                    c5128l3 = c5128l3;
                                                    it6 = it6;
                                                }
                                                if (!zLoadAd) {
                                                    this.f26232l.add(num2);
                                                }
                                                map6 = map7;
                                                c5128l2 = c5128l3;
                                                it6 = it6;
                                            }
                                        }
                                        it4 = it5;
                                        c5128l = c5128l2;
                                    }
                                }
                                arrayList2 = new ArrayList();
                                C5386l<Integer> c5386l5 = (C5386l) this.f26228l.keySet();
                                c5386l5.removeAll(this.f26232l);
                                while (r3.hasNext()) {
                                    int iIntValue7 = num7.intValue();
                                    C6360l c6360l7 = (C6360l) this.f26228l.get(num7);
                                    AbstractC1051l.subs(c6360l7);
                                    C6812l c6812lLoadAd5 = c6360l7.loadAd(iIntValue7);
                                    arrayList2.add(c6812lLoadAd5);
                                    c8648lM2104public2 = c6901l.m2104public();
                                    c17417l3 = (C17417l) c8648lM2104public2.f833l;
                                    str8 = this.f26230l;
                                    C0450l c0450lLicense5 = c6812lLoadAd5.license();
                                    c8648lM2104public2.m2927l();
                                    c8648lM2104public2.mo211l();
                                    AbstractC1051l.billing(str8);
                                    AbstractC1051l.subs(c0450lLicense5);
                                    byte[] bArrYandex5 = c0450lLicense5.yandex();
                                    contentValues = new ContentValues();
                                    contentValues.put("app_id", str8);
                                    contentValues.put(str5, num7);
                                    contentValues.put("current_results", bArrYandex5);
                                    if (c8648lM2104public2.m2395l().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                        c17417l3.mo200else().m2264l().loadAd(C8118l.m2260l(str8), "Failed to insert filter results (got -1). appId");
                                    }
                                }
                                return arrayList2;
                            } catch (Throwable th12) {
                                th = th12;
                                r19 = Query2;
                            }
                        } catch (SQLiteException e25) {
                            e = e25;
                            str2 = "data";
                            r9 = 0;
                        } catch (Throwable th13) {
                            th = th13;
                            r9 = 0;
                        }
                    } else {
                        z3 = z2;
                        str2 = "data";
                    }
                    if (cursorQuery.moveToFirst()) {
                        Map map111 = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        map2 = map111;
                        str3 = "Failed to merge filter. appId";
                        obj2 = "Database error querying filters. appId";
                        obj = obj;
                        r5 = r5;
                    } else {
                        c11154l8 = new C11154l();
                        r17 = obj;
                        r21 = r5;
                        while (true) {
                            i3 = cursorQuery.getInt(0);
                            C0450l c0450l16 = (C0450l) ((C3269l) C13718l.m3698l(C0450l.premium(), cursorQuery.getBlob(1))).amazon();
                            Object objValueOf3 = Integer.valueOf(i3);
                            c11154l8.put(objValueOf3, c0450l16);
                            str3 = str14;
                            obj2 = objM2260l;
                            obj3 = objValueOf3;
                            r6 = r21;
                            if (!cursorQuery.moveToNext()) {
                                break;
                                break;
                            }
                            str14 = str3;
                            objM2260l = obj2;
                            r21 = r21;
                        }
                        cursorQuery.close();
                        obj = obj3;
                        r5 = r6;
                        map2 = c11154l8;
                    }
                } catch (Throwable th14) {
                    th = th14;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e26) {
                e = e26;
                r17 = obj;
                r21 = r5;
            }
            cursorQuery = c8648lM2104public14.m2395l().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{r5}, null, null, null);
        } catch (SQLiteException e27) {
            e = e27;
            r17 = obj;
            str3 = "Failed to merge filter. appId";
            obj2 = "Database error querying filters. appId";
            r21 = r5;
            cursorQuery = null;
        } catch (Throwable th15) {
            th = th15;
            cursorQuery = null;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        map = map10;
        C8648l c8648lM2104public17 = c6901l.m2104public();
        obj = (C17417l) c8648lM2104public17.f833l;
        r5 = this.f26230l;
        c8648lM2104public17.m2927l();
        c8648lM2104public17.mo211l();
        AbstractC1051l.billing(r5);
        if (map2.isEmpty()) {
            str5 = "audience_id";
            c17417l = c17417l6;
        } else {
            HashSet<Integer> hashSet5 = new HashSet(map2.keySet());
            if (z3) {
                String str116 = this.f26230l;
                c8648lM2104public = c6901l.m2104public();
                str6 = this.f26230l;
                c8648lM2104public.m2927l();
                c8648lM2104public.mo211l();
                AbstractC1051l.billing(str6);
                c11154l3 = new C11154l();
                cursorRawQuery = c8648lM2104public.m2395l().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf2 = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) c11154l3.get(numValueOf2);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            c11154l3.put(numValueOf2, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                } else {
                    c11154l3 = Collections.EMPTY_MAP;
                }
                cursorRawQuery.close();
                r0 = c11154l3;
                AbstractC1051l.billing(str116);
                c11154l4 = new C11154l();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.getClass();
                        c0450l3 = (C0450l) map2.get(num);
                        list4 = (List) r0.get(num);
                        if (list4 != null) {
                        }
                        r18 = r0;
                        it3 = it2;
                        c17417l2 = c17417l6;
                        c11154l4.put(num, c0450l3);
                        r0 = r18;
                        str15 = str15;
                        it2 = it3;
                        c17417l6 = c17417l2;
                    }
                }
                str4 = str15;
                c17417l = c17417l6;
                map3 = c11154l4;
            } else {
                str4 = "audience_id";
                c17417l = c17417l6;
                map3 = map2;
            }
            map5 = map3;
            map4 = map2;
            while (r17.hasNext()) {
                num4.getClass();
                c0450l = (C0450l) map5.get(num4);
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                c11154l = new C11154l();
                if (c0450l != null) {
                    while (r3.hasNext()) {
                        if (c16986l.tapsense()) {
                            C0450l c0450l17 = c0450l;
                            Integer numValueOf14 = Integer.valueOf(c16986l.Signature());
                            if (c16986l.license()) {
                                lValueOf = Long.valueOf(c16986l.pro());
                            } else {
                                lValueOf = null;
                            }
                            c11154l.put(numValueOf14, lValueOf);
                            c0450l = c0450l17;
                        }
                    }
                }
                c0450l2 = c0450l;
                c11154l2 = new C11154l();
                if (c0450l2 != null) {
                    it = c0450l2.isVip().iterator();
                    while (it.hasNext()) {
                        c8888l = (C8888l) it.next();
                        if (!c8888l.tapsense()) {
                        }
                    }
                }
                Map map112 = map5;
                if (c0450l2 != null) {
                    i = 0;
                    while (i < c0450l2.Signature() * 64) {
                        if (C13718l.m3689l((InterfaceC11831l) c0450l2.tapsense(), i)) {
                            z4 = zM1682l;
                            c17417l.mo200else().m2267l().crashlytics(num4, Integer.valueOf(i), "Filter already evaluated. audience ID, filter ID");
                            bitSet2.set(i);
                            if (C13718l.m3689l((InterfaceC11831l) c0450l2.license(), i)) {
                                bitSet.set(i);
                            }
                            i++;
                            zM1682l = z4;
                        } else {
                            z4 = zM1682l;
                        }
                        c11154l.remove(Integer.valueOf(i));
                        i++;
                        zM1682l = z4;
                    }
                }
                boolean z11 = zM1682l;
                C0450l c0450l18 = (C0450l) map4.get(num4);
                if (zM1682l2) {
                    while (r2.hasNext()) {
                        int iSignature8 = c9540l2.Signature();
                        Integer num12 = num4;
                        jLongValue = this.f26231l.longValue() / 1000;
                        if (c9540l2.applovin()) {
                            jLongValue = this.f26229l.longValue() / 1000;
                        }
                        numValueOf = Integer.valueOf(iSignature8);
                        if (c11154l.containsKey(numValueOf)) {
                            c11154l.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        if (c11154l2.containsKey(numValueOf)) {
                            c11154l2.put(numValueOf, Long.valueOf(jLongValue));
                        }
                        num4 = num12;
                    }
                }
                this.f26228l.put(num4, new C6360l(this, this.f26230l, c0450l18, bitSet, bitSet2, c11154l, c11154l2));
                map = map;
                zM1682l = z11;
                map4 = map4;
                zM1682l2 = zM1682l2;
                str3 = str3;
                map5 = map112;
            }
            str5 = str4;
        }
        str7 = str2;
        String str117 = str3;
        ?? r15 = obj2;
        if (!list.isEmpty()) {
            c0093l = new C0093l(this);
            c11154l6 = new C11154l();
            while (r17.hasNext()) {
                c1841lAmazon = c0093l.amazon(this.f26230l, c1841l);
                if (c1841lAmazon != null) {
                    c6491lM2365l = c6901l.m2104public().m2365l(this.f26230l, c1841l, c1841lAmazon.advert());
                    c6901l.m2104public().m2388l("events", c6491lM2365l);
                    if (z) {
                        j = c6491lM2365l.crashlytics;
                        strAdvert = c1841lAmazon.advert();
                        map8 = (Map) c11154l6.get(strAdvert);
                        if (map8 == null) {
                            C8648l c8648lM2104public18 = c6901l.m2104public();
                            C17417l c17417l14 = (C17417l) c8648lM2104public18.f833l;
                            str11 = this.f26230l;
                            c8648lM2104public18.m2927l();
                            c8648lM2104public18.mo211l();
                            AbstractC1051l.billing(str11);
                            AbstractC1051l.billing(strAdvert);
                            c11154l7 = new C11154l();
                            Query = c8648lM2104public18.m2395l().query("event_filters", new String[]{str5, str7}, "app_id=? AND event_name=?", new String[]{str11, strAdvert}, null, null, null);
                            if (Query.moveToFirst()) {
                                str12 = str11;
                                Query = Query;
                                r46 = list;
                                while (true) {
                                    C9540l c9540l14 = (C9540l) ((C6122l) C13718l.m3698l(C9540l.m2679throws(), Query.getBlob(1))).amazon();
                                    numValueOf6 = Integer.valueOf(Query.getInt(0));
                                    list6 = (List) c11154l7.get(numValueOf6);
                                    if (list6 == null) {
                                        r46 = Query;
                                        arrayList4 = new ArrayList();
                                        c11154l7.put(numValueOf6, arrayList4);
                                        r48 = r46;
                                    } else {
                                        r48 = Query;
                                        arrayList4 = list6;
                                    }
                                    arrayList4.add(c9540l14);
                                    r47 = r48;
                                    if (!r47.moveToNext()) {
                                        break;
                                        break;
                                    }
                                    Query = r47;
                                    r46 = r47;
                                }
                                r47.close();
                                map8 = c11154l7;
                                r43 = r47;
                            } else {
                                ?? r414 = Query;
                                map8 = Collections.EMPTY_MAP;
                                r414.close();
                                r43 = r414;
                            }
                            c11154l6.put(strAdvert, map8);
                            list = r43;
                        } else {
                            list = list;
                        }
                        while (r19.hasNext()) {
                            iIntValue2 = num6.intValue();
                            if (this.f26232l.contains(num6)) {
                                c17417l.mo200else().m2267l().loadAd(num6, "Skipping failed audience ID");
                            } else {
                                it8 = ((List) map8.get(num6)).iterator();
                                zYandex = true;
                                while (true) {
                                    if (!it8.hasNext()) {
                                        map9 = map8;
                                        c0093l2 = c0093l;
                                        num3 = num6;
                                        break;
                                    }
                                    C9540l c9540l15 = (C9540l) it8.next();
                                    c0093l2 = c0093l;
                                    num3 = num6;
                                    map9 = map8;
                                    c13104l2 = new C13104l(this, this.f26230l, iIntValue2, c9540l15, 0);
                                    Long l17 = this.f26229l;
                                    Long l18 = this.f26231l;
                                    iSignature = c9540l15.Signature();
                                    c6360l = (C6360l) this.f26228l.get(num3);
                                    if (c6360l == null) {
                                        z5 = false;
                                    } else {
                                        z5 = c6360l.amazon.get(iSignature);
                                    }
                                    zYandex = c13104l2.yandex(l17, l18, c1841lAmazon, j, c6491lM2365l, z5);
                                    if (!zYandex) {
                                        this.f26232l.add(num3);
                                        break;
                                    }
                                    m3640l(num3).yandex(c13104l2);
                                    num6 = num3;
                                    map8 = map9;
                                    c0093l = c0093l2;
                                }
                                if (!zYandex) {
                                    this.f26232l.add(num3);
                                }
                                c0093l = c0093l2;
                                map8 = map9;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!z) {
            return new ArrayList();
        }
        if (!list2.isEmpty()) {
            C11154l c11154l15 = new C11154l();
            it4 = list2.iterator();
            c5128l = c11154l15;
            while (it4.hasNext()) {
                C8252l c8252l6 = (C8252l) it4.next();
                strLicense = c8252l6.license();
                map6 = (Map) c5128l.get(strLicense);
                if (map6 == null) {
                    C8648l c8648lM2104public19 = c6901l.m2104public();
                    c17417l4 = (C17417l) c8648lM2104public19.f833l;
                    str9 = this.f26230l;
                    c8648lM2104public19.m2927l();
                    c8648lM2104public19.mo211l();
                    AbstractC1051l.billing(str9);
                    AbstractC1051l.billing(strLicense);
                    c11154l5 = new C11154l();
                    cursorQuery2 = c8648lM2104public19.m2395l().query("property_filters", new String[]{str5, str7}, "app_id=? AND property_name=?", new String[]{str9, strLicense}, null, null, null);
                    if (cursorQuery2.moveToFirst()) {
                        it5 = it4;
                        while (true) {
                            C16493l c16493l7 = (C16493l) ((C14364l) C13718l.m3698l(C16493l.premium(), cursorQuery2.getBlob(1))).amazon();
                            numValueOf5 = Integer.valueOf(cursorQuery2.getInt(0));
                            list5 = (List) c11154l5.get(numValueOf5);
                            if (list5 == null) {
                                c17417l5 = c17417l4;
                                arrayList3 = new ArrayList();
                                c11154l5.put(numValueOf5, arrayList3);
                            } else {
                                c17417l5 = c17417l4;
                                arrayList3 = list5;
                            }
                            arrayList3.add(c16493l7);
                            str10 = str9;
                            if (!cursorQuery2.moveToNext()) {
                                break;
                                break;
                            }
                            c17417l4 = c17417l5;
                            str9 = str10;
                        }
                        cursorQuery2.close();
                        map6 = c11154l5;
                    } else {
                        it5 = it4;
                        map6 = Collections.EMPTY_MAP;
                        cursorQuery2.close();
                    }
                    c5128l.put(strLicense, map6);
                } else {
                    it5 = it4;
                }
                it6 = map6.keySet().iterator();
                c5128l2 = c5128l;
                while (it6.hasNext()) {
                    num2 = (Integer) it6.next();
                    iIntValue = num2.intValue();
                    if (this.f26232l.contains(num2)) {
                        c17417l.mo200else().m2267l().loadAd(num2, "Skipping failed audience ID");
                        break;
                        break;
                    }
                    it7 = ((List) map6.get(num2)).iterator();
                    zLoadAd = true;
                    c5128l3 = c5128l2;
                    while (true) {
                        if (it7.hasNext()) {
                            c16493l = (C16493l) it7.next();
                            map7 = map6;
                            if (Log.isLoggable(c17417l.mo200else().m2266l(), 2)) {
                                C14906l c14906lM2267l8 = c17417l.mo200else().m2267l();
                                if (c16493l.tapsense()) {
                                    numValueOf4 = Integer.valueOf(c16493l.Signature());
                                } else {
                                    numValueOf4 = null;
                                }
                                c14906lM2267l8.amazon("Evaluating filter. audience, filter, property", num2, numValueOf4, c17417l.subs().crashlytics(c16493l.license()));
                                c17417l.mo200else().m2267l().loadAd(c6901l.m2113try().m3722l(c16493l), "Filter definition");
                            }
                            if (c16493l.tapsense()) {
                            }
                            C14906l c14906lM2263l8 = c17417l.mo200else().m2263l();
                            C6327l c6327lM2260l8 = C8118l.m2260l(this.f26230l);
                            if (c16493l.tapsense()) {
                                numValueOf3 = Integer.valueOf(c16493l.Signature());
                            } else {
                                numValueOf3 = null;
                            }
                            c14906lM2263l8.crashlytics(c6327lM2260l8, String.valueOf(numValueOf3), "Invalid property filter ID. appId, id");
                            this.f26232l.add(num2);
                            map6 = map7;
                            c5128l2 = c5128l3;
                            it6 = it6;
                        } else {
                            map7 = map6;
                            c5128l3 = c5128l3;
                            it6 = it6;
                        }
                        if (!zLoadAd) {
                            this.f26232l.add(num2);
                        }
                        map6 = map7;
                        c5128l2 = c5128l3;
                        it6 = it6;
                        m3640l(num2).yandex(c13104l);
                        iIntValue = i2;
                        map6 = map7;
                        c5128l3 = c5128l3;
                        it6 = it6;
                    }
                }
                it4 = it5;
                c5128l = c5128l2;
            }
        }
        arrayList2 = new ArrayList();
        C5386l<Integer> c5386l6 = (C5386l) this.f26228l.keySet();
        c5386l6.removeAll(this.f26232l);
        while (r3.hasNext()) {
            int iIntValue8 = num7.intValue();
            C6360l c6360l8 = (C6360l) this.f26228l.get(num7);
            AbstractC1051l.subs(c6360l8);
            C6812l c6812lLoadAd6 = c6360l8.loadAd(iIntValue8);
            arrayList2.add(c6812lLoadAd6);
            c8648lM2104public2 = c6901l.m2104public();
            c17417l3 = (C17417l) c8648lM2104public2.f833l;
            str8 = this.f26230l;
            C0450l c0450lLicense6 = c6812lLoadAd6.license();
            c8648lM2104public2.m2927l();
            c8648lM2104public2.mo211l();
            AbstractC1051l.billing(str8);
            AbstractC1051l.subs(c0450lLicense6);
            byte[] bArrYandex6 = c0450lLicense6.yandex();
            contentValues = new ContentValues();
            contentValues.put("app_id", str8);
            contentValues.put(str5, num7);
            contentValues.put("current_results", bArrYandex6);
            if (c8648lM2104public2.m2395l().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                c17417l3.mo200else().m2264l().loadAd(C8118l.m2260l(str8), "Failed to insert filter results (got -1). appId");
            }
        }
        return arrayList2;
    }

    @Override // defpackage.AbstractC10491l
    /* JADX INFO: renamed from: lَؙ۠ */
    public final void mo1780l() {
    }
}
